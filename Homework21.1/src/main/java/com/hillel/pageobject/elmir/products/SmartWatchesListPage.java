package com.hillel.pageobject.elmir.products;

import com.hillel.pageobject.elmir.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartWatchesListPage extends AbstractPage {
    public SmartWatchesListPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static final By SMART_WATCHES1 = By.xpath("//li[@ga-position=\"0\"]");
    private static final By SMART_WATCHES2 = By.xpath("//li[@ga-position=\"1\"]");

    public WebElement getSmartWatch1() {
        return getWebDriver().findElement(SMART_WATCHES1);
    }

    public WebElement getSmartWatch2() {
        return getWebDriver().findElement(SMART_WATCHES2);
    }
}
