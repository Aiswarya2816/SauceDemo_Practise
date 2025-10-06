import Constants.FrameworkConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OverviewPage;

public class OverviewTest {

    @Test(priority = 0,description = "Checking the Product Overview")
    public void productOverview(){

        new OverviewPage()
                .getOverviewTxt()
                .getPymntInfo()
                .getShipgInfo()
                .getItemAmtDesc()
                .getTaxAmtDesc()
                .getTotalPriceDesc()
                .clickFinishBtn();

        Assert.assertTrue(new HomePage().isInventoryPageOpened(),
                "Login failed: Inventory page not opened.");
        Assert.assertEquals(new HomePage().getTitle(), FrameworkConstants.TITLE);
    }


}
