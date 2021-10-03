package com.github.aruru_weed.battleofbuilders.api.event;

import com.github.aruru_weed.battleofbuilders.api.BoBObject;
import com.github.aruru_weed.battleofbuilders.api.BoBSession;
import com.github.aruru_weed.battleofbuilders.api.GamePlayer;
import org.bukkit.event.player.PlayerEvent;

public abstract class BoBGamePlayerEvent extends PlayerEvent implements BoBObject {
    GamePlayer gamePlayer;

    public BoBGamePlayerEvent(GamePlayer gamePlayer) {
        super(gamePlayer.getPlayer());
        this.gamePlayer = gamePlayer;
    }

    @Override
    public BoBSession getBoBSession() {
        return gamePlayer.getBoBSession();
    }
}
