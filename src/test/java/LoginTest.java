import Constants.FrameworkConstants;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    @Test(description = "Positive test: login with valid credentials")
    public void loginWithValidUser() {
        loginPage.login(FrameworkConstants.STANDARD_USER, FrameworkConstants.PASSWORD);
        /*String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory"), "Login failed or not redirected to inventory page");*/
    }
}
