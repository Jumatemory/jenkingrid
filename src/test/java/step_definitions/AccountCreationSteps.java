package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.BrowserUtilities;

public class AccountCreationSteps {
    LoginPage loginPage = new LoginPage();
    @When("user enters email as {string} name as {string} password as {string} and confirm password as {string}")
    public void user_enters_email_as_name_as_password_as_and_confirm_password_as(String string, String string2, String string3, String string4) {
       loginPage.clickONDoNotHaveLInk();
        loginPage.setEmail(string);
       loginPage.setName(string2);
       loginPage.setPassword(string3);
      loginPage.setConfirmPassword(string4);
    }

    @When("user clicks on signUp button")
    public void user_clicks_on_signUp_button() {
      loginPage.clickONSignUpButton();
    }

    @Then("the title of the page should be visible")
    public void the_title_of_the_page_should_be_visible() {
       String actual ="ERP Systems, Solutions and Services that add real value to your business.";
        Assert.assertEquals(loginPage.getTitleText(), actual);

    }

}
