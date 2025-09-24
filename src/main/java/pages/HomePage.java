package pages;

import Constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Objects;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isInventoryPageOpened() {
        return Objects.requireNonNull(driver.getCurrentUrl()).contains("inventory");
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public HomePage verifyInventoryPageOpened() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),
                "Login failed: Inventory page not opened.");
        return this; // allows further chaining
    }

    public HomePage verifyTitle() {
        Assert.assertEquals(driver.getTitle(), FrameworkConstants.TITLE, "Page title mismatch!");
        return this;
    }
}
