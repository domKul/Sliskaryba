package com.sliskaryba.dto;

import com.sliskaryba.enums.HeroColor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Monster {

    private String name;
    private int healthPoints;
    private int victoryPoints;
    private Map<HeroColor,Integer> heroColorIntegerMap = new HashMap<>();

    public Monster() {
    }

    public Monster(String name, int healthPoints, int victoryPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.victoryPoints = victoryPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return healthPoints == monster.healthPoints && victoryPoints == monster.victoryPoints && Objects.equals(name, monster.name) && Objects.equals(heroColorIntegerMap, monster.heroColorIntegerMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, healthPoints, victoryPoints, heroColorIntegerMap);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", victoryPoints=" + victoryPoints +
                ", heroColorIntegerMap=" + heroColorIntegerMap +
                '}';
    }
}
