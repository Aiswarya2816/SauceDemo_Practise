package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public class OverviewPage {

    private final WebDriver driver;


    public By overviewTxt = By.xpath("//div[text()='Checkout: Overview']");
    public By pymtInfo = By.xpath("//div[text()='Payment Information:']");
    public By pymntCode = By.xpath("//div[contains(text(),'SauceCard')]");
    public By shipgInfo = By.xpath("//div[text()='Shipping Information:']");
    public By shipgInfoDesc = By.xpath("//div[text()='FREE PONY EXPRESS DELIVERY!']");
    public By itemAmtDesc = By.xpath("//div[contains(text(),'Item total: $']");
    //public By itemAmt = By.xpath("//div[text()='29.99']");
    public By taxAmtDesc = By.xpath("//div[contains(text(),'Tax: $']");
    //public By taxAmt = By.xpath("//div[text()='2.40']");
    public By totalPriceDesc = By.xpath("//div[contains(text(),'Total: $']");
    //public By totalPrice = By.xpath("//div[text()='32.39']");
    public By finishBtn = By.xpath("//a[text()='FINISH']");

    public OverviewPage(){
        this.driver = DriverFactory.getDriver();
    }

    public void getOverviewTxt(){
        Waits.waitForVisibility(driver, overviewTxt).getText();
    }

    public void getPymntInfo(){
        System.out.println(Waits.waitForVisibility(driver,pymtInfo).getText() +
                Waits.waitForVisibility(driver,pymntCode).getText());

    }
    public void getShipgInfo(){
        System.out.println(Waits.waitForVisibility(driver,shipgInfo).getText() +
                Waits.waitForVisibility(driver,shipgInfoDesc).getText());

    }
    public void getItemAmtDesc(){
        Waits.waitForVisibility(driver,itemAmtDesc).getText();

    }
    public void getTaxAmtDesc(){
        Waits.waitForVisibility(driver,taxAmtDesc).getText();

    }
    public void getTotalPriceDesc(){
        Waits.waitForVisibility(driver,totalPriceDesc).getText();

    }
    public void clickFinishBtn(){
        Waits.waitForClickability(driver,finishBtn).click();

    }


}
