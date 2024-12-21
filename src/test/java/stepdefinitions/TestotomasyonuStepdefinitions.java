package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.TestotomasyonuFormPage;
import pages.TestotomasyonuPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TestotomasyonuStepdefinitions {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
    TestotomasyonuFormPage testotomasyonuFormPage = new TestotomasyonuFormPage();

    @Given("kullanici testotomasyonu ana sayfaya gider")
    public void kullanici_testotomasyonu_ana_sayfaya_gider() {

        Driver.getDriver().get(ConfigurationReader.getProperty("toUrl"));
    }
    @Then("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {

        testotomasyonuPage.searchBox.sendKeys("phone" + Keys.ENTER);
    }
    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {

        String unExceptedResult = ConfigurationReader.getProperty("toUnexpectedResult");
        String actualResult = testotomasyonuPage.resultWebElement.getText();

        Assertions.assertNotEquals(unExceptedResult, actualResult);
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.quitDriver();
    }

    @Then("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {

        testotomasyonuPage.searchBox.sendKeys("dress" + Keys.ENTER);
    }

    @When("arama kutusuna baby yazip aratir")
    public void aramaKutusunaBabyYazipAratir() {

        testotomasyonuPage.searchBox.sendKeys("baby" + Keys.ENTER);
    }

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String elementToSearch) {

        testotomasyonuPage.searchBox.sendKeys(elementToSearch + Keys.ENTER);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int second) {

        ReusableMethods.wait(second);
    }

    @Then("account linkine tiklar")
    public void account_linkine_tiklar() {

        testotomasyonuPage.accountLink.click();
    }
    @When("email olarak {string} girer")
    public void email_olarak_girer(String configurationEmailType) {

        testotomasyonuPage.emailBox.sendKeys(ConfigurationReader.getProperty(configurationEmailType));
    }
    @When("password olarak {string} girer")
    public void password_olarak_girer(String configurationPasswordType) {

        testotomasyonuPage.passwordBox.sendKeys(ConfigurationReader.getProperty(configurationPasswordType));
    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {

        testotomasyonuPage.signInButton.click();
    }
    @Then("basarili olarak giris yapilabildigini test eder")
    public void basarili_olarak_giris_yapilabildigini_test_eder() {

        Assertions.assertTrue(testotomasyonuPage.logoutButton.isDisplayed());
    }
    @Then("logout butonuna basar")
    public void logout_butonuna_basar() {

        testotomasyonuPage.logoutButton.click();
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assertions.assertTrue(testotomasyonuPage.emailBox.isDisplayed());
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String configurationUrl) {

        Driver.getDriver().get(ConfigurationReader.getProperty(configurationUrl));
    }
    @Then("dogum tarihi ay acilir menuden {string} secer")
    public void dogum_tarihi_ay_acilir_menuden_secer(String ay) {

        Select select = new Select(testotomasyonuFormPage.ayDropdown);
        select.selectByVisibleText(ay);
    }
    @Then("secilen ayin {string} oldugunu test eder")
    public void secilen_ayin_oldugunu_test_eder(String ay) {

        String exceptedText = ay;
        String actualText = testotomasyonuFormPage.ayDropdown.getText();

        Assertions.assertEquals(exceptedText, actualText);
    }
    @When("acilir menude toplam {int} option oldugunu test eder")
    public void acilir_menude_toplam_option_oldugunu_test_eder(Integer numberOfOption) {

        Select select = new Select(testotomasyonuFormPage.ayDropdown);
        List<String> ayDropDownOptionsList = ReusableMethods.convertStringList(select.getOptions());

        int exceptedNumberOfOption = numberOfOption;
        int actualNumberOfOption = ayDropDownOptionsList.size();

        Assertions.assertEquals(exceptedNumberOfOption, actualNumberOfOption);
    }
}
