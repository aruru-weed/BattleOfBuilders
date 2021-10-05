package com.github.aruru_weed.battleofbuilders;

import com.github.aruru_weed.battleofbuilders.api.*;
import org.bukkit.entity.Player;

public class BoBPlayer implements GamePlayer {
    public BoBPlayer(Player player, BoBTeam team){
        this.team = team;
        this.player = player;
    }

    GameClass clazz;
    Player player;
    BoBTeam team;

    void start(){

    }

    void win(){
        player.sendTitle("Win",team.name,5,10,5);
    }

    void lose(){
        player.sendTitle("Lose",team.name,5,10,5);
    }

    @Override
    public BoBSession getBoBSession() {
        return getWorld().getBoBSession();
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public int getLevel() {
        return player.getLevel();
    }

    @Override
    public GameClass getGameClass() {
        return clazz;
    }

    @Override
    public void setGameClass(GameClass clazz) {
        this.clazz = clazz;
    }

    @Override
    public GameTeam getTeam() {
        return team;
    }

    @Override
    public GameWorld getWorld() {
        return team.world;
    }
}
