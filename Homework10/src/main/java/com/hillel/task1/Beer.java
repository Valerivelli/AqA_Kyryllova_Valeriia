package com.hillel.task1;

public class Beer extends Alcohol {

    private String type;
    private String color;

    public void setType(String typeOfBeer){
        this.type = typeOfBeer;
    }
    public String getType(){
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
}
