package com.hillel;

public class Dog {
    private String name;
    private int age;
    private Animal animal;
    private String color;

    public Dog(String name, int age, Animal animal, String color) {
        this.name = name;
        this.age = age;
        this.animal = animal;
        this.color = color;
    }

    public Dog(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public void printDogCharacteristic() {
        System.out.println("Dog name: " + name + " ,age: " + age + " , breed: " + animal.printAnimalBreed() + " ,color: " + color);
    }
}
