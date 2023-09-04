package com.rozetka.patterns.pageobject.elmir.products;

import com.hillel.pageobject.elmir.factory.BrowserName;
import com.hillel.pageobject.elmir.factory.WebDriverFactory;
import com.hillel.pageobject.elmir.flows.products.CardPageFlow;
import com.hillel.pageobject.elmir.flows.products.PhonePageFlow;
import com.hillel.pageobject.elmir.flows.products.PhonesListPageFlow;
import com.hillel.pageobject.elmir.flows.homepage.HomePageFlow;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AddPhoneToCardTest {
    private static HomePageFlow homePageFlow;
    private static WebDriver webDriver;
    private static PhonesListPageFlow phonesListPageFlow;
    private static PhonePageFlow phonePageFlow;
    private static CardPageFlow cardPageFlow;

    @BeforeAll
    public static void init() throws InterruptedException {
        webDriver = WebDriverFactory.getByName(BrowserName.CHROME);
        homePageFlow = new HomePageFlow(webDriver);
        phonesListPageFlow = new PhonesListPageFlow(webDriver);
        phonePageFlow = new PhonePageFlow(webDriver);
        cardPageFlow = new CardPageFlow(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get("https://elmir.ua/");
    }

    @Test
    public void addProductToCardAndDelete() {
        homePageFlow.mobileConnections();
        homePageFlow.phonesList();
        phonesListPageFlow.getPhone();
        phonePageFlow.addToCardButon();
        cardPageFlow.buyButton();
        String link = webDriver.getCurrentUrl();
        Assertions.assertTrue(link.contains("basket.html"));
        cardPageFlow.deleteButon();
    }

    @AfterAll
    public static void teardown() {
        webDriver.quit();
    }
}
