package com.portfolio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By login = By.id("login-button");
    private final By error = By.cssSelector("[data-test='error']");
    public LoginPage(WebDriver driver) { this.driver = driver; this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); }
    public ProductsPage loginSuccessfully(String user, String pass) {
        enterCredentials(user, pass);
        return new ProductsPage(driver);
    }
    public LoginPage enterCredentials(String user, String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(login).click();
        return this;
    }
    public String errorMessage() { return wait.until(ExpectedConditions.visibilityOfElementLocated(error)).getText(); }
}
