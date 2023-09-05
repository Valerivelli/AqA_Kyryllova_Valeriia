package com.hillel.pageobject.elmir.login;

import com.hillel.pageobject.elmir.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends AbstractPage {  //хранит локаторы для элеметов и геттеры для элементов
    private static final By LOGIN_FIELD = By.xpath("//input[@name=\"login\"]");
    private static final By PASSWORD_FIELD = By.xpath("//input[@name=\"password\"]");
    private static final By LOGIN_BUTTON = By.xpath("//button[@class=\"mw-submit\"]");

    private static final By AUTHO_BUTTON = By.xpath("//div[@id =\"autho\"]");
    private static final By PASSWORD_VALIDATION_MESSAGE = By.xpath("//div[@class=\"mw_error_text\"]");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getLoginField() {
        return getWebDriver().findElement(LOGIN_FIELD);
    }

    public WebElement getPasswordField() {
        return getWebDriver().findElement(PASSWORD_FIELD);
    }

    public WebElement getLoginButton() {
        return getWebDriver().findElement(LOGIN_BUTTON);
    }

    public WebElement getAuthoButton() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(AUTHO_BUTTON));
    }

    public WebElement getPasswordValidationMessage() {
        return getWebDriver().findElement(PASSWORD_VALIDATION_MESSAGE);
    }
}
