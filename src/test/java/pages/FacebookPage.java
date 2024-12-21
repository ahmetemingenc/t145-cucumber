package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "pass")
    public WebElement passwordBox;

    @FindBy(name = "login")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    public WebElement createAcoountButton;

    @FindBy(xpath = "(//*[@class='inputtext _58mg _5dba _2ph-'])[1]")
    public WebElement registerFirstNameButton;

    @FindBy(xpath = "//*[@class='_6j mvm _6wk _6wl _58mi _6o _6v']")
    public WebElement singupBotton;

}
