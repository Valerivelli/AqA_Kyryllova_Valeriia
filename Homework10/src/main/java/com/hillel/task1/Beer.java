package com.hillel.task1;

public class Beer extends Alcohol {

    private String type;
    private String color;

    @Override
    public void printObject() {
        System.out.println(this.toString());
    }

    public void setType(String typeOfBeer) {
        this.type = typeOfBeer;
    }

    public String getType() {
        return type;
    }

    public void setColor(String colorOfbeer) {
        this.color = colorOfbeer;
    }

    public String getColor() {
        return color;
    }

    public Beer(float percentageOfAlcohol, String name, boolean carbonation, String type, String color) {
        super(percentageOfAlcohol, name, carbonation);
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "Name: " + this.getName() + "\n" +
                "Percentage of alcohol: " + this.getPercentageOfAlcohol() + "\n" +
                "Is it carbonated? " + this.isCarbonated() + "\n" +
                "type = " + type + "\n" +
                "color = " + color + "\n" +
                '}';
    }
}
