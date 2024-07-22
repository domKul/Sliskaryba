package com.sliskaryba.dto;

import com.sliskaryba.enums.Dice;
import com.sliskaryba.enums.HeroColor;

import java.util.Objects;

public class Hero {

    private String name;
    private int experience;
    private HeroColor heroColor;
    private Dice dice1;
    private Dice dice2;

    public Hero(String name, HeroColor heroColor) {
        this.name = name;
        this.heroColor = heroColor;
        this.experience = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public HeroColor getHeroColor() {
        return heroColor;
    }

    public void setHeroColor(HeroColor heroColor) {
        this.heroColor = heroColor;
    }

    public Dice getDice1() {
        return dice1;
    }

    public void setDice1(Dice dice1) {
        this.dice1 = dice1;
    }

    public Dice getDice2() {
        return dice2;
    }

    public void setDice2(Dice dice2) {
        this.dice2 = dice2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return experience == hero.experience && Objects.equals(name, hero.name) && heroColor == hero.heroColor && dice1 == hero.dice1 && dice2 == hero.dice2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience, heroColor, dice1, dice2);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", heroColor=" + heroColor +
                ", dice1=" + dice1 +
                ", dice2=" + dice2 +
                '}';
    }
}
