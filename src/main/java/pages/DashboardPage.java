package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;


public class DashboardPage {

    private final WebDriver driver;

    public By DashboardText = By.xpath("//span[text()='Products']");
    public By clickProduct = By.id("item_4_img_link");
    public By productDesc = By.xpath("//div[text()='Sauce Labs Backpack']");
    public By addToCart = By.id("add-to-cart");
    public By cartCount = By.xpath("//span[@class='shopping_cart_badge']");
    public By cartClick = By.xpath("//a[@class='shopping_cart_link']");

    public DashboardPage(){
        this.driver = DriverFactory.getDriver();
    }

    public void productText(){
        Waits.waitForVisibility(driver, DashboardText).getText();
    }

    public void selectProduct(){
        Waits.waitForClickability(driver, clickProduct).click();
    }

    public void productType(){
        Waits.waitForVisibility(driver, productDesc).getText();
    }

    public void clickAddToCart(){
        Waits.waitForClickability(driver,addToCart).click();
    }

    public void trolleyCount(){
        Waits.waitForVisibility(driver,cartCount).getText();
    }
    public void trolleyClick(){
        Waits.waitForVisibility(driver,cartClick).getText();
    }
}
