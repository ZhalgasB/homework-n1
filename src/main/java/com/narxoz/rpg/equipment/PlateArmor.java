package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor{
    @Override
    public int getDefense() {
        return 30;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor def:30";
    }
}
