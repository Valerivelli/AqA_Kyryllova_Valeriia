package com.hillel;

import com.hillel.exceprions.WrongLoginException;
import com.hillel.exceprions.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSuccessfulValidation = false;

        System.out.println("Please enter your login:");
        String login = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        System.out.println("Please confirm your password:");
        String confirmPassword = scanner.nextLine();

        try {
            LoginUtils.validateUserLoginData(login, password, confirmPassword);
            isSuccessfulValidation = true;
        } catch (WrongLoginException e) {
            System.out.println(e);
        } catch (WrongPasswordException ex) {
            System.out.println(ex);
        } finally {
            if (isSuccessfulValidation) {
                System.out.println(" Successfully validation!");
            } else System.out.println("Incorrect validation!");
        }

    }

}



