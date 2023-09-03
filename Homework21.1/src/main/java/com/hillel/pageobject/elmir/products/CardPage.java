package com.hillel.pageobject.elmir.products;

import com.hillel.pageobject.elmir.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardPage extends AbstractPage {
    public CardPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static By BUTTON_BUY = By.xpath("//*[contains(@class,'button big-btn text-btn') and contains(text(),'В корзину')]");
    private static By DELETE_BUTTON = By.xpath("//a[@hint=\"Удалить этот товар из корзины\"]");

    public WebElement getBuyButton() {
        return getWebDriver().findElement(BUTTON_BUY);
    }

    public WebElement getDeleteButton() {
        return getWebDriver().findElement(DELETE_BUTTON);
    }

}
