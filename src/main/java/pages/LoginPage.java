package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public class LoginPage {

    private final WebDriver driver;

    private By usernameField = By.id("user-name");
    private By passwordField = By.name("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage() {
        this.driver = DriverFactory.getDriver();
    }

    public LoginPage enterUsername(String uname) {
        Waits.waitForVisibility(driver, usernameField).sendKeys(uname);
        return this;
    }

    public LoginPage enterPassword(String pwd) {
        Waits.waitForVisibility(driver, passwordField).sendKeys(pwd);
        return this;
    }

    public HomePage clickLogin() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    public void login(String uname, String pwd) {
        try {
            enterUsername(uname)
                    .enterPassword(pwd)
                    .clickLogin();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getErrorMessage() {
        return Waits.waitForVisibility(driver, errorMessage).getText();
    }

}
