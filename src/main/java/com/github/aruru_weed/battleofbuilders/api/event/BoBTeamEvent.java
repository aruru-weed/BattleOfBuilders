package com.github.aruru_weed.battleofbuilders.api.event;

import com.github.aruru_weed.battleofbuilders.api.BoBObject;
import com.github.aruru_weed.battleofbuilders.BoBSession;
import com.github.aruru_weed.battleofbuilders.api.GameTeam;
import org.bukkit.event.Event;

public abstract class BoBTeamEvent extends Event implements BoBObject {
    GameTeam gameTeam;

    public BoBTeamEvent(GameTeam team) {
        this.gameTeam = team;
    }

    public GameTeam getGameTeam() {
        return gameTeam;
    }

    @Override
    public BoBSession getBoBSession() {
        return gameTeam.getBoBSession();
    }
}
