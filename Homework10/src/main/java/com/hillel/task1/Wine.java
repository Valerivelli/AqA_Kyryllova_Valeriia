package com.hillel.task1;

public class Wine extends Alcohol {
    private TypeOfWine typeOfWines;
    private ColorOfWine colorOfWine;
    private String sortOfGrape;
    private int yearOfProduction;

    public Wine(float percentageOfAlcohol, String name, boolean carbonated, TypeOfWine typeOfWines, ColorOfWine colorOfWine, String sortOfGrape, int yearOfProduction) {
        super(percentageOfAlcohol, name, carbonated);
        this.typeOfWines = typeOfWines;
        this.colorOfWine = colorOfWine;
        this.sortOfGrape = sortOfGrape;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void printObject() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Wine{" +
                "Name: " + this.getName() + "\n" +
                "Percentage of alcohol: " + this.getPercentageOfAlcohol() + "\n" +
                "Is it carbonated? " + this.isCarbonated() + "\n" +
                "typeOfWine = " + typeOfWines + "\n" +
                "color = " + colorOfWine + "\n" +
                "sortOfGrape = " + sortOfGrape + "\n" +
                "yearOfProduction = " + yearOfProduction +
                '}';
    }

    public void setTypeOfWine(TypeOfWine typeOfWine) {
        this.typeOfWines = typeOfWine;
    }

    public void setColor(ColorOfWine colorOfWine) {
        this.colorOfWine = colorOfWine;
    }

    public void setSortOfGrape(String sortOfGrape) {
        this.sortOfGrape = sortOfGrape;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public TypeOfWine getTypeOfWine() {
        return typeOfWines;
    }

    public ColorOfWine getColor() {
        return colorOfWine;
    }

    public String getSortOfGrape() {
        return sortOfGrape;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
