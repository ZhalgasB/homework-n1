package com.narxoz.rpg.character;

public abstract class CharacterFactory {
    public  abstract Character createCharacter(String name);

    public Character orderCharacter(String name){
        Character character = createCharacter(name);
        System.out.println("Created character: " + character.getName() + " (" + character.getClass().getSimpleName() + ")");
        return character;
    }


}
