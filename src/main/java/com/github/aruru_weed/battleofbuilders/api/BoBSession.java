package com.github.aruru_weed.battleofbuilders.api;

import com.github.aruru_weed.battleofbuilders.api.event.BoBGameEndEvent;
import com.github.aruru_weed.battleofbuilders.api.event.BoBGameStartEvent;
import org.bukkit.World;

import java.util.List;
import java.util.UUID;

import static org.bukkit.Bukkit.getServer;

public class BoBSession {
    static List<BoBSession> sessions;

    public static List<BoBSession> getSessions() {
        return sessions;
    }

    UUID uuid;
    GameWorld gameWorld;

    public BoBSession(World world) {
        uuid = UUID.randomUUID();
    }

    public UUID getUUID() {
        return uuid;
    }

    public GameWorld getGameWorld() {
        return gameWorld;
    }

    public void gameStart(){
        getServer().getPluginManager().callEvent(new BoBGameStartEvent(this));
    }

    public void gameEnd(){
        getServer().getPluginManager().callEvent(new BoBGameEndEvent(this));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BoBSession)
            if (((BoBSession) obj).uuid.equals(uuid))
                return true;
        return super.equals(obj);
    }
}
