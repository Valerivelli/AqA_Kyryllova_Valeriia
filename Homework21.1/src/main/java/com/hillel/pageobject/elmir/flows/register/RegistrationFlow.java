package com.hillel.pageobject.elmir.flows.register;

import com.hillel.pageobject.elmir.register.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class RegistrationFlow {
    private RegistrationPage registrationPage;

    public RegistrationFlow(WebDriver webDriver) {
        this.registrationPage = new RegistrationPage(webDriver);
    }

    public void authoButton() {
        registrationPage.getAuthoButton().click();
    }

    public void registerButton() {
        registrationPage.getRegisterButton().click();
    }

    public void submitButton() {
        registrationPage.getSubmitButton().click();
    }

    public String getNameValidationMessage() {
        return registrationPage.getNameValidationMessage().getText();
    }

    public String getSurnameValidationMessage() {
        return registrationPage.getSurnameValidationMessage().getText();
    }

    public String getPhoneValidationMessage() {
        return registrationPage.getPhoneValidationMessage().getText();
    }

    public String getPasswordValidationMessage() {
        return registrationPage.getPasswordValidationMessage().getText();
    }

    public void fillNameField(String name) {
        registrationPage.getNameField().sendKeys(name);
    }

    public void fillSurnameField(String surname) {
        registrationPage.getSurnameField().sendKeys(surname);
    }

    public void fillPhoneField(String phone) {
        registrationPage.getPhoneField().sendKeys(phone);
    }

    public void fillPasswordField(String password) {
        registrationPage.getPasswordField().sendKeys(password);
    }

}
