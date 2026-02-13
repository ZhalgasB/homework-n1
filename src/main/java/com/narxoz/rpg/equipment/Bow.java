package com.narxoz.rpg.equipment;

public class Bow implements Weapon{
    @Override
    public int getDamage() {
        return 30;
    }

    @Override
    public String getWeaponInfo() {
        return "Bow dmg:30,range:400m";
    }
}
