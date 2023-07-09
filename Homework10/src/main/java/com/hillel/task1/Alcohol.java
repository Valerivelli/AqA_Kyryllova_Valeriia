package com.hillel.task1;

public abstract class Alcohol {
    private float percentageOfAlcohol;
    private String name;
    private boolean carbonated;

    public Alcohol(float percentageOfAlcohol, String name, boolean carbonated) {
        this.percentageOfAlcohol = percentageOfAlcohol;
        this.name = name;
        this.carbonated = carbonated;
    }

    public abstract void printObject();

    public float getPercentageOfAlcohol() {
        return percentageOfAlcohol;
    }

    public void setPercentageOfAlcohol(float percentageOfAlcohol) {
        this.percentageOfAlcohol = percentageOfAlcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCarbonated() {
        return carbonated;
    }

    public void setCarbonated(boolean carbonated) {
        this.carbonated = carbonated;
    }

}
