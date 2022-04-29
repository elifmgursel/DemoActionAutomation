package ContactSteps;

import PageObjectModel.contactUsPage;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class contactUsSteps {

    private WebDriver driver;

    PageObjectModel.contactUsPage contactUsPage = new contactUsPage();

    @Given("^navigate to website$")
    public void navigate_to_website() throws Throwable {
    driver = Driver.getDriver();
    driver.manage().window().maximize();
    driver.get("http://demo.seleniuminaction.com/index.php");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^click on contact us button$")
    public void click_on_contact_us_button() throws Throwable {
        contactUsPage.clickContactUsButton();
    }

    @Given("^select subject heading$")
    public void select_subject_heading() throws Throwable {
        contactUsPage.selectFromDropdown();
    }

    @Given("^type email$")
    public void type_email() throws Throwable {
        contactUsPage.typeEmail();
    }

    @Given("^type order reference$")
    public void type_order_reference() throws Throwable {
        contactUsPage.typeOrderReference();
    }

    @Given("^type a message$")
    public void type_a_message() throws Throwable {
        contactUsPage.typeMessage();
    }

    @When("^click on send button$")
    public void click_on_send_button() throws Throwable {
        contactUsPage.clickOnSendButton();
    }

    @Then("^verify success message$")
    public void verify_success_message() throws Throwable {
        contactUsPage.assertMyMessage();

    }
}
