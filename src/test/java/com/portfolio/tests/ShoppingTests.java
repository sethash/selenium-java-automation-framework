package com.portfolio.tests;

import com.portfolio.base.BaseTest;
import com.portfolio.pages.LoginPage;
import com.portfolio.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTests extends BaseTest {
    @Test(groups = {"regression"})
    public void addItemToCart() {
        ProductsPage products = new LoginPage(driver).loginSuccessfully("standard_user", "secret_sauce");
        products.addBackpack();
        Assert.assertEquals(products.cartCount(), "1");
        Assert.assertEquals(products.openCart().itemName(), "Sauce Labs Backpack");
    }
    @Test(groups = {"smoke", "regression"})
    public void completeCheckout() {
        ProductsPage products = new LoginPage(driver).loginSuccessfully("standard_user", "secret_sauce");
        String confirmation = products.addBackpack().openCart().checkout().fillDetails("Test", "User", "12345").finish().confirmation();
        Assert.assertEquals(confirmation, "Thank you for your order!");
    }
}
