package com.hillel;

import com.hillel.exceprions.WrongLoginException;
import com.hillel.exceprions.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginUtils.getAndValidateUserInputData();
    }
}



