import Constants.FrameworkConstants;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CompletePage;
import pages.HomePage;
import java.io.IOException;
import java.io.File;

import static base.DriverFactory.driver;

public class CompleteTest extends BaseTest{

    @Test(priority = 2, description = "Final success Message", expectedExceptions = IOException.class)
    public void finalSuccessMsg() throws IOException {
        new CompletePage()
                .getFinishTitle()
                .getSuccessMsg()
                .getDispatchCont();

        //Taking success msg screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        //To get screenshot as File
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        //To keep the taken screenshot in new place
        File destFile  = new File("C:\\Users\\YUVARAJ PANDIYAN\\IdeaProjects\\SauceDemo_Practise\\src\\test\\Screenshots.SuccessFinalShot.png");

        //Placing the Copied pic in the Destinated File
        FileUtils.copyFile(srcFile, destFile);

        System.out.println("Screenshot captured and saved to: " + destFile.getAbsolutePath());


        Assert.assertTrue(new HomePage().isInventoryPageOpened(),
                "Couldn't Proceed Success Message Page");
        Assert.assertEquals(new HomePage().getTitle(),FrameworkConstants.TITLE);
    }
}
