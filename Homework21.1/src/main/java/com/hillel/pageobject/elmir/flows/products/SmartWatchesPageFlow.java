package com.hillel.pageobject.elmir.flows.products;

import com.hillel.pageobject.elmir.products.SmartWatchesListPage;
import com.hillel.pageobject.elmir.products.SmartWatchesPage;
import org.openqa.selenium.WebDriver;

public class SmartWatchesPageFlow {
    private SmartWatchesPage smartWatchesPage;

    public SmartWatchesPageFlow(WebDriver webDriver) {
        this.smartWatchesPage = new SmartWatchesPage(webDriver);
    }

    public void addToCompareButton() {
        smartWatchesPage.addToCompareButton().click();
    }

    public void compareButton() {
        smartWatchesPage.compareButton().click();
    }
}
