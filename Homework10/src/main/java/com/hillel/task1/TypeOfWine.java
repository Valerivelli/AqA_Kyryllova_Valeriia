package com.hillel.task1;

public enum TypeOfWine {
    DRY("dry"),
    SEMI_DRY("semi-dry"),
    SWEET("sweet"),
    SEMI_SWEET("semi-sweet"),
    SHERRY("sherry"),
    PORT("port");

    private final String value;

    TypeOfWine(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
