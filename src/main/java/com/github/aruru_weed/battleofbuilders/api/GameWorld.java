package com.github.aruru_weed.battleofbuilders.api;

import org.bukkit.World;

import java.util.List;

public interface GameWorld extends BoBObject{
    List<GameTeam> getTeams();

    World getWorld();
}
