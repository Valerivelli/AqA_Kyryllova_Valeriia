package com.rozetka.patterns.pageobject.elmir.products;

import com.hillel.pageobject.elmir.factory.BrowserName;
import com.hillel.pageobject.elmir.factory.WebDriverFactory;
import com.hillel.pageobject.elmir.flows.homepage.HomePageFlow;
import com.hillel.pageobject.elmir.flows.products.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AddProductsToCompareListTest {
    private static HomePageFlow homePageFlow;
    private static WebDriver webDriver;
    private static SmartWatchesListPageFlow smartWatchesListPageFlow;
    private static SmartWatchesPageFlow smartWatchesPageFlow;

    @BeforeAll
    public static void init() {
        webDriver = WebDriverFactory.getByName(BrowserName.CHROME);
        homePageFlow = new HomePageFlow(webDriver);
        smartWatchesListPageFlow = new SmartWatchesListPageFlow(webDriver);
        smartWatchesPageFlow = new SmartWatchesPageFlow(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get("https://elmir.ua/");
    }

    @Test
    public void addProductsToCompareList() {
        homePageFlow.mobileConnections();
        homePageFlow.smartWatchesList();
        smartWatchesListPageFlow.getSmartWatch1();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        smartWatchesPageFlow.addToCompareButton();
        webDriver.navigate().back();
        smartWatchesListPageFlow.getSmartWatch2();
        smartWatchesPageFlow.addToCompareButton();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        smartWatchesPageFlow.compareButton();
        String link3 = webDriver.getCurrentUrl();
        Assertions.assertTrue(link3.contains("module=compare"));
    }
    @AfterAll
    public static void teardown() {
        webDriver.quit();
    }
}
