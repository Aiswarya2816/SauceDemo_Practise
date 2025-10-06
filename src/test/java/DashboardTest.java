
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.DashboardPage;

public class DashboardTest extends BaseTest{

        @Test(priority = 2, description = "Until adding Product to the Cart")
        public void selectingTheProduct(){
            new DashboardPage()
                    .productText()
                    .selectProduct()
                    .productType()
                    .clickAddToCart()
                    .trolleyCount()
                    .trolleyClick();

            Assert.assertTrue(new HomePage().isInventoryPageOpened(),
                    "Product Unavailable");
        }


}
