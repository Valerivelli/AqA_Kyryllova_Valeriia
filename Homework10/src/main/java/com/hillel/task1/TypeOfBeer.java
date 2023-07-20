package com.hillel.task1;

public enum TypeOfBeer {
    LAGER("lager"),
    DUNKEL("dunkel"),
    ALE("ale"),
    WEISSE("weisee");

    private final String type;

    TypeOfBeer(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
