package com.github.aruru_weed.battleofbuilders.api.event;

import com.github.aruru_weed.battleofbuilders.api.GamePlayer;
import org.bukkit.event.HandlerList;

public class BoBGamePlayerJoinEvent extends BoBGamePlayerEvent {
    static HandlerList handlerList;

    public BoBGamePlayerJoinEvent(GamePlayer gamePlayer) {
        super(gamePlayer);
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
