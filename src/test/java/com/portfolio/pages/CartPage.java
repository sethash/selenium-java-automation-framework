package com.portfolio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    public CartPage(WebDriver driver) { this.driver = driver; this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); }
    public String itemName() { return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='inventory-item-name']"))).getText(); }
    public CheckoutPage checkout() { wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))).click(); return new CheckoutPage(driver); }
}
