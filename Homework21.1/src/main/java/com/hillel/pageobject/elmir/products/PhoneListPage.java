package com.hillel.pageobject.elmir.products;

import com.hillel.pageobject.elmir.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhoneListPage extends AbstractPage {
    public PhoneListPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static final By PHONE = By.xpath("//li[@ga-position=\"0\"]");

    public WebElement getPhone() {
        return getWebDriver().findElement(PHONE);
    }
}
