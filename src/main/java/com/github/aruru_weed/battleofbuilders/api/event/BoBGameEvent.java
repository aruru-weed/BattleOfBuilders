package com.github.aruru_weed.battleofbuilders.api.event;

import com.github.aruru_weed.battleofbuilders.api.BoBObject;
import com.github.aruru_weed.battleofbuilders.BoBSession;
import org.bukkit.event.Event;

public abstract class BoBGameEvent extends Event implements BoBObject {
    BoBSession session;

    public BoBGameEvent(BoBSession session) {
        this.session = session;
    }

    @Override
    public BoBSession getBoBSession() {
        return session;
    }
}