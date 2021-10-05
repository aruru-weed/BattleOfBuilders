package com.github.aruru_weed.battleofbuilders.api;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.List;

public interface GameTeam extends BoBObject {
    Tower getMainTowers();
    List<Tower> getSubTowers();
    List<GamePlayer> getMembers();

    GamePlayer addPlayer(Player player);

    boolean breakTower(Tower tower);

    Team getTeam();

    String name();
    void setName(String str);

    boolean isLose();
}