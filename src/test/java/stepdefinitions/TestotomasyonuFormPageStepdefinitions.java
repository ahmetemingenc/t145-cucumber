package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.Select;
import pages.TestotomasyonuFormPage;
import utilities.ReusableMethods;

import java.util.List;

public class TestotomasyonuFormPageStepdefinitions {

    TestotomasyonuFormPage testotomasyonuFormPage = new TestotomasyonuFormPage();
    Select select = new Select(testotomasyonuFormPage.ayDropdown);

    @Then("dogum tarihi ay acilir menuden {string} secer")
    public void dogum_tarihi_ay_acilir_menuden_secer(String ay) {

        select.selectByVisibleText(ay);
    }

    @Then("secilen ayin {string} oldugunu test eder")
    public void secilen_ayin_oldugunu_test_eder(String ay) {

        String actualText = select.getFirstSelectedOption().getText();

        Assertions.assertEquals(ay, actualText);
    }

    @When("acilir menude toplam {int} option oldugunu test eder")
    public void acilir_menude_toplam_option_oldugunu_test_eder(Integer numberOfOption) {

        List<String> ayDropDownOptionsList = ReusableMethods.convertStringList(select.getOptions());

        int exceptedNumberOfOption = numberOfOption;
        int actualNumberOfOption = ayDropDownOptionsList.size();

        Assertions.assertEquals(exceptedNumberOfOption, actualNumberOfOption);
    }
}
