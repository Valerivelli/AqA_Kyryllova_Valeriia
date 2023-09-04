package com.hillel.pageobject.elmir.adstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {
    private WebDriver webDriver;
    protected WebDriverWait webDriverWait;
    //private static final Duration timeout = Duration.ofSeconds(10);

    protected AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
