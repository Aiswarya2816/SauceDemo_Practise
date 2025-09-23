package pages;

import Constants.FrameworkConstants;
import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waits;

public class loginPage extends DriverFactory {

    private WebDriver driver;

    @FindBy(css = "[id='user-name']")
    WebElement username;

    @FindBy(css = "[name='password']")
    WebElement password;

    @FindBy(css = "#login-button")
    WebElement loginBtn;

    public loginPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

    public loginPage navigateTo(){
        driver.get(FrameworkConstants.URL);
        return this;
    }

    public loginPage enterUsername(String uname) {
        Waits.waitForVisibility((By) username).sendKeys(uname);
        return this;
    }

    // Enter password
    public loginPage enterPassword(String pwd) {
        Waits.waitForVisibility((By) password).sendKeys(pwd);
        return this;
    }

    // Click login button
    public loginPage clickLogin() {
        Waits.waitForClickability((By) loginBtn).click();
        return this;
    }

    // Full login workflow
    public loginPage login(String uname, String pwd) {
        return enterUsername(uname)
                .enterPassword(pwd)
                .clickLogin();
    }

}
