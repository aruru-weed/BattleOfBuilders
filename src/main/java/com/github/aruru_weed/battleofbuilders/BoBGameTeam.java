package com.github.aruru_weed.battleofbuilders;

import com.github.aruru_weed.battleofbuilders.api.BoBSession;
import com.github.aruru_weed.battleofbuilders.api.GamePlayer;
import com.github.aruru_weed.battleofbuilders.api.GameTeam;
import com.github.aruru_weed.battleofbuilders.api.Tower;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.List;

public class BoBGameTeam implements GameTeam {
    BoBGameWorld world;
    Tower mainTower;
    List<Tower> subTowers;
    List<Tower> breakTowers;
    List<GamePlayer> members;
    boolean lose = false;

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
        return null;
    }

    @Override
    public boolean isLose() {
        return lose;
    }
}
