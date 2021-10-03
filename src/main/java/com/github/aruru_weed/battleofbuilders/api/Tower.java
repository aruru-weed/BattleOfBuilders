package com.github.aruru_weed.battleofbuilders.api;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

public interface Tower extends BoBObject{
    int getHealth();
    int getMaxHealth();

    boolean attack(int damage);

    boolean isBreak();

    ArmorStand getNamePlateDummy();
    Location getLocate();
}
