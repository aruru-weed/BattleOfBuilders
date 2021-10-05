package com.github.aruru_weed.battleofbuilders.api;

import com.github.aruru_weed.battleofbuilders.api.event.BoBGameEndEvent;
import com.github.aruru_weed.battleofbuilders.api.event.BoBGameStartEvent;

import java.util.UUID;

import static org.bukkit.Bukkit.getServer;

public interface GameSession extends BoBObject {
    void gameStart();
    void gameEnd();
    UUID getUUID();
    GameWorld getGameWorld();
}
