package com.hillel;

public class iPhones implements Smartphones{


    @Override
    public void calls() {
        System.out.println("Calling from Iphone...");
    }

    @Override
    public void sms() {
        System.out.println("Sending sms from Iphone...");
    }

    @Override
    public void internet() {
        System.out.println("Accessing the Internet from Iphone...");
    }
}
