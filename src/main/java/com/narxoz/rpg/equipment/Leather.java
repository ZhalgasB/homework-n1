package com.narxoz.rpg.equipment;

public class Leather implements Armor{
    @Override
    public int getDefense() {
        return 20;
    }

    @Override
    public String getArmorInfo() {
        return "Leather def:20,agility +";
    }
}
