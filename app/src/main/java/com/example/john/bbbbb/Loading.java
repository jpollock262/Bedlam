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
            Profile.fighting = 0;
            Profile.largestAtk = 0;
            Profile.largestCrit = 0;
            Power hentaiUnlock = new Power("HENTAI!", 'U', 'S', 30, R.drawable.oppai);
            Power feelsTrip = new Power("BibleThump", 'B', 'Z', 40, R.drawable.bthump);
            Power sinOfMankind = new Power("MONUMENT TO ALL YOUR SINS", 'T', 'Y', 70, R.drawable.sins);
            Power bazettsWish = new Power("I don't want to die", 'V', 'J', 2, R.drawable.wish);
            adjustPowerLevel(hentaiUnlock, feelsTrip, sinOfMankind, bazettsWish);
            Enemy eighthServant = new Enemy("The Eighth Servant", 100,150, 20, 18, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'N', R.drawable.the_eighth_servant);
            adjustEnemyLevel(eighthServant);
            startActivity(new Intent(Loading.this, FirstScene.class));
            //startActivity(new Intent(Loading.this, BattleArena.class));
        }

        else if(Profile.progress == 2){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Profile.fighting = 0;
            Profile.largestAtk = 0;
            Profile.largestCrit = 0;
            Power ivSlash = new Power("IV Slash", 'M', 'S', 10, R.drawable.ivbag);
            Power stableStaple = new Power("Crab Staple Attack", 'O', 'J', 30, R.drawable.stapler);
            Power paperwork = new Power("Bureaucracy FTW", 'W', 'Z',10, R.drawable.papers);
            Power lobotomize = new Power("Emergency Vegetable", 'B', 'Y',70, R.drawable.scalpel);
            adjustPowerLevel(ivSlash, stableStaple, paperwork, lobotomize);
            Enemy headNurse = new Enemy("Head Nurse", 100,150, 20, 18, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'N', R.drawable.head_nurse);
            adjustEnemyLevel(headNurse);
            startActivity(new Intent(Loading.this, SecondScene.class));
            //startActivity(new Intent(Loading.this, BattleArena.class));
        }

        else if(Profile.progress == 3){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Profile.fighting = 0;
            Profile.largestAtk = 0;
            Profile.largestCrit = 0;
            Power patientAssistedSuicide = new Power("Suicide Letter", 'B', 'Y',100, R.drawable.letter);
            Power pickPocket = new Power("Slippery Fingers", 'C', 'S',150, R.drawable.pickpocket);
            Power sharedHallucination = new Power("Shared Hallucination", 'B', 'Z', 20, R.drawable.shrooms);
            Power reflect = new Power("Existentially despair on your place in the universe", 'B', 'J',70, R.drawable.reflect);
            adjustPowerLevel(patientAssistedSuicide, pickPocket, sharedHallucination, reflect);
            Enemy rival = new Enemy("Rival Patient", 200,150, 20, 5, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'P', R.drawable.rival_patient);
            adjustEnemyLevel(rival);
            startActivity(new Intent(Loading.this, ThirdScene.class));
            //startActivity(new Intent(Loading.this, BattleArena.class));
        }

        else if(Profile.progress == 4){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Profile.fighting = 0;
            Profile.largestAtk = 0;
            Profile.largestCrit = 0;
            Power toyKnife = new Power("It's a fake knife, but still scary", 'S', 'J', 20, R.drawable.toyknife);
            Power bandage = new Power("Slapped by the used gooey bandage", 'M', 'Y', 40, R.drawable.bandage);
            Power check = new Power("Your weaknesses are exposed", 'B', Profile.profileHero.defenseType, 60, R.drawable.magnifyingglass);
            Power genocide = new Power("FILLED WITH DETERMINATION", 'T', 'S', 80, R.drawable.basicredheart);
            adjustPowerLevel(toyKnife, bandage, check, genocide);
            Enemy fallenHuman = new Enemy("Frisk", 100, 100, 10, 2, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'D', R.drawable.frisk);
            adjustEnemyLevel(fallenHuman);
            startActivity(new Intent(Loading.this, FourthScene.class));
        }

        else if(Profile.progress == 5){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Profile.fighting = 0;
            Profile.largestAtk = 0;
            Profile.largestCrit = 0;
            Power noComputers = new Power("Long, monotonous lecture", 'V', 'Z', 20, R.drawable.lecture);
            Power forcedAllNighter = new Power("All-Nighter", 'B', 'Y', 40, R.drawable.all_nighter);
            Power popQuiz = new Power("Surprise quiz you didn't study for", 'B', 'S', 20, R.drawable.pop_quiz);
            Power semesterProject = new Power("Large grade-determining group project", 'B', 'J', 100, R.drawable.school_project);
            adjustPowerLevel(noComputers, forcedAllNighter, popQuiz, semesterProject);
            Enemy professor = new Enemy("Professor turned doctor", 100, 100, 10, 2, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'D', R.drawable.professor);
            adjustEnemyLevel(professor);
            startActivity(new Intent(Loading.this, FifthScene.class));
        }

        else if(Profile.progress == 6){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Profile.fighting = 0;
            Profile.largestAtk = 0;
            Profile.largestCrit = 0;
            Power seclude = new Power("Forced Isolation", 'T', 'S', 20, R.drawable.seclude);
            Power nerf = new Power("Adjust the numbers in your favor", 'G', 'Y', 40, R.drawable.nerf);
            Power mango = new Power("The Power of Mango", 'M', 'Z', 20, R.drawable.mango);
            Power balance = new Power("Everything is balanced Kappa", 'G', 'J', 100, R.drawable.balance);
            adjustPowerLevel(seclude, nerf, mango, balance);
            Enemy icefrog = new Enemy("Icefrog", 322, 100, 20, 20, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'P', R.drawable.icefrog);
            adjustEnemyLevel(icefrog);
            startActivity(new Intent(Loading.this, SixthScene.class));
        }

        else if(Profile.progress == 7){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Profile.fighting = 0;
            Profile.largestAtk = 0;
            Profile.largestCrit = 0;
            Power rapier = new Power("Rapier Thrust", 'W', 'Z', 20, R.drawable.rapier);
            Power dust = new Power("Dust Magic", 'L', 'J', 40, R.drawable.dust);
            Power summon = new Power("Summon Ice Monster", 'T', 'S', 20, R.drawable.summon);
            Power blizzard = new Power("Blizzard", 'S', 'Y', 100, R.drawable.blizzard);
            adjustPowerLevel(rapier, dust, summon, blizzard);
            Enemy weiss = new Enemy("Ice Queen", 0, 100, 20, 20, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'N', R.drawable.weiss);
            adjustEnemyLevel(weiss);
            startActivity(new Intent(Loading.this, SeventhScene.class));
        }

        else if(Profile.progress == 8){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Profile.fighting = 0;
            Profile.largestAtk = 0;
            Profile.largestCrit = 0;
            Power debt = new Power("Massive Debt", 'C', 'Z', 50, R.drawable.debt);
            Power albumTour = new Power("Forced Failed Album Tour", 'B', 'J', 50, R.drawable.album_tour);
            Power newThing = new Power("Replaced with the hot, new band", 'T', 'S', 20, R.drawable.new_thing);
            Power irrelevance = new Power("Devastating Irrelevancy", 'B', 'Y', 100, R.drawable.irrelevant);
            adjustPowerLevel(debt, albumTour, newThing, irrelevance);
            Enemy ceo = new Enemy("CEO of Old Record Label", 0, 200, 20, 20, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'P', R.drawable.ceo);
            adjustEnemyLevel(ceo);
            startActivity(new Intent(Loading.this, EighthScene.class));
        }

        else if(Profile.progress == 9){
            Profile.profileHero.health = Profile.MAX_HEALTH;
            Profile.fighting = 0;
            Profile.largestAtk = 0;
            Profile.largestCrit = 0;
            Power debt = new Power("Massive Debt", 'C', 'Z', 50, R.drawable.debt);
            Power albumTour = new Power("Forced Failed Album Tour", 'B', 'J', 50, R.drawable.album_tour);
            Power newThing = new Power("Replaced with the hot, new band", 'T', 'S', 20, R.drawable.new_thing);
            Power irrelevance = new Power("Devastating Irrelevancy", 'B', 'Y', 100, R.drawable.irrelevant);
            adjustPowerLevel(debt, albumTour, newThing, irrelevance);
            Enemy ceo = new Enemy("CEO of Old Record Label", 0, 200, 20, 20, Profile.enemyPower1, Profile.enemyPower2, Profile.enemyPower3, Profile.enemyPower4, 'P', R.drawable.ceo);
            adjustEnemyLevel(ceo);
            startActivity(new Intent(Loading.this, NinthScene.class));
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
