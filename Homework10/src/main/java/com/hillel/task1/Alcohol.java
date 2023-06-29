package com.hillel.task1;

public abstract class Alcohol {
    float percentageOfAlcohol;
    String name;
    boolean carbonated;

    public Alcohol(float percentageOfAlcohol, String name, boolean carbonated) {
        this.percentageOfAlcohol = percentageOfAlcohol;
        this.name = name;
        this.carbonated = carbonated;
    }
}
