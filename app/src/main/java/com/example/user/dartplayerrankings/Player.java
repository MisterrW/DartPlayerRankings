package com.example.user.dartplayerrankings;

/**
 * Created by User on 12/12/2016.
 */
public class Player {
    private String name;
    private String nickname;
    private int ranking;

    public Player(String name, String nickname, int ranking) {
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Nickname: %s, Ranking: %d", name, nickname, ranking);
    }
}
