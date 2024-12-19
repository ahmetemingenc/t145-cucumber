package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TestotomasyonuStepdefinitions {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

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
}
