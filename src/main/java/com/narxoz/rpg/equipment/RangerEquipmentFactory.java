package com.narxoz.rpg.equipment;

public class RangerEquipmentFactory implements EquipmentFactory{
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new Leather();
    }
}
