package com.example.john.bbbbb;

/**
 * Created by Tyler on 11/24/2015.
 */
public class Power {

    /* L = light, D = doctor, M = medicine, P = patient, B = brain, O = office, N = nurse, V = verbal
     * T = transform, C = currency, W = work, G = game, S = shhh , U = lust*/

    String name;
    char type;
    char bonusType;
    double damage;
    int picID;

    public Power(String name, char type, char bonusType, double damage, int picID){
        this.name = name;
        this.type = type;
        this.bonusType = bonusType;
        this.damage = damage;
        this.picID = picID;
    }

    public Power(String name, char type, char bonusType, double damage){
        this.name = name;
        this.type = type;
        this.bonusType = bonusType;
        this.damage = damage;
    }

    public Power(Power pass){
        this.name = pass.name;
        this.type = pass.type;
        this.bonusType = pass.bonusType;
        this.damage = pass.damage;
        this.picID = pass.picID;
    }

}
