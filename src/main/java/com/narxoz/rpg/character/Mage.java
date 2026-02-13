package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage  implements Character{

    private String name;
    private Weapon weapon;
    private Armor armor;

    public Mage(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return 70;
    }

    @Override
    public int getMana() {
        return 200;
    }

    @Override
    public int getStrength() {
        return 20;
    }

    @Override
    public int getIntelligence() {
        return 100;
    }

    @Override
    public String useSpecialAbility() {
        return "Fire blast!";
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;

    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor =armor;

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
