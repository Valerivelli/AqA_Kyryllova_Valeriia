package com.hillel;

import com.hillel.exceprions.WrongLoginException;
import com.hillel.exceprions.WrongPasswordException;

import java.util.Scanner;

public class LoginUtils {

    public static boolean validateLogin(String login) throws WrongLoginException {
        if (login.contains("_") && login.length() > 20) {
            System.out.println("Successfully validation of login!");
            return true;
        } else throw new WrongLoginException("Incorrect login");
    }

    public static boolean validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.contains("_") && password.contains("!") && password.length() < 20 && password.equals(confirmPassword)) {
            System.out.println(" Successfully validation of password!");
            return true;
        } else throw new WrongPasswordException("Incorrect password");

    }

    public static boolean validateUserLoginData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        return validateLogin(login) && validatePassword(password, confirmPassword);
    }

    public static boolean getAndValidateUserInputData() {
        Scanner scanner = new Scanner(System.in);
        boolean isSuccessfulValidation = false;

        System.out.println("Please enter your login:");
        String login = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        System.out.println("Please confirm your password:");
        String confirmPassword = scanner.nextLine();

        try {
            return LoginUtils.validateUserLoginData(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println(e);
        } catch (WrongPasswordException ex) {
            System.out.println(ex);
        }
        return isSuccessfulValidation;

    }
}
