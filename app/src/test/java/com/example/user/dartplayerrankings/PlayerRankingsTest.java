package com.example.user.dartplayerrankings;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

import java.util.ArrayList;

/**
 * Created by User on 12/12/2016.
 */
public class PlayerRankingsTest {
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    ArrayList<Player> players;
    PlayerRankings playerRankings;

    @Before
    public void setup() {
        player1 = new Player("Jeff", "The Javelin", 1);
        player2 = new Player("Frankie", "Fireball", 2);
        player3 = new Player("Thor", "Thrusty Fluster", 3);
        player4 = new Player("Bob", "Bullseye Bastard", 4);
        player5 = new Player("Sid", "Slinging Steely Slivers", 5);

        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        playerRankings = new PlayerRankings(players);
    }

    @Test
    public void testPlayersSize() {
        assertEquals(4, playerRankings.getPlayersSize());
    }

    @Test
    public void testGetPlayer4ByRanking() {
        assertEquals("Name: Bob, Nickname: Bullseye Bastard, Ranking: 4", playerRankings.getPlayerByRanking(4).toString());
    }

    @Test
    public void testGetPlayerByRanking() {
        assertEquals("Name: Thor, Nickname: Thrusty Fluster, Ranking: 3", playerRankings.getPlayerByRanking(3).toString());
    }

    @Test
    public void testReplaceLowestRankedPlayer() {
        assertEquals("Name: Bob, Nickname: Bullseye Bastard, Ranking: 4", playerRankings.getPlayerByRanking(players.size()).toString());
        playerRankings.replaceLowestRankedPlayer(player5);
        assertEquals("Name: Sid, Nickname: Slinging Steely Slivers, Ranking: 5", playerRankings.getPlayerByRanking(players.size()).toString());
    }

    @Test
    public void testGetPlayerByName() {
        assertEquals("Name: Thor, Nickname: Thrusty Fluster, Ranking: 3", playerRankings.getPlayerByName("Thor").toString());
    }

    @Test
    public void testMovePlayerUpOnePlace() {
        assertEquals("Name: Thor, Nickname: Thrusty Fluster, Ranking: 3", playerRankings.getPlayerByName("Thor").toString());
        playerRankings.movePlayerByOne(player3, "moveUp");
        assertEquals("Name: Thor, Nickname: Thrusty Fluster, Ranking: 2", playerRankings.getPlayerByName("Thor").toString());
        assertEquals("Frankie", playerRankings.getPlayerByRanking(3).getName());
    }

    @Test
    public void testMovePlayerDownOnePlace() {
        assertEquals("Name: Jeff, Nickname: The Javelin, Ranking: 1", playerRankings.getPlayerByName("Jeff").toString());
        playerRankings.movePlayerByOne(player1, "moveDown");
        assertEquals("Name: Jeff, Nickname: The Javelin, Ranking: 2", playerRankings.getPlayerByName("Jeff").toString());
        assertEquals("Frankie", playerRankings.getPlayerByRanking(1).getName());
    }

}
