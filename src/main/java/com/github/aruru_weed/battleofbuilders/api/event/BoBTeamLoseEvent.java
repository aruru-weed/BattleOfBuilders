package com.github.aruru_weed.battleofbuilders.api.event;

import com.github.aruru_weed.battleofbuilders.api.GameTeam;
import org.bukkit.event.HandlerList;

public class BoBTeamLoseEvent extends BoBTeamEvent{
    static HandlerList handlerList;

    public BoBTeamLoseEvent(GameTeam team) {
        super(team);
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
