package com.github.aruru_weed.battleofbuilders.api.event;

import com.github.aruru_weed.battleofbuilders.BoBSession;
import org.bukkit.event.HandlerList;

public class BoBGameStartEvent extends BoBGameEvent{
    static HandlerList handlerList;

    public BoBGameStartEvent(BoBSession session) {
        super(session);
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
