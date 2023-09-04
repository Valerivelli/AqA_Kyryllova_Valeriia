package com.rozetka.patterns.pageobject.elmir.login;

import com.hillel.pageobject.elmir.factory.BrowserName;
import com.hillel.pageobject.elmir.factory.WebDriverFactory;
import com.hillel.pageobject.elmir.flows.login.LoginFlow;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
    private static LoginFlow loginFlow;
    private static WebDriver webDriver;


    @BeforeAll
    public static void init() throws InterruptedException {
        webDriver = WebDriverFactory.getByName(BrowserName.CHROME);
        loginFlow = new LoginFlow(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get("https://elmir.ua/");
        Thread.sleep(3000);
    }

    @Test
    @DisplayName("Check login with unregistered user")
    public void testLogin() {
        loginFlow.authoButton();
        loginFlow.fillEmailField("mylogin@gmail.com");
        loginFlow.fillPasswordField("somepassword");
        loginFlow.loginButton();
        loginFlow.getPasswordValidationMessage();
        Assertions.assertEquals("Неверные данные входа", loginFlow.getPasswordValidationMessage());
    }

    @AfterAll
    public static void teardown() {
        webDriver.quit();
    }
}
