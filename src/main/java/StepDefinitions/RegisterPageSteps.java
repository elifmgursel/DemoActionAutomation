package StepDefinitions;

import PageObjectModel.RegisterPage;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_scouse.An;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPageSteps {

    private WebDriver driver;

    PageObjectModel.RegisterPage registerPage = new RegisterPage();

    @Given("^navigate demo website$")
    public void navigate_demo_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.seleniuminaction.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^Click on Sign In button$")
    public void clickOnSignInButton() {
        registerPage.clickOnSignInButton();

    }

    @And("^Type email\"([^\"]*)\"$")
    public void typeEmail(String email) throws Throwable {
        registerPage.typeEmail(email);
    }
    @And("^Click on Create an Account button$")
    public void clickOnCreateAnAccountButton() {

        registerPage.clickOnSubmitButton();
    }

    @And("^Choose title$")
    public void chooseTitle() {
        registerPage.clickOnGender();
    }

    @And("^Type Firstname \"([^\"]*)\"$")
    public void typeFirstname(String firstname) throws Throwable {
        registerPage.typeFirstname(firstname);
    }

    @And("^Type Lastname \"([^\"]*)\"$")
    public void typeLastname(String lastname) throws Throwable {
        registerPage.typeLastname(lastname);

    }

    @And("^Type Password \"([^\"]*)\"$")
    public void typePassword(String password) throws Throwable {
        registerPage.typePassword(password);
    }

    @Then("^Click on Register Button$")
    public void click_on_Register_Button() throws Throwable {
        registerPage.clickRegister();
    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
