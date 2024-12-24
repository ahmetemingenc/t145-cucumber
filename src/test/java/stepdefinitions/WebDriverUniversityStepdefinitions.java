package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import pages.WebUniversityPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebDriverUniversityStepdefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();

    @When("login Portal'a kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", webUniversityPage.loginPortal);
    }
    @When("login Portal'a tiklar")
    public void login_portal_a_tiklar() {

        webUniversityPage.loginPortal.click();
    }
    @Then("acilan diger windowa gecer")
    public void acilan_diger_windowa_gecer() {

        ReusableMethods.switchToWindowByTitle(Driver.getDriver(), ConfigurationReader.getProperty("webUniAcilanSayfaTitle"));
    }
    @Then("username ve password kutularina fake degerler yazdirir")
    public void username_ve_password_kutularina_fake_degerler_yazdirir() {

        Faker faker = new Faker();

        webUniversityPage.usernameBox.sendKeys(faker.name().username());
        webUniversityPage.passwordBox.sendKeys(faker.internet().password());
    }
    @Then("webDriverUniversity login butonuna basar")
    public void web_driver_university_login_butonuna_basar() {

        webUniversityPage.loginButton.click();
    }
    @Then("popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String expectedAlertText) {

        String actualAlertText = Driver.getDriver().switchTo().alert().getText();

        Assertions.assertEquals(expectedAlertText, actualAlertText);
    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {

        Driver.getDriver().switchTo().alert().accept();
    }
    @When("ilk window'a geri doner")
    public void ilk_window_a_geri_doner() {

        ReusableMethods.switchToWindowByUrl(Driver.getDriver(), ConfigurationReader.getProperty("webUniUrl"));
    }
    @Then("ilk window'a donuldugunu test eder")
    public void ilk_window_a_donuldugunu_test_eder() {

        String expectedTitle = ConfigurationReader.getProperty("webUniHomePageTitle");
        String actualTitle = Driver.getDriver().getTitle();

        Assertions.assertEquals(expectedTitle, actualTitle);
    }
}
