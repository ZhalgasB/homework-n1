package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Warrior implements Character {

    private String name;
    private Weapon weapon;
    private Armor armor;


    public Warrior(String name) {
        this.name = name;
    }




    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return 150;
    }

    @Override
    public int getMana() {
        return 30;
    }

    @Override
    public int getStrength() {
        return 80;
    }

    @Override
    public int getIntelligence() {
        return 20;
    }


    public String useSpecialAbility() {
        return " uses BERSERKER RAGE! Strength temporarily increased!";
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon =weapon;

    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor= armor;

    }

    public String getEquipmentInfo() {
        String weaponText = "no weapon";

        if (weapon != null){
            weaponText = weapon.getWeaponInfo();
        }
        String armorText = "no armor";
        if (armor != null){
            armorText = armor.getArmorInfo();
        }

        return "Weapon: " + weaponText + "Armor: " + armorText;
    }

}
