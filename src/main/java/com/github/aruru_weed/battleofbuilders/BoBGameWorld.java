package com.github.aruru_weed.battleofbuilders;

import com.github.aruru_weed.battleofbuilders.api.BoBSession;
import com.github.aruru_weed.battleofbuilders.api.GamePlayer;
import com.github.aruru_weed.battleofbuilders.api.GameTeam;
import com.github.aruru_weed.battleofbuilders.api.GameWorld;
import org.bukkit.World;

import java.util.List;

public class BoBGameWorld implements GameWorld {
    BoBSession session;
    World world;
    List<GameTeam> teams;
    List<GameTeam> losers;

    public BoBGameWorld(BoBSession session, World world, List<GameTeam> teams) {
        this.session = session;
        this.world = world;
        this.teams = teams;
    }

    @Override
    public BoBSession getBoBSession() {
        return session;
    }

    @Override
    public List<GameTeam> getTeams() {
        return teams;
    }

    @Override
    public World getWorld() {
        return world;
    }

    public boolean addLoser(GameTeam loseTeam) {
        losers.add(loseTeam);

        if (losers.size() == teams.size() - 1) {
            for (GameTeam team : teams)
                if (losers.contains(team)) {
                    for (GamePlayer loser : team.getMembers())
                        loser.lose();
                } else {
                    for (GamePlayer winner : team.getMembers())
                        winner.win();
                }
            session.gameEnd();
            return true;
        }
        return false;
    }
}
