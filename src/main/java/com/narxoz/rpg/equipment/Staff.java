package com.narxoz.rpg.equipment;

public class Staff implements Weapon{
    @Override
    public int getDamage() {
        return 30;
    }

    @Override
    public String getWeaponInfo() {
        return "Staff dmg:30,mana:+10";
    }
}
