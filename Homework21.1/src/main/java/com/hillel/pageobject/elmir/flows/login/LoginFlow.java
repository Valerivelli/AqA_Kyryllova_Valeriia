package com.hillel.pageobject.elmir.flows.login;

import com.hillel.pageobject.elmir.login.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow {
    private LoginPage loginPage;

    public LoginFlow(WebDriver webDriver) {
        this.loginPage = new LoginPage(webDriver);
    }

    public void authoButton(){
        loginPage.getAuthoButton().click();
    }

    public void fillEmailField(String email){
        loginPage.getLoginField().sendKeys(email);
    }

    public void fillPasswordField(String password){
        loginPage.getPasswordField().sendKeys(password);
    }

    public void loginButton(){
        loginPage.getLoginButton().click();
    }

    public String getPasswordValidationMessage(){
        return loginPage.getPasswordValidationMessage().getText();
    }

    public void login(String login, String password){
        authoButton();
        fillEmailField(login);
        fillPasswordField(password);
        loginButton();
    }
}
