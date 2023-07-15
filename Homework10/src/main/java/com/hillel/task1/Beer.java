package com.hillel.task1;

public class Beer extends Alcohol {

    private TypeOfBeer typeOfBeer;
    private String color;

    public void setType(TypeOfBeer typeOfBeer) {
        this.typeOfBeer = typeOfBeer;
    }

    public TypeOfBeer getType() {
        return typeOfBeer;
    }

    public void setColor(String colorOfbeer) {
        this.color = colorOfbeer;
    }

    public String getColor() {
        return color;
    }

    public Beer(float percentageOfAlcohol, String name, boolean carbonation, TypeOfBeer typeOfBeer, String color) {
        super(percentageOfAlcohol, name, carbonation);
        this.typeOfBeer = typeOfBeer;
        this.color = color;
    }

    @Override
    public void printObject() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Beer{" +
                "Name: " + this.getName() + "\n" +
                "Percentage of alcohol: " + this.getPercentageOfAlcohol() + "\n" +
                "Is it carbonated? " + this.isCarbonated() + "\n" +
                "type = " + typeOfBeer + "\n" +
                "color = " + color + "\n" +
                '}';
    }
}
