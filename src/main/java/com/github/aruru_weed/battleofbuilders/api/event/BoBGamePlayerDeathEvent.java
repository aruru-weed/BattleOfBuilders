package com.github.aruru_weed.battleofbuilders.api.event;

import com.github.aruru_weed.battleofbuilders.api.GamePlayer;
import org.bukkit.event.HandlerList;

public class BoBGamePlayerDeathEvent extends BoBGamePlayerEvent {
    static HandlerList handlerList;

    public BoBGamePlayerDeathEvent(GamePlayer gamePlayer) {
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
