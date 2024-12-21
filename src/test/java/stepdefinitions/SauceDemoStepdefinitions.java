package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.SauceDemoPage;

public class SauceDemoStepdefinitions {

    SauceDemoPage sauceDemoPage = new SauceDemoPage();
    String firstProductName;

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String givenUsername) {

        sauceDemoPage.usernameBox.sendKeys(givenUsername);
    }

    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String givenPassword) {

        sauceDemoPage.passwordBox.sendKeys(givenPassword);
    }

    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {

        sauceDemoPage.loginButton.click();
    }

    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {

        firstProductName = sauceDemoPage.firstProductName.getText();

        sauceDemoPage.firstProductName.click();
    }

    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {

        sauceDemoPage.addToCartButton.click();
    }

    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {

        sauceDemoPage.shoppingCartButton.click();
    }

    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {

        String expectedProductName = firstProductName;
        String actualProductName = sauceDemoPage.productNameInCart.getText();

        Assertions.assertEquals(expectedProductName, actualProductName);
    }
}
