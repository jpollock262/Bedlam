package com.example.john.bbbbb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
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

        if(Profile.progress == 1){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Power hentaiUnlock = new Power("HENTAI!", 'U', 'S', 30);
            Power feelsTrip = new Power("BibleThump", 'B', 'Z', 40);
            Power sinOfMankind = new Power("MONUMENT TO ALL YOUR SINS", 'T', 'Y', 70);
            Power bazettsWish = new Power("I don't want to die", 'V', 'J', 2);
            adjustPowerLevel(hentaiUnlock, feelsTrip, sinOfMankind, bazettsWish);
            Enemy eighthServant = new Enemy("The Eighth Servant", 100,150, 20, 18, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'N');
            adjustEnemyLevel(eighthServant);
            startActivity(new Intent(Loading.this, FirstScene.class));
            //startActivity(new Intent(Loading.this, BattleArena.class));
        }

        else if(Profile.progress == 2){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Power ivSlash = new Power("IV Slash", 'M', 'S', 10);
            Power stableStaple = new Power("Crab Staple Attack", 'O', 'J', 30);
            Power paperwork = new Power("Bureaucracy FTW", 'W', 'Z',10);
            Power lobotomize = new Power("Emergency Vegetable", 'B', 'Y',70);
            adjustPowerLevel(ivSlash, stableStaple, paperwork, lobotomize);
            Enemy headNurse = new Enemy("Head Nurse", 100,150, 20, 18, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'N');
            adjustEnemyLevel(headNurse);
            startActivity(new Intent(Loading.this, SecondScene.class));
            //startActivity(new Intent(Loading.this, BattleArena.class));
        }

        else if(Profile.progress == 3){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Power patientAssistedSuicide = new Power("Suicide Letter", 'B', 'Y',100);
            Power pickPocket = new Power("Slippery Fingers", 'C', 'S',150);
            Power sharedHallucination = new Power("Shared Hallucination", 'B', 'Z', 20);
            Power reflect = new Power("Existentially despair on your place in the universe", 'B', 'J',70);
            adjustPowerLevel(patientAssistedSuicide, pickPocket, sharedHallucination, reflect);
            Enemy rival = new Enemy("Rival Patient", 200,150, 20, 5, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'P');
            adjustEnemyLevel(rival);
            startActivity(new Intent(Loading.this, ThirdScene.class));
            //startActivity(new Intent(Loading.this, BattleArena.class));
        }
    }

    public void adjustEnemyLevel(Enemy enemyToChange) {
        enemyToChange.health += Profile.profileHero.level*30;
        enemyToChange.xpWon += Profile.profileHero.level*50;
        Profile.currentEnemy = enemyToChange;
    }

    public void adjustPowerLevel(Power power1, Power power2, Power power3, Power power4) {
        power1.damage += Profile.profileHero.level*10;
        power2.damage += Profile.profileHero.level*10;
        power3.damage += Profile.profileHero.level*10;
        power4.damage += Profile.profileHero.level*10;

        Profile.enemyPower1 = power1;
        Profile.enemyPower2 = power2;
        Profile.enemyPower3 = power3;
        Profile.enemyPower4 = power4;

    }

}
