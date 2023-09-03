package com.hillel.pageobject.elmir.flows.products;

import com.hillel.pageobject.elmir.products.CardPage;
import org.openqa.selenium.WebDriver;

public class CardPageFlow {
    private CardPage cardPage;

    public CardPageFlow(WebDriver webDriver) {
        this.cardPage = new CardPage(webDriver);
    }

    public void buyButton() {
        cardPage.getBuyButton().click();
    }

    public void deleteButon() {
        cardPage.getDeleteButton().click();
    }
}
