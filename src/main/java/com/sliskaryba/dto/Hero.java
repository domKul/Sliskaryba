package com.sliskaryba.dto;

import com.sliskaryba.enums.HeroColor;

import java.util.Objects;

public class Hero {

    private String name;
    private int experience;
    private HeroColor heroColor;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return experience == hero.experience && Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
