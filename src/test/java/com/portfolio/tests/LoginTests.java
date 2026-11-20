package com.portfolio.tests;

import com.portfolio.base.BaseTest;
import com.portfolio.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test(groups = {"smoke", "regression"})
    public void validLogin() {
        Assert.assertEquals(new LoginPage(driver).loginSuccessfully("standard_user", "secret_sauce").title(), "Products");
    }
    @DataProvider(name = "invalidCredentials")
    public Object[][] invalidCredentials() {
        return new Object[][] {{"invalid_user", "wrong_password"}, {"locked_out_user", "secret_sauce"}};
    }
    @Test(dataProvider = "invalidCredentials", groups = "regression")
    public void invalidLoginShowsError(String username, String password) {
        String message = new LoginPage(driver).enterCredentials(username, password).errorMessage();
        Assert.assertTrue(message.contains("Epic sadface"), "Expected authentication error, got: " + message);
    }
}
