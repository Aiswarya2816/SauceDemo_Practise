package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public class CompletePage {

    private final WebDriver driver;

    public By finishTitle = By.xpath("//div[text()='Finish']");
    public By sucMsg = By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");
    public By dispatchCont = By.xpath("//h2[contains(text(),'Your order has been dispatched')]");



    public CompletePage(){
        this.driver = DriverFactory.getDriver();
    }

    public void getFinishTitle(){
        Waits.waitForVisibility(driver,finishTitle).getText();
    }

    public CompletePage getSuccessMsg(){
        Waits.waitForVisibility(driver,sucMsg).getText();
        return this;
    }

    public void getDispatchCont(){
        Waits.waitForVisibility(driver,dispatchCont).getText();
    }

}
