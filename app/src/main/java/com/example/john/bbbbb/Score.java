package com.example.john.bbbbb;

public class Score {

    private int _profileID;
    private int _highScore;
    private int _shortestBattleTime;
    private int _longestBattleTime;
    private int _strongestAtk;
    private int _strongestCritAtk;

    public Score() {

    }

    public Score(int profileID, int highScore, int shortestBattleTime, int longestBattleTime, int strongestAtk, int strongestCritAtk) {
        this._profileID = profileID;
        this._highScore = highScore;
        this._shortestBattleTime = shortestBattleTime;
        this._longestBattleTime = longestBattleTime;
        this._strongestAtk = strongestAtk;
        this._strongestCritAtk = strongestCritAtk;
    }

    public Score(int highScore, int shortestBattleTime, int longestBattleTime, int strongestAtk, int strongestCritAtk) {
        this._highScore = highScore;
        this._shortestBattleTime = shortestBattleTime;
        this._longestBattleTime = longestBattleTime;
        this._strongestAtk = strongestAtk;
        this._strongestCritAtk = strongestCritAtk;
    }

    public void setID(int profileID) {
        this._profileID = profileID;
    }

    public int getID() {
        return this._profileID;
    }

    public void setHighScore(int highScore) {
        this._highScore = highScore;
    }

    public int getHighScore() {
        return this._highScore;
    }

    public void setShortestBattleTime(int shortestBattleTime) {
        this._shortestBattleTime = shortestBattleTime;
    }

    public int getShortestBattleTime() {
        return this._shortestBattleTime;
    }

    public void setLongestBattleTime(int longestBattleTime) {
        this._longestBattleTime = longestBattleTime;
    }

    public int getLongestBattleTime() {
        return this._longestBattleTime;
    }

    public void setStrongestAtk(int strongestAtk) {
        this._strongestAtk = strongestAtk;
    }

    public int getStrongestAtk() {
        return this._strongestAtk;
    }

    public void setStrongestCritAtk(int strongestCritAtk) {
        this._strongestCritAtk = strongestCritAtk;
    }

    public int getStrongestCritAtk() {
        return this._strongestCritAtk;
    }
}