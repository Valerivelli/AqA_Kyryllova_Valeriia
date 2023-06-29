package com.hillel.task1;

public class Wine extends Alcohol {
    String typeOfWine;
    String color;
    String sortOfGrape;
    int yearOfProduction;

    public Wine(float percentageOfAlcohol, String name, boolean carbonated, String typeOfWine, String color, String sortOfGrape, int yearOfProduction) {
        super(percentageOfAlcohol, name, carbonated);
        this.typeOfWine = typeOfWine;
        this.color = color;
        this.sortOfGrape = sortOfGrape;
        this.yearOfProduction = yearOfProduction;
    }
}
