package com.portfolio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    public CheckoutPage(WebDriver driver) { this.driver = driver; this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); }
    public CheckoutPage fillDetails(String first, String last, String postal) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name"))).sendKeys(first);
        driver.findElement(By.id("last-name")).sendKeys(last);
        driver.findElement(By.id("postal-code")).sendKeys(postal);
        driver.findElement(By.id("continue")).click();
        return this;
    }
    public CheckoutPage finish() { wait.until(ExpectedConditions.elementToBeClickable(By.id("finish"))).click(); return this; }
    public String confirmation() { return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='complete-header']"))).getText(); }
}
