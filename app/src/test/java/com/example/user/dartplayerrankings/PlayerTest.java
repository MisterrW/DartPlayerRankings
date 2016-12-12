package com.example.user.dartplayerrankings;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 * Created by User on 12/12/2016.
 */
public class PlayerTest {
    Player player1;

    @Before
    public void setup() {
        player1 = new Player("Jeff", "The Javelin", 1);
    }

    @Test
    public void checkPlayerSetup() {
        assertEquals("Jeff", player1.getName());
        assertEquals("The Javelin", player1.getNickname());
        assertEquals(1, player1.getRanking());
    }



    @Test
    public void testToStringOverride() {
        assertEquals("Name: Jeff, Nickname: The Javelin, Ranking: 1", player1.toString());
    }

}
