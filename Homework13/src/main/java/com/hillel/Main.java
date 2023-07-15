package com.hillel;

public class Main {
    public static void main(String[] args) {
        iPhones iPhone13 = new iPhones();
        Androids oppo = new Androids();

        iPhone13.calls();
        iPhone13.sms();
        iPhone13.internet();

        System.out.println("------");

        oppo.calls();
        oppo.sms();
        oppo.internet();
    }


}
