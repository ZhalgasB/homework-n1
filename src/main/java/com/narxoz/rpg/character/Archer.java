package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character{

    private String name;
    private Weapon weapon;
    private Armor armor;

    public Archer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public int getMana() {
        return 50;
    }

    @Override
    public int getStrength() {
        return 50;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

    @Override
    public String useSpecialAbility() {
        return "Magic Arrow shot!";
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;

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
