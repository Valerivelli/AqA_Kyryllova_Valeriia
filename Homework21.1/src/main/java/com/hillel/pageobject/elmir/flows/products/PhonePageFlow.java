package com.hillel.pageobject.elmir.flows.products;

import com.hillel.pageobject.elmir.products.PhonePage;
import org.openqa.selenium.WebDriver;

public class PhonePageFlow {
    private PhonePage phonePage;

    public PhonePageFlow(WebDriver webDriver) {
        this.phonePage = new PhonePage(webDriver);
    }

    public void addToCardButon() {
        phonePage.addToCardButton().click();
    }

    public void addToFavoriteList() {
        phonePage.addToFavoriteList().click();
    }
}
