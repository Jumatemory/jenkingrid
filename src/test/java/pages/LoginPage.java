package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtilities;
import utilities.Driver;

public class LoginPage {
    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    @FindBy(linkText = "Don't have an account?")
    private   WebElement accountCreationLink;
    @FindBy(xpath = "//a[text()='Already have an account?']")
    private WebElement alreadyHaveAccountLink;
    @FindBy(id = "login")
    private WebElement emailField;
    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "confirm_password")
    private WebElement confirmPassword;
    @FindBy(css = "button[type='submit']")
    private WebElement signUpButton;
    @FindBy(css = "h2[class='text-center o_default_snippet_text']")
    private WebElement title;


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickONDoNotHaveLInk(){

        accountCreationLink.click();
    }
    public void setEmail(String email){
        emailField.sendKeys(email);
    }
    public void setName(String name){

        nameField.sendKeys(name);
    }
    public void setPassword(String password){
        passwordField.sendKeys(password);
    }
    public void setConfirmPassword(String conPassword){
        confirmPassword.sendKeys(conPassword);

    }
    public void clickONSignUpButton(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();

    }
    public String getTitleText(){

        return title.getText();
    }

    public String getTextAlreadyHaveAnAccountLink(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(alreadyHaveAccountLink));
        BrowserUtilities.wait(6);
        return alreadyHaveAccountLink.getText();
    }
}
