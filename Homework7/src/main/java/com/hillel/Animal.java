package com.hillel;

public class Animal {
    private String breed;

    public Animal(String breed) {
        this.breed = breed;
    }

    public String printAnimalBreed() {

        return "It`s " + breed;
    }
}
