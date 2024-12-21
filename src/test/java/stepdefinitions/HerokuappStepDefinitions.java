package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import org.opentest4j.AssertionFailedError;
import pages.HerokuappPage;

public class HerokuappStepDefinitions {

    HerokuappPage herokuappPage = new HerokuappPage();

    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {

        herokuappPage.addElementButton.click();
    }

    @When("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {

        Assertions.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }

    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {

        herokuappPage.deleteButton.click();
    }

    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {

        Assertions.assertTrue(herokuappPage.addRemoveTextElement.isDisplayed());
    }

    @Then("Delete butonu’nun gorunur olmadigıni test eder")
    public void deleteButonuNunGorunurOlmadigıniTestEder() {

        try {

            herokuappPage.deleteButton.click();
            throw new AssertionFailedError("Delete butonu kullanilabilir");
        } catch (NoSuchElementException e) {

            Assertions.assertTrue(true);
        }
    }
}
