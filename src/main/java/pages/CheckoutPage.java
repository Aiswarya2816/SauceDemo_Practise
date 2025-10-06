package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public class CheckoutPage {

    private final WebDriver driver;

    public By chkOutDesc = By.xpath("//span[text()='Checkout: Your Information']");
    public By firstName = By.id("first-name");
    public By lastName = By.id("last-name");
    public By zipCode = By.id("postal-code");
    public By conBtn = By.id("continue");


    public CheckoutPage(){
        this.driver = DriverFactory.getDriver();

    }

    public void getChkOutDesc(){
        Waits.waitForVisibility(driver,chkOutDesc).getText();
    }

    public CheckoutPage enterFirstName(String fName){
        Waits.waitForVisibility(driver, firstName).sendKeys(fName);
        return this;
    }

    public CheckoutPage enterLastName(String lName){
        Waits.waitForVisibility(driver, lastName).sendKeys(lName);
        return this;
    }

    public CheckoutPage enterZipCode(String zipcode){
        Waits.waitForVisibility(driver, zipCode).sendKeys(zipcode);
        return this;
    }

    public void clkContBtn() {
        Waits.waitForClickability(driver, conBtn).click();
    }




}
