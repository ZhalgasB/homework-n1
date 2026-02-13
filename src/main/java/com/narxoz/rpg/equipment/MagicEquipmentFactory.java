package com.narxoz.rpg.equipment;

public class MagicEquipmentFactory implements EquipmentFactory{
    @Override
    public Weapon createWeapon() {
        return new Staff();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
