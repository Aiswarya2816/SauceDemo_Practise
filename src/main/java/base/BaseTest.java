package base;

import org.openqa.selenium.WebDriver;

import Constants.FrameworkConstants;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.initDriver(FrameworkConstants.CHROME);
        driver.get(FrameworkConstants.SAUCEDEMO_URL);
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
