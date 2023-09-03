package com.hillel.pageobject.elmir.adstract;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    private WebDriver webDriver;

    protected AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
