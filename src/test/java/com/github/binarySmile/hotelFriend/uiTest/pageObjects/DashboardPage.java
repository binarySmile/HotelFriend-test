package com.github.binarySmile.hotelFriend.uiTest.pageObjects;


import com.codeborne.selenide.SelenideElement;
import com.github.binarySmile.hotelFriend.uiTest.BaseTest;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;

public class DashboardPage extends BaseTest {

    @FindBy(id = "page-container")
    private SelenideElement dashboardPage;

    public SelenideElement getDashboardPage(){
        return dashboardPage.shouldBe(visible);
    }
}
