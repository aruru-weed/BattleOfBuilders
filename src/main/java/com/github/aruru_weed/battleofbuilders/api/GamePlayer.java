package com.github.aruru_weed.battleofbuilders.api;

import org.bukkit.entity.Player;

public interface GamePlayer extends BoBObject {
    Player getPlayer();
    int getLevel();
    GameClass getGameClass();
    void setGameClass(GameClass clazz);
    GameTeam getTeam();
    GameWorld getWorld();
}
