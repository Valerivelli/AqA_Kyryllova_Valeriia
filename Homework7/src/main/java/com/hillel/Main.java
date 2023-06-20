package com.hillel;

public class Main {
    public static void main(String[] args) {
        Tail animal1 = new Tail(false);
        Tail animal2 = new Tail(true);
        Dog dog1 = new Dog("Dylan","frenchie",animal1);
        Dog dog2 = new Dog("Bonnie", 3, "Jack Rassel", animal2, "brown");

        dog1.printDogCharacteristic();
        dog2.printDogCharacteristic();
    }
}
