package com.example.user.dartplayerrankings;

import java.util.ArrayList;

/**
 * Created by User on 12/12/2016.
 */
public class PlayerRankings {
    private ArrayList<Player> players;

    public PlayerRankings(){
        this.players = new ArrayList<Player>();
    }

    public PlayerRankings(ArrayList<Player> inputPlayers){
        this.players = new ArrayList<Player>(inputPlayers);
        for (Player player: inputPlayers) {
            this.players.set(player.getRanking()-1, player);
        }
    }

    public int getPlayersSize() {
        return players.size();
    }

    public Player getPlayerByRanking(int ranking) {
        return players.get(ranking-1);
    }

    public void replaceLowestRankedPlayer(Player player) {
        players.set(players.size()-1, player);
    }

    public Player getPlayerByName(String name) {
        for(Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public void setAllPlayerRankingsByIndex() {
        for (int i=0; i<players.size(); i++) {
            players.get(i).setRanking(i+1);
        }
    }

    public void movePlayerByOne(Player player, String change) {
        ArrayList<Player> tempPlayers = new ArrayList<Player>(players);
        for(int i=0; i<players.size(); i++) {
            if (players.get(i) == player ) {
                if (change.equals("moveUp")) {
                    if (i != 0) {
                        tempPlayers.set(i - 1, players.get(i));
                        tempPlayers.set(i, players.get(i - 1));
                    }
                } else if (change.equals("moveDown")) {
                    if (i != players.size()) {
                    tempPlayers.set(i+1, players.get(i));
                    tempPlayers.set(i, players.get(i+1));
                    }
                }
            }
        }
        players = tempPlayers;
        setAllPlayerRankingsByIndex();
    }

}
