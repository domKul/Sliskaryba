package com.sliskaryba.service;

import com.sliskaryba.dto.Hero;
import com.sliskaryba.enums.Dice;
import com.sliskaryba.enums.HeroColor;

import java.util.List;

public class HeroService {

    private List<Hero>heroList;

    public HeroService() {
        this.heroList = List.of(
                new Hero("hero1", HeroColor.BLACK),
                new Hero("hero2",HeroColor.GREEN),
                new Hero("hero3",HeroColor.RED),
                new Hero("hero4",HeroColor.GREEN),
                new Hero("hero5",HeroColor.WHITE),
                new Hero("hero6",HeroColor.RED)
        );
    }

    public List<Hero> getHeroList() {
        return heroList;
    }

    public void setHeroList(List<Hero> heroList) {
        this.heroList = heroList;
    }

    public List<Hero> updateExperience(List<Hero>heroList){
         heroList.forEach(HeroService::heroExping);
         return heroList;
    }

    private static void heroExping(Hero hero) {
        if(hero.getDice1() == Dice.UP) {
            hero.setExperience(hero.getExperience()+1);
        }
        if(hero.getDice2() == Dice.UP) {
            hero.setExperience(hero.getExperience()+1);
        }
    }
}
