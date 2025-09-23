import org.testng.annotations.Test;
import pages.loginPage;

public class LoginTest {
    loginPage LoginPage = new loginPage();
    @Test
    public void loginWithValidUsernameAndPassword(){
        LoginPage.navigateTo().login("standard_user","secret_sauce");
    }
}
