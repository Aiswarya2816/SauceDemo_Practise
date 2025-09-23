package utils;

import Constants.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.DriverFactory;

import java.time.Duration;

public class Waits {
    private static WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    private static WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(FrameworkConstants.TIMEOUT));
    }

    public static WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickability(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForPresence(By locator) {
        return getWait().until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static boolean waitForText(By locator, String text) {
        return getWait().until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }
}