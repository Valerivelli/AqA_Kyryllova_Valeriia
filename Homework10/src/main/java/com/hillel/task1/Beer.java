package com.hillel.task1;

public class Beer extends Alcohol {

    String type;
    String color;

    public Beer(float percentageOfAlcohol, String name, boolean carbonation, String type, String color) {
        super(percentageOfAlcohol, name, carbonation);
        this.type = type;
        this.color = color;
    }
}
