package pages;

import Constants.FrameworkConstants;
import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public class LoginPage {

    private WebDriver driver;

    private By usernameField = By.id("user-name");
    private By passwordField = By.name("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage enterUsername(String uname) {
        Waits.waitForVisibility(driver, usernameField).sendKeys(uname);
        return this;
    }

    public LoginPage enterPassword(String pwd) {
        Waits.waitForVisibility(driver, passwordField).sendKeys(pwd);
        return this;
    }

    public LoginPage clickLogin() {
        Waits.waitForClickability(driver, loginButton).click();
        return this;
    }

    public LoginPage login(String uname, String pwd) {
        return enterUsername(uname)
                .enterPassword(pwd)
                .clickLogin();
    }

    public LoginPage loginWithStandardUser() {
        return login(FrameworkConstants.STANDARD_USER, FrameworkConstants.PASSWORD);
    }

    public String getErrorMessage() {
        return Waits.waitForVisibility(driver, errorMessage).getText();
    }

}
