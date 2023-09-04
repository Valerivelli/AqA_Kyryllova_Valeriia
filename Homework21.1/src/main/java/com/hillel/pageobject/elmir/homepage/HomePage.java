package com.hillel.pageobject.elmir.homepage;

import com.hillel.pageobject.elmir.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private static final By MOBILE_CONNECTION_TAB = By.xpath("//a[@id=\"tab-5\"]");

    private static final By PHONES_LIST = By.xpath("//*[contains(@class,'cat-name') and contains(text(),'Мобильные телефоны')]");

    private static final By SMART_WATCHES_LIST = By.xpath("//*[contains(@class,'cat-name') and contains(text(),'Смарт-часы и фитнес браслеты')]");

    public WebElement getMobileConnectionTab() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(MOBILE_CONNECTION_TAB));
    }

    public WebElement getPhonesList() {
        return getWebDriver().findElement(PHONES_LIST);
    }

    public WebElement getSmartWatchesList() {
        return getWebDriver().findElement(SMART_WATCHES_LIST);
    }
}
