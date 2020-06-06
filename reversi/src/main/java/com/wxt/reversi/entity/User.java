package com.wxt.reversi.entity;

public class User {
    private int id;
    private String name;
    private int matchCount;
    private int winCount;
    private int score;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getHighestScore() {
        return score;
    }

    public void setHighestScore(int highestScore) {
        this.score = highestScore;
    }
}
