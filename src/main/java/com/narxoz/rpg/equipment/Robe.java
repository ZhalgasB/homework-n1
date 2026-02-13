package com.narxoz.rpg.equipment;

public class Robe implements Armor{
    @Override
    public int getDefense() {
        return 10;
    }

    @Override
    public String getArmorInfo() {
        return "Robe def:10,mana:25";
    }
}
