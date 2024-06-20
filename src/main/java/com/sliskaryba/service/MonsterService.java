package com.sliskaryba.service;

import com.sliskaryba.dto.Monster;

import java.util.List;

public class MonsterService {
    private List<Monster> monsterList;

    public MonsterService() {
        this.monsterList = List.of(
                new Monster("monster1",10,6),
                new Monster("monster2",1,0),
                new Monster("monster3",2,2),
                new Monster("monster4",5,2),
                new Monster("monster5",3,1)
        );
    }

    public List<Monster> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(List<Monster> monsterList) {
        this.monsterList = monsterList;
    }
}
