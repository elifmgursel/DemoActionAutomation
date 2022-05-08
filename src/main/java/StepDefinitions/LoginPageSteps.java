package StepDefinitions;

import PageObjectModel.LoginPage;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageSteps {

    private WebDriver driver;

    PageObjectModel.LoginPage loginPage = new LoginPage();

    @Given("^navigate test website$")
    public void navigate_test_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.seleniuminaction.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^click on first sign in button$")
    public void click_on_first_sign_in_button() throws Throwable {
        loginPage.clickFirstSignInButton();
    }

    @Given("^type email$")
    public void type_email() throws Throwable {
        loginPage.typeEmail();
    }

    @Given("^type password$")
    public void type_password() throws Throwable {
        loginPage.typePassword();
    }

    @When("^click on sign in button$")
    public void click_on_sign_in_button() throws Throwable {
        loginPage.clickSubmitButton();
    }

    @Then("^verify username$")
    public void verify_username() throws Throwable {
        loginPage.assertWelcomeMessage();
    }
}
