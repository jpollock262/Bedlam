package com.example.john.bbbbb;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ScrollView;
import android.widget.LinearLayout;

public class BattleArena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_arena);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        Profile.textCounter = 0;

        ScrollView scroll = (ScrollView) findViewById(R.id.battleLog);
        LinearLayout layout = (LinearLayout) findViewById(R.id.LinearLayout1);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(BattleArena.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }*/


        if(Profile.fighting > 0){
            mainArena();
        }

        if(Profile.currentEnemy.health > 0 && Profile.profileHero.health > 0) {
            tx[Profile.textCounter] = new TextView(BattleArena.this);
            tx[Profile.textCounter].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[Profile.textCounter].setText("You are battling the " + Profile.currentEnemy.name);
            layout.addView(tx[Profile.textCounter]);


            Profile.initCheck = initiationCheck(Profile.profileHero.speed, Profile.currentEnemy.speed, Profile.profileHero.name, Profile.currentEnemy.name, tx, Profile.textCounter, layout);

            Profile.textCounter += 2;

        }
        Button fightButton = (Button) findViewById(R.id.fightButton);


        fightButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {
                BattleArena.this.startActivity(new Intent(BattleArena.this, SelectPower.class));


            }

        });
    }


    public void mainArena(){
            LinearLayout layout = (LinearLayout) findViewById(R.id.LinearLayout1);
            TextView[] tx = new TextView[100];

            int enemyChoice = choice(Profile.currentEnemy);

            int playerChoice = Profile.powerSelection;

            int bHPmod;
            int pHPmod;
            bHPmod = attackCalculator(Profile.profileHero.name, Profile.profileHero.skillset[playerChoice], Profile.currentEnemy.defenseType, tx, Profile.textCounter, layout);
            pHPmod = attackCalculator(Profile.currentEnemy.name, Profile.currentEnemy.whatFucksYou[enemyChoice], Profile.profileHero.defenseType, tx, Profile.textCounter, layout);



            if(Profile.initCheck){


                Profile.currentEnemy.health -= bHPmod;
                combatText(Profile.profileHero.name, Profile.currentEnemy.name, Profile.profileHero.skillset[playerChoice].name, bHPmod, Profile.currentEnemy.health, tx, Profile.textCounter, layout);
                if(Profile.currentEnemy.health > 0) {

                    Profile.profileHero.health -= pHPmod;
                    combatText(Profile.currentEnemy.name, Profile.profileHero.name, Profile.currentEnemy.whatFucksYou[enemyChoice].name, pHPmod, Profile.profileHero.health, tx, Profile.textCounter, layout);
                }
            }

            else{
                Profile.profileHero.health -= pHPmod;
                combatText(Profile.currentEnemy.name, Profile.profileHero.name, Profile.currentEnemy.whatFucksYou[enemyChoice].name, pHPmod, Profile.profileHero.health, tx, Profile.textCounter, layout );
                if(Profile.currentEnemy.health > 0) {
                    Profile.currentEnemy.health -= bHPmod;
                    combatText(Profile.profileHero.name, Profile.currentEnemy.name, Profile.profileHero.skillset[playerChoice].name, bHPmod, Profile.currentEnemy.health, tx, Profile.textCounter, layout );
                }
            }

            if (Profile.profileHero.health <= 0) {
                //game over function
                tx[Profile.textCounter] = new TextView(BattleArena.this);
                tx[Profile.textCounter].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                tx[Profile.textCounter].setText("YOU LOST");
                layout.addView(tx[Profile.textCounter]);
                startActivity(new Intent(BattleArena.this, newGame.class));
            }

            if (Profile.currentEnemy.health <= 0) {
                Profile.profileHero.experiencePoints += Profile.currentEnemy.xpWon;
                tx[Profile.textCounter] = new TextView(BattleArena.this);
                tx[Profile.textCounter].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                tx[Profile.textCounter].setText("You got lucky and won " + Profile.currentEnemy.xpWon + " experience points");
                layout.addView(tx[Profile.textCounter]);
                Profile.progress++;
                startActivity(new Intent(BattleArena.this, BattleSummary.class));
            }

        }


    public int choice(Enemy badGuy) {
        int enemyChoice;
        double attackChoice = Math.random();
        if(attackChoice < .24){
            enemyChoice = 0;
        }
        else if (attackChoice < .49){
            enemyChoice = 1;
        }
        else if (attackChoice < .74){
            enemyChoice = 2;
        }
        else{ enemyChoice = 3;}
        return enemyChoice;
    }

    public int attackCalculator(String name, Power attack, char defend, TextView[] log, int line, LinearLayout tv){
        double healthModification = attack.damage;
        double rng = Math.random();

        //test if attack is resisted
        if(attack.type == defend){
            healthModification *= .5;
            log[line] = new TextView(BattleArena.this);
            log[line].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            log[line].setText(name + "'s attack is not very effective.");
            tv.addView(log[line]);
            Profile.textCounter++;
        }

        //test if attack does bonus
        if(attack.bonusType == defend){
            healthModification *= 1.5;
            log[line] = new TextView(BattleArena.this);
            log[line].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            log[line].setText(name + getString(R.string.notEffective));
            tv.addView(log[line]);
            Profile.textCounter++;
        }

        //crit like a boss
        if(rng > .89){
            healthModification *= 2;
            log[line] = new TextView(BattleArena.this);
            log[line].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            log[line].setText("CRITICAL STRIKE for " + name);
            tv.addView(log[line]);
            Profile.textCounter++;
        }

        return (int) healthModification;
    }

    public void combatText(String attacker, String defender, String attack, int hpChange, int newHealth, TextView[] log, int line, LinearLayout tv) {
        log[line] = new TextView(BattleArena.this);
        log[line].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        log[line].setText(attacker + " attacked with " + attack + ". " + defender + " took " + hpChange + " damage. " + defender + " now has " + newHealth + " remaining." );
        tv.addView(log[line]);

    }

    public boolean initiationCheck(double playerSpeed, double enemySpeed, String playerName, String enemyName, TextView[] log, int line, LinearLayout tv){
        double playerInitiationRoll = Math.random();
        double enemyInitiationRoll = Math.random();
        double playerInitiation = playerSpeed + playerInitiationRoll * 10;
        log[line] = new TextView(BattleArena.this);
        log[line].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        log[line].setText(playerName + " rolled " + playerInitiation);
        tv.addView(log[line]);
        line++;
        double enemyInitiation = enemySpeed + enemyInitiationRoll * 10;
        log[line] = new TextView(BattleArena.this);
        log[line].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        log[line].setText(enemyName + " rolled " + enemyInitiation);
        tv.addView(log[line]);

        if(playerInitiationRoll > enemyInitiationRoll) {
            return true;
        }
        else{
            return false;
        }
    }

}
