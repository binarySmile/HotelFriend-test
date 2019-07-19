package com.github.binarySmile.hotelFriend.uiTest.tests;

import com.github.binarySmile.hotelFriend.uiTest.BaseTest;
import com.github.binarySmile.hotelFriend.uiTest.pageObjects.AccountPage;
import com.github.binarySmile.hotelFriend.uiTest.pageObjects.DashboardPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertTrue;

public class AccountLoggingInTests extends BaseTest {

    @Test
    public void positiveTest() {
        AccountPage accountPage = page(AccountPage.class);
        accountPage.inputUserEmail(data.getProperty("email"));
        accountPage.inputPassword(data.getProperty("password"));
        DashboardPage dashboardPage = page(DashboardPage.class);
        assertTrue(dashboardPage.getDashboardPage().isDisplayed());
    }

    @Test
    public void negativeTest() {
        AccountPage accountPage = page(AccountPage.class);
        accountPage.inputUserEmail(data.getProperty("email"));
        accountPage.sendForm();
        assertTrue(accountPage.getLoginPasswordError().isDisplayed());
    }
}
