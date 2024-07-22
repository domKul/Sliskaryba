package com.sliskaryba.enums;

public enum Dice {
    ONE(1,"1"),
    TWO(2,"2"),
    THREE(3,"3"),
    UP(0,"up");

    private final String value;
    private final int diceScore;

    Dice( int valueInt,String value) {
        this.diceScore = valueInt;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Dice getDice(int diceScore) {
        return Dice.values()[diceScore];
    }
}
