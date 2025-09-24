import Constants.ErrorMessages;
import Constants.FrameworkConstants;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest{

    @Test(description = "Positive test: login with valid credentials")
    public void testValidLogin() {
        new LoginPage()
                .enterUsername(FrameworkConstants.USERNAME)
                .enterPassword(FrameworkConstants.PASSWORD)
                .clickLogin()
                .verifyInventoryPageOpened()
                .verifyTitle();
    }

    @Test
    public void testInvalidLogin_BlankCredentials() {
        new LoginPage()
                .enterUsername("")
                .enterPassword("")
                .clickLoginExpectingFailure()
                .verifyErrorMessage(ErrorMessages.INVALID_CREDENTIALS);
    }
}
