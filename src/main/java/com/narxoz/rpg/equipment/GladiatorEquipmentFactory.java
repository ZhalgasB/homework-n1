package com.narxoz.rpg.equipment;

public class GladiatorEquipmentFactory implements EquipmentFactory{
    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}
