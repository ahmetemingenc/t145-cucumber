package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {

    public SauceDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='input_error form_input'])[1]")
    public WebElement usernameBox;

    @FindBy(xpath = "(//*[@class='input_error form_input'])[2]")
    public WebElement passwordBox;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@class='inventory_item_name '])[1]")
    public WebElement firstProductName;

    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    public WebElement shoppingCartButton;

    @FindBy(className = "inventory_item_name")
    public WebElement productNameInCart;
}
