package com.narxoz.rpg.character;

public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;


    public Warrior(String name) {
        this.name = name;
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
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

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public String useSpecialAbility() {
        return " uses BERSERKER RAGE! Strength temporarily increased!";
    }

}
