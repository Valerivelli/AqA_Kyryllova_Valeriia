package com.hillel.task1;

public enum ColorOfWine {
    RED("red"),
    WHITE("white"),
    ROSE("rose"),
    ORANGE("orange");

    private final String color;

    ColorOfWine(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
