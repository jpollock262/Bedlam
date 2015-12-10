package com.example.john.bbbbb;

/**
 * Created by Tyler on 11/24/2015.
 */
public class Enemy {

    public String name;
    public int xpWon;
    public int health;
    public int mana;
    public double speed;
    Power[] whatFucksYou = new Power[4];
    public char defenseType;
    int imgSource;

    // public artificialIntelligence brain;

    public Enemy (String name, int xpWon, int health, int mana, double speed, Power first, Power second, Power third, Power fourth, char defenseType, int imgSource){
        this.name = name;
        this.xpWon = xpWon;
        this.health = health;
        this.mana = mana;
        this.speed = speed;
        whatFucksYou[0] = new Power(first);
        whatFucksYou[1] = new Power(second);
        whatFucksYou[2] = new Power(third);
        whatFucksYou[3] = new Power(fourth);
        this.defenseType = defenseType;
        this.imgSource = imgSource;
    }

}