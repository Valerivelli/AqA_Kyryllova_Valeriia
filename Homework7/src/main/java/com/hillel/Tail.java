package com.hillel;

public class Tail {
    private boolean isTail;

    public Tail(boolean isTail) {
        this.isTail = isTail;
    }

    public String printAnimalProperties() {
        return "has tail: " + isTail;
    }
}
