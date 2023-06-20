package com.hillel;

public class Dog {
    private String name;
    private int age;
    private Tail tail;

    private String breed;
    private String color;

    public Dog(String name, int age, String breed, Tail tail, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.tail = tail;
        this.color = color;
    }

    public Dog(String name, String breed, Tail tail) {
        this.name = name;
        this.breed = breed;
        this.tail = tail;
    }

    public void printDogCharacteristic() {
        System.out.println("Dog name: " + name + " ,age: " + age + " ,breed: " + breed + " ," + tail.printAnimalProperties() + " ,color: " + color);
    }
}
