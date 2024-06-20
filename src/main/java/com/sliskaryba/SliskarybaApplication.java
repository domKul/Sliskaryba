package com.sliskaryba;

import com.sliskaryba.api.Menu;
import com.sliskaryba.dto.Monster;
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
                        heroService.getHeroList().forEach(System.out::println);
                        continueLoop = false;
                    }
                    case "b" -> {
                        enemyList.forEach(System.out::println);
                        continueLoop = false;
                    }
                    default -> {
                        System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
                    }
                }
            } while (continueLoop);
        }


    }

}
