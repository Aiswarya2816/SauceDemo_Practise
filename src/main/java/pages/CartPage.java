package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;


public class CartPage {

    private final WebDriver driver;

    public By cartText = By.xpath("//span[text()='Your Cart']");
    public By qtyCount = By.className("cart_quantity");
    public By prdDesc = By.xpath("//div[@class='inventory_item_desc']");
    public By prdCost = By.xpath("//div[@class='inventory_item_price']");
    public By checkOutBtn = By.id("checkout");


    public CartPage(){
        this.driver = DriverFactory.getDriver();
    }

    public void getCartPageText(){
        Waits.waitForVisibility(driver,cartText).getText();
    }

    public void getQtyCount(){
        Waits.waitForVisibility(driver,qtyCount).getText();
    }

    public void getPrdDesc(){
        Waits.waitForVisibility(driver,prdDesc).getText();
    }

    public void getPrdCost(){
        Waits.waitForVisibility(driver,prdCost).getText();
    }

    public void clkCheckBtn(){
        Waits.waitForClickability(driver,checkOutBtn).click();
    }

}
