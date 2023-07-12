package com.hillel;

public class Androids implements Smartphones{
    @Override
    public void calls() {
        System.out.println("Calling from Android...");
    }

    @Override
    public void sms() {
        System.out.println("Sending sms from Android...");
    }

    @Override
    public void internet() {
        System.out.println("Accessing the Internet from Android");
    }
}
