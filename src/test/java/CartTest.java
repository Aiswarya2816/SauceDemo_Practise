import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.DashboardPage;
import pages.HomePage;

public class CartTest {

    @Test(priority = 2, description = "Final CheckOut")
    public void finalizeCart(){
        new CartPage()
                .getCartPageText()
                .getQtyCount()
                .getPrdDesc()
                .getPrdCost()
                .clkCheckBtn();

        Assert.assertTrue(new HomePage().isInventoryPageOpened(),
                "CheckOut Page Unavailable");

    }

}
