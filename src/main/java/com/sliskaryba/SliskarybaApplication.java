package com.sliskaryba;

import com.sliskaryba.api.Menu;
import com.sliskaryba.dto.Hero;
import com.sliskaryba.dto.Monster;
import com.sliskaryba.enums.Dice;
import com.sliskaryba.service.HeroService;
import com.sliskaryba.service.MonsterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SliskarybaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SliskarybaApplication.class, args);
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.display();
        MonsterService monsterService = new MonsterService();
        HeroService heroService = new HeroService();
        List<Monster> monsterList = monsterService.getMonsterList();
        List<Monster> enemyList = new ArrayList<>();
        while (enemyList.size() < 3) {
            int i = random.nextInt(0, 4);
            Monster monster = monsterList.get(i);
            enemyList.add(monster);
        }

        boolean continueLoop = true;
        try(sc){
            do {
                String playerInput = sc.nextLine().toLowerCase();
                switch (playerInput) {
                    case "a" -> {
                        enemyList.forEach(System.out::println);
                        continueLoop = false;
                    }
                    case "b" -> {
                        heroService.getHeroList().forEach(System.out::println);
                        continueLoop = false;
                    }case "c" -> {
                        List<Hero> heroListAfterThrowingDices = throwDices(heroService.getHeroList());
                        heroService.updateExperience(heroListAfterThrowingDices);
                        heroListAfterThrowingDices.forEach(System.out::println);
                        continueLoop = false;
                    }
                    default -> {
                        System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
                    }
                }
            } while (continueLoop);
        }


    }

    static List<Hero>throwDices(List<Hero> heroList) {
        Random random = new Random();
        for (Hero hero : heroList) {
            int throw1 = random.nextInt(4);
            int throw2 = random.nextInt(4);
            hero.setDice1(Dice.getDice(throw1));
            hero.setDice2(Dice.getDice(throw2));
        }
        return heroList;
    }

}
