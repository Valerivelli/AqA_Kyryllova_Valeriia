package com.hillel;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("frenchie");
        Animal animal2 = new Animal("Jack Rassel");
        Dog dog1 = new Dog("Dylan", animal1);
        Dog dog2 = new Dog("Bonnie", 3, animal2, "brown");

        dog1.printDogCharacteristic();
        dog2.printDogCharacteristic();
    }
}
