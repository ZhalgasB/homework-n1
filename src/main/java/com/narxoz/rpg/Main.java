package com.narxoz.rpg;


import com.narxoz.rpg.character.*;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.EquipmentFactory;
import com.narxoz.rpg.equipment.GladiatorEquipmentFactory;
import com.narxoz.rpg.equipment.MagicEquipmentFactory;
import com.narxoz.rpg.equipment.RangerEquipmentFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        // TODO: Demonstrate Factory Method Pattern
        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.orderCharacter("SonJo");

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.orderCharacter("Isha");

        CharacterFactory archerFactory = new ArcherFactory();
        Character archer = archerFactory.orderCharacter("Fin");
        System.out.println("\n=== Initial stats ===\n");
        displayCharacter(warrior);
        displayCharacter(mage);
        displayCharacter(archer);



        // TODO: Demonstrate Abstract Factory Pattern
        EquipmentFactory gladiatorSet = new GladiatorEquipmentFactory();
        EquipmentFactory magicSet = new MagicEquipmentFactory();
        EquipmentFactory rangerSet = new RangerEquipmentFactory();

        warrior.equipWeapon(gladiatorSet.createWeapon());
        warrior.equipArmor(gladiatorSet.createArmor());

        mage.equipWeapon(magicSet.createWeapon());
        mage.equipArmor(magicSet.createArmor());

        archer.equipWeapon(rangerSet.createWeapon());
        archer.equipArmor(rangerSet.createArmor());

        System.out.println("\n=== After equipping ===\n");

        displayCharacter(warrior);
        displayCharacter(mage);
        displayCharacter(archer);

        System.out.println("\\n=== Special abilities ===\\n");
        System.out.println(warrior.getName() + " > " + warrior.useSpecialAbility());
        System.out.println(mage.getName() + " > " + mage.useSpecialAbility());
        System.out.println(archer.getName() + " > " + archer.useSpecialAbility());



        System.out.println("\n=== Demo Complete ===");
    }
    private static void displayCharacter(Character c){
        System.out.println("Character: " + c.getName());
        System.out.println("Hp: " + c.getHealth() + " " + "Mana: " + c.getMana()+ " " + "Str: " + c.getStrength() + " " + "Int: " + c.getIntelligence());
        System.out.println("Equipment: " + c.getEquipmentInfo());
        System.out.println();

    }
}
