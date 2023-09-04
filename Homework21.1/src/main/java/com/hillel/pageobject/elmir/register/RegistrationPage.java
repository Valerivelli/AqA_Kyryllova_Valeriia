package com.hillel.pageobject.elmir.register;

import com.hillel.pageobject.elmir.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends AbstractPage {

    private static final By AUTHO_BUTTON = By.xpath("//div[@id =\"autho\"]");
    private static final By REGISTER_BUTTON = By.xpath("//*[contains(@class,'lf-a open-reg') and contains(text(), 'Зарегистрироваться')]");
    private static final By SUBMIT_BUTTON = By.xpath("//*[contains(@class,'mw-submit') and contains(text(),'Зарегистрироваться')]");
    private static final By NAME_VALIDATION_MESSAGE = By.xpath("//div[@id=\"rf-err-name\"]");
    private static final By SURNAME_VALIDATION_MESSAGE = By.xpath("//div[@id=\"rf-err-surname\"]");
    private static final By PHONE_VALIDATION_MESSAGE = By.xpath("//div[@id=\"rf-err-phone\"]");
    private static final By PASSWORD_VALIDATION_MESSAGE = By.xpath("//div[@id=\"rf-err-password\"]");
    private static final By NAME_FIELD = By.xpath("//input[@id=\"rf-name\"]");
    private static final By SURNAME_FIELD = By.xpath("//input[@id=\"rf-surname\"]");
    private static final By PHONE_FIELD = By.xpath("//input[@id=\"rf-phone\"]");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id=\"rf-password\"]");

    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getAuthoButton() {
        return getWebDriver().findElement(AUTHO_BUTTON);
    }

    public WebElement getRegisterButton() {
        return getWebDriver().findElement(REGISTER_BUTTON);
    }

    public WebElement getSubmitButton() {
        return getWebDriver().findElement(SUBMIT_BUTTON);
    }

    public WebElement getNameValidationMessage() {
        return getWebDriver().findElement(NAME_VALIDATION_MESSAGE);
    }

    public WebElement getSurnameValidationMessage() {
        return getWebDriver().findElement(SURNAME_VALIDATION_MESSAGE);
    }

    public WebElement getPhoneValidationMessage() {
        return getWebDriver().findElement(PHONE_VALIDATION_MESSAGE);
    }

    public WebElement getPasswordValidationMessage() {
        return getWebDriver().findElement(PASSWORD_VALIDATION_MESSAGE);
    }

    public WebElement getNameField() {
        return getWebDriver().findElement(NAME_FIELD);
    }

    public WebElement getSurnameField() {
        return getWebDriver().findElement(SURNAME_FIELD);
    }

    public WebElement getPhoneField() {
        return getWebDriver().findElement(PHONE_FIELD);
    }

    public WebElement getPasswordField() {
        return getWebDriver().findElement(PASSWORD_FIELD);
    }
}
