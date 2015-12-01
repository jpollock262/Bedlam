package com.example.john.bbbbb;

/**
 * Created by Tyler on 11/24/2015.
 */
public class Hero {
    public final String name;
    public int experiencePoints;
    public int level;
    public int health;
    public int mana;
    public double speed;
    public char defenseType;
    Power[] skillset = new Power[4];

    public Hero(String name, int hp, int mp, double speed, char defend, Power howYouAreCool, Power howYouKickAss, Power howYouWillWin, Power howYouBecomeVictorious){
        this.name = name;
        this.experiencePoints = 0;
        this.level = 0;
        this.health = hp;
        this.mana = mp;
        this.speed = speed;
        this.defenseType = defend;
        skillset[0] = new Power(howYouAreCool);
        skillset[1] = new Power(howYouKickAss);
        skillset[2] = new Power(howYouWillWin);
        skillset[3] = new Power(howYouBecomeVictorious);
    }

    public Hero(Hero copy){
        this.name = copy.name;
        this.experiencePoints = copy.experiencePoints;
        this.level = copy.level;
        this.health = copy.health;
        this.mana = copy.mana;
        this.speed = copy.speed;
        this.defenseType = copy.defenseType;
        this.skillset[0] = copy.skillset[0];
        this.skillset[1] = copy.skillset[1];
        this.skillset[2] = copy.skillset[2];
        this.skillset[3] = copy.skillset[3];
    }
}
