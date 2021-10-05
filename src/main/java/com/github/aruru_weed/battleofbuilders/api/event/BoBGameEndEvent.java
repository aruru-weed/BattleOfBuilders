package com.github.aruru_weed.battleofbuilders.api.event;

import com.github.aruru_weed.battleofbuilders.BoBSession;
import org.bukkit.event.HandlerList;

public class BoBGameEndEvent extends BoBGameEvent{
    static HandlerList handlerList;

    public BoBGameEndEvent(BoBSession session) {
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
