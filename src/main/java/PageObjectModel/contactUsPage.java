package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsPage extends Abstract {

    WebDriver driver;

    public contactUsPage() {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath =  "//a[@title='Contact us']")
    private WebElement contactUsButton;

    public void clickContactUsButton(){

        clickFunction(contactUsButton);
    }

    @FindBy(name = "id_contact")
    private WebElement subjectHeadingDropdown;

    public void selectFromDropdown() {

        selectElementFromDropdown(subjectHeadingDropdown,"Webmaster");
    }

    @FindBy(id = "email")
    private WebElement emailTextArea;

    public void typeEmail() {

        sendKeysFunction(emailTextArea, "test@test.com");
    }

    @FindBy(name = "id_order")
    private WebElement orderReference;
    public void typeOrderReference() {
        sendKeysFunction(orderReference,"Order123");
    }

    @FindBy(id = "message")
    private WebElement messageBox;
    public void typeMessage() {
        sendKeysFunction(messageBox, "Product is broken");
    }

    @FindBy(id = "submitMessage")
    private WebElement sendButton;
    public void clickOnSendButton() {
        clickFunction(sendButton);
    }

    @FindBy(css = "p.alert-success")
    private WebElement successMessage;
    public void assertMyMessage(){
        Assertion(successMessage,"Your message has been successfully sent to our team.");
    }
}
