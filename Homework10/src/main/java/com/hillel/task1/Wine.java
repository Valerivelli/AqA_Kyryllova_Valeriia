package com.hillel.task1;

public class Wine extends Alcohol {
    private String typeOfWine;
    private String color;
    private String sortOfGrape;
    private int yearOfProduction;

    public Wine(float percentageOfAlcohol, String name, boolean carbonated, String typeOfWine, String color, String sortOfGrape, int yearOfProduction) {
        super(percentageOfAlcohol, name, carbonated);
        this.typeOfWine = typeOfWine;
        this.color = color;
        this.sortOfGrape = sortOfGrape;
        this.yearOfProduction = yearOfProduction;
    }

    public void setTypeOfWine(String typeOfWine) {
        this.typeOfWine = typeOfWine;
    }

    public void setColor(String colorOfWine) {
        this.color = colorOfWine;
    }

    public void setSortOfGrape(String sortOfGrape) {
        this.sortOfGrape = sortOfGrape;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getTypeOfWine() {
        return typeOfWine;
    }

    public String getColor() {
        return color;
    }

    public String getSortOfGrape() {
        return sortOfGrape;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
