package com.github.aruru_weed.battleofbuilders;

import com.github.aruru_weed.battleofbuilders.api.GamePlayer;
import com.github.aruru_weed.battleofbuilders.api.GameTeam;
import com.github.aruru_weed.battleofbuilders.api.Tower;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.List;

public class BoBTeam implements GameTeam {
    BoBWorld world;
    Tower mainTower;
    List<Tower> subTowers;
    List<Tower> breakTowers;
    List<GamePlayer> members;
    boolean lose = false;
    Team team = null;
    String name;

    public void losing() {
        world.addLoser(this);
        // TODO タワー爆破演出
    }

    @Override
    public BoBSession getBoBSession() {
        return world.getBoBSession();
    }

    @Override
    public Tower getMainTowers() {
        return mainTower;
    }

    @Override
    public List<Tower> getSubTowers() {
        return subTowers;
    }

    @Override
    public List<GamePlayer> getMembers() {
        return members;
    }

    @Override
    public GamePlayer addPlayer(Player player) {
        return null;// TODO
    }

    @Override
    public boolean breakTower(Tower tower) {
        if (mainTower.equals(tower)) {
            losing();
            return true;
        }
        breakTowers.add(tower);
        return false;
    }

    @Override
    public Team getTeam() {
        return team;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void setName(String str) {
        name = str;
    }

    @Override
    public boolean isLose() {
        return lose;
    }
}
