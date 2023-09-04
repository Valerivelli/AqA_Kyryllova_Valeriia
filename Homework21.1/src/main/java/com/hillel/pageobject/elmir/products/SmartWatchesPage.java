package com.hillel.pageobject.elmir.products;

import com.hillel.pageobject.elmir.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartWatchesPage extends AbstractPage {
    public SmartWatchesPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static final By ADD_TO_COMPARE_BUTTON = By.xpath("//span[@hint=\"Добавить к сравнению\"]");
    private static final By COMPARE_BUTTON = By.xpath("//a[@class=\"compare-counter category_251309\"]");

    public WebElement addToCompareButton() {
        return getWebDriver().findElement(ADD_TO_COMPARE_BUTTON);
    }

    public WebElement compareButton() {
        return getWebDriver().findElement(COMPARE_BUTTON);
    }
}
