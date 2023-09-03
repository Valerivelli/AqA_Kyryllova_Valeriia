package com.rozetka.patterns.pageobject.elmir.products;

import com.hillel.pageobject.elmir.factory.BrowserName;
import com.hillel.pageobject.elmir.factory.WebDriverFactory;
import com.hillel.pageobject.elmir.flows.homepage.HomePageFlow;
import com.hillel.pageobject.elmir.flows.products.PhonePageFlow;
import com.hillel.pageobject.elmir.flows.products.PhonesListPageFlow;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AddProductToFavoriteListTest {
    private static WebDriver webDriver;
    private static HomePageFlow homePageFlow;
    private static PhonesListPageFlow phonesListPageFlow;
    private static PhonePageFlow phonePageFlow;

    @BeforeAll
    public static void init() throws InterruptedException {
        webDriver = WebDriverFactory.getByName(BrowserName.CHROME);
        homePageFlow = new HomePageFlow(webDriver);
        phonesListPageFlow = new PhonesListPageFlow(webDriver);
        phonePageFlow = new PhonePageFlow(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get("https://elmir.ua/");
        Thread.sleep(3000);
    }

    @Test
    public void addProductToFavoriteList() throws InterruptedException {
        homePageFlow.mobileConnections();
        homePageFlow.phonesList();
        phonesListPageFlow.getPhone();
        Thread.sleep(2000);
        phonePageFlow.addToFavoriteList();
    }

    @AfterAll
    public static void teardown() {
        webDriver.quit();
    }
}
