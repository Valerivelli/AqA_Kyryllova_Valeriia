package com.hillel;

import com.hillel.exceprions.WrongLoginException;
import com.hillel.exceprions.WrongPasswordException;

public class LoginUtils {

    public static boolean validateLogin(String login) throws WrongLoginException {
        if (login.contains("_") && login.length() > 20) {
            return true;
        } else throw new WrongLoginException("Incorrect login");
    }

    public static boolean validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.contains("_") && password.contains("!") && password.length() < 20 && password.equals(confirmPassword)) {
            return true;
        } else throw new WrongPasswordException("Incorrect password");

    }

    public static boolean validateUserLoginData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        return validateLogin(login) && validatePassword(password, confirmPassword);
    }
}
