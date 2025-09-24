import Constants.FrameworkConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(description = "Positive test: login with valid credentials")
    public void loginWithValidUser() {
        HomePage home = new LoginPage()
                .enterUsername(FrameworkConstants.USERNAME)
                .enterPassword(FrameworkConstants.PASSWORD)
                .clickLogin();
        Assert.assertTrue(home.isInventoryPageOpened(), "Login failed: Inventory page not opened.");
    }
}
