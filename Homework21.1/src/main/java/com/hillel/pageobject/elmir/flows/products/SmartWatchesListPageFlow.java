package com.hillel.pageobject.elmir.flows.products;

import com.hillel.pageobject.elmir.products.SmartWatchesListPage;
import org.openqa.selenium.WebDriver;

public class SmartWatchesListPageFlow {
    private SmartWatchesListPage smartWatchesPage;

    public SmartWatchesListPageFlow(WebDriver webDriver) {
        this.smartWatchesPage = new SmartWatchesListPage(webDriver);
    }

    public void getSmartWatch1() {
        smartWatchesPage.getSmartWatch1().click();
    }

    public void getSmartWatch2() {
        smartWatchesPage.getSmartWatch2().click();
    }
}
