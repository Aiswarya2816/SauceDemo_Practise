import Constants.ErrorMessages;
import Constants.FrameworkConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest{

    @Test(description = "Positive test: login with valid credentials")
    public void testValidLogin() {
        new LoginPage()
                .enterUsername(FrameworkConstants.USERNAME)
                .enterPassword(FrameworkConstants.PASSWORD)
                .clickLogin();
        Assert.assertTrue(new HomePage().isInventoryPageOpened(),
                "Login failed: Inventory page not opened.");
        Assert.assertEquals(new HomePage().getTitle(),FrameworkConstants.TITLE);
    }

    @Test
    public void testInvalidLogin_BlankCredentials() {
        new LoginPage()
                .enterUsername("")
                .enterPassword("")
                .clickLoginExpectingFailure();
        Assert.assertEquals(new LoginPage().getErrorMessage(), ErrorMessages.INVALID_CREDENTIALS, "Error message mismatch!");
    }
}
