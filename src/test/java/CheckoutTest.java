import Constants.FrameworkConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;

public class CheckoutTest extends BaseTest {

    @Test(priority = 2, description = "CheckOut Details")
    public void finalCheckout(){
        new CheckoutPage()
                .enterFirstName(FrameworkConstants.FIRSTNAME)
                .enterLastName(FrameworkConstants.LASTNAME)
                .enterZipCode(FrameworkConstants.ZIPCODE)
                .clkContBtn();

        Assert.assertTrue(new HomePage().isInventoryPageOpened(),
                "Couldn't Proceed CheckOut Page");
        Assert.assertEquals(new HomePage().getTitle(),FrameworkConstants.TITLE);
    }


}
