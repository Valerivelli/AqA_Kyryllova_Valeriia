package com.hillel.pageobject.elmir.products;

import com.hillel.pageobject.elmir.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhonePage extends AbstractPage {
    public PhonePage(WebDriver webDriver) {
        super(webDriver);
    }

    private static final By ADD_TO_CARD_BUTTON = By.xpath("//div[@class=\"no-print ready btn\"]");
    private static final By ADD_TO_FAVORITE_LIST = By.xpath("//span[@class='tovar-wishlist no-print Tips2']");

    public WebElement addToCardButton() {
        return getWebDriver().findElement(ADD_TO_CARD_BUTTON);
    }

    public WebElement addToFavoriteList() {
        return getWebDriver().findElement(ADD_TO_FAVORITE_LIST);
    }


}
