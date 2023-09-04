package com.hillel.pageobject.elmir.flows.products;

import com.hillel.pageobject.elmir.products.PhoneListPage;
import org.openqa.selenium.WebDriver;

public class PhonesListPageFlow {
    private PhoneListPage phoneListPage;

    public PhonesListPageFlow(WebDriver webDriver) {
        this.phoneListPage = new PhoneListPage(webDriver);
    }

    public void getPhone() {
        phoneListPage.getPhone().click();
    }
}
