package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Abstract {

    WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@title='Log in to your customer account']")
    private WebElement FirstSignInButton;
    public void clickFirstSignInButton() {
        clickFunction(FirstSignInButton);
    }

    @FindBy(name = "email")
    private WebElement emailArea;
    public void typeEmail() {

        sendKeysFunction(emailArea, "test@test.tk");
    }

    @FindBy(name = "passwd")
    private WebElement passwordArea;
    public void typePassword() {

        sendKeysFunction(passwordArea,"abcd1234");
    }

    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;
    public void clickSubmitButton(){

        clickFunction(submitButton);
    }

    @FindBy(className = "info-account")
    private WebElement welcomeMessage;
    public void assertWelcomeMessage() {
        Assertion(welcomeMessage, "Welcome to your account. Here you can manage all of your personal information and orders.");
    }

}