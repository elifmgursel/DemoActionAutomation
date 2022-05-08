package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Abstract {

    private WebDriver driver;

    public RegisterPage () {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.login")
    private WebElement signInButton;
    public void clickOnSignInButton() {
        clickFunction(signInButton);
    }

    @FindBy(name = "email_create")
    private WebElement emailTextBox;
    public void typeEmail(String email) {
        sendKeysFunction(emailTextBox, email);
    }

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;
    public void clickOnSubmitButton() {
        clickFunction(submitButton);
    }

    @FindBy(id = "id_gender1")
    private WebElement gender;
    public void clickOnGender(){
        clickFunction(gender);
    }

    @FindBy(id ="customer_firstname" )
    private WebElement firstname;
    public void typeFirstname(String firstName){
        sendKeysFunction(firstname, firstName);
    }

    @FindBy(id = "customer_lastname")
    private WebElement lastname;
    public void typeLastname(String lastName) {
        sendKeysFunction(lastname, lastName);
    }

    @FindBy(name = "passwd")
    private WebElement password;
    public void typePassword(String customerPassword){
        sendKeysFunction(password, customerPassword);
    }

    @FindBy(id = "submitAccount")
    private WebElement registerButton;
    public void clickRegister() {
        clickFunction(registerButton);
    }
}
