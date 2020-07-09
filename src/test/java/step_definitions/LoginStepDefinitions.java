package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the account creation page")
    public void user_is_on_the_account_creation_page() {

        String URL = ConfigurationReader.getProperty("upg");

        Driver.getDriver().get(URL);

    }

    @When("user clicks on don't have account link")
    public void user_clicks_on_don_t_have_account_link() {

        loginPage.clickONDoNotHaveLInk();
    }

    @Then("Already have an account? text should be visible")
    public void already_have_an_account_text_should_be_visible() {
       String actual = "Already have an account?";
        Assert.assertEquals(actual, loginPage.getTextAlreadyHaveAnAccountLink());
    }

}
