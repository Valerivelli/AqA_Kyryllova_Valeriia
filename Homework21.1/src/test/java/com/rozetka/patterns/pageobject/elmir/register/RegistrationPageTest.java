package com.rozetka.patterns.pageobject.elmir.register;

import com.hillel.pageobject.elmir.factory.BrowserName;
import com.hillel.pageobject.elmir.factory.WebDriverFactory;
import com.hillel.pageobject.elmir.flows.register.RegistrationFlow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {
    private static WebDriver webDriver;
    private static RegistrationFlow registrationFlow;
    @BeforeAll
    public static void init() {
        webDriver = WebDriverFactory.getByName(BrowserName.CHROME);
        registrationFlow = new RegistrationFlow(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get("https://elmir.ua/");
    }

    @Test
    @DisplayName("Register new user")
    public void testRegistration() {
        registrationFlow.authoButton();
        registrationFlow.registerButton();
        //Thread.sleep(2000);
        registrationFlow.submitButton();
        //Thread.sleep(2000);
        registrationFlow.getNameValidationMessage();
        Assertions.assertEquals("Укажите ваше имя.",registrationFlow.getNameValidationMessage());
        registrationFlow.getSurnameValidationMessage();
        Assertions.assertEquals("Укажите вашу фамилию.",registrationFlow.getSurnameValidationMessage());
        registrationFlow.getPhoneValidationMessage();
        Assertions.assertEquals("Укажите ваш телефон.",registrationFlow.getPhoneValidationMessage());
        registrationFlow.getPasswordValidationMessage();
        Assertions.assertEquals("Придумайте пароль.",registrationFlow.getPasswordValidationMessage());
        registrationFlow.fillNameField("Тест");
        registrationFlow.fillSurnameField("ТестФам");
        registrationFlow.fillPhoneField("+380501112233");
        registrationFlow.fillPasswordField("QweTestPo123");
        registrationFlow.submitButton();
    }
}
