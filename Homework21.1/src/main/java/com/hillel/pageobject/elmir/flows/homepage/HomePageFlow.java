package com.hillel.pageobject.elmir.flows.homepage;

import com.hillel.pageobject.elmir.homepage.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageFlow {
    private HomePage homePage;

    public HomePageFlow(WebDriver webDriver) {
        this.homePage = new HomePage(webDriver);
    }

    public void mobileConnections() {
        homePage.getMobileConnectionTab().click();
    }

    public void phonesList() {
        homePage.getPhonesList().click();
    }

    public void smartWatchesList() {
        homePage.getSmartWatchesList().click();
    }
}
