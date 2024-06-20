package com.sliskaryba.service;

import com.sliskaryba.dto.Hero;
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
}
