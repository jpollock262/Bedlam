package com.example.john.bbbbb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class newGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
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
        Profile.PROFILE_ID = 1;

        MyDBHandler profile = new MyDBHandler(this, null, null, 1);
        Score newScores = new Score(Profile.PROFILE_ID,0,0,0,0);
        profile.addScores(newScores);

        Button nickSyncSelect = (Button) findViewById(R.id.nickSyncSelect);
        Button justinFieverSelect = (Button) findViewById(R.id.justinFieverSelect);
        Button emotownSelect = (Button) findViewById(R.id.emotownSelect);
        Button lordeSelect = (Button) findViewById(R.id.lordeSelect);

        nickSyncSelect.setOnClickListener(new View.OnClickListener() {



            @Override


            public void onClick(View view) {
                //You have befriended a local spirit who seems to have a royal aura and a big sword
                Power excalibur = new Power("EXCALIBUR!", 'L', 'D', 10000, R.drawable.excalibur);

                //Your prickly exterior has sharpened your tongue to cause actual damage.
                Power twinTail = new Power("BAKA", 'V', 'D', 50, R.drawable.bak);

                //Cats are your only friends in this desolate place. Use them against your enemy
                Power nyan = new Power("Cat Scratch Fever", 'A', 'D', 10, R.drawable.cat);

                //You have made a deal with a Faustian alien cat. You temporarily use the powers of a magical girl
                Power loliTransformation = new Power("Mahou Shoujo", 'T', 'D', 40, R.drawable.magic);

                Hero NickSink = new Hero("Nick Sink", 200, 20, 6, 'J', twinTail, nyan, loliTransformation, excalibur, R.drawable.nick_sync);

                Profile.MAX_HEALTH = 200;

                Profile.PROFILE_ID = 1;

                Profile.power1 = twinTail;

                Profile.power2 = nyan;

                Profile.power3 = loliTransformation;

                Profile.power4 = excalibur;

                Profile.profileHero = NickSink;

                Power roulette = new Power("Bet on the ball", 'G', 'S', 20, R.drawable.roulette);

                Power allIn = new Power("Bet Everything", 'V', 'Z', 30, R.drawable.allin);

                Power kissDice = new Power("Hope the dice like you", 'B', 'Y', 40, R.drawable.dice);

                Power heartOfTheCards = new Power("Look deep within for the perfect card", 'C', 'J', 10, R.drawable.heart);

                Enemy Gambler = new Enemy("The Gambler", 100, 150, 30, 10, roulette, allIn, kissDice, heartOfTheCards, 'C', R.drawable.gambler);

                Profile.enemyPower1 = roulette;
                Profile.enemyPower2 = allIn;
                Profile.enemyPower3 = kissDice;
                Profile.enemyPower4 = heartOfTheCards;

                Profile.currentEnemy = Gambler;

                Profile.progress = 0;
                Profile.fighting = 0;
                Profile.textCounter = 0;
                Profile.largestCrit = 0;
                Profile.largestAtk = 0;
                Profile.initCheck = false;
                Profile.powerSelection = 0;
                Profile.enemyPowerSelection = 0;

                Profile.overallScore = 0;

                newGame.this.startActivity(new Intent(newGame.this, OpeningCutscene.class));
            }


        });

        justinFieverSelect.setOnClickListener(new View.OnClickListener() {



            @Override


            public void onClick(View view) {
                //You have befriended a local spirit who seems to have a royal aura and a big sword
                Power falsetto = new Power("Falsetto Fire!", 'V', 'D', 10000, R.drawable.falsetto);

                //Your prickly exterior has sharpened your tongue to cause actual damage.
                Power tantrum = new Power("Tiny Tantrum", 'T', 'D', 50, R.drawable.tantrum);

                //Cats are your only friends in this desolate place. Use them against your enemy
                Power crashNBurn = new Power("Crash and Burn", 'A', 'D', 10, R.drawable.crash_and_burn);

                //You have made a deal with a Faustian alien cat. You temporarily use the powers of a magical girl
                Power glare = new Power("Baby Face Glare", 'T', 'D', 40, R.drawable.baby_face_glare);

                Hero JustinFiever = new Hero("Justin Fiever", 200, 20, 6, 'J', glare, crashNBurn, tantrum, falsetto, R.drawable.justin_fiever);

                Profile.MAX_HEALTH = 200;

                Profile.PROFILE_ID = 1;

                Profile.power1 = glare;

                Profile.power2 = crashNBurn;

                Profile.power3 = tantrum;

                Profile.power4 = falsetto;

                Profile.profileHero = JustinFiever;

                Power roulette = new Power("Bet on the ball", 'G', 'S', 20);

                Power allIn = new Power("Bet Everything", 'V', 'Z', 30);

                Power kissDice = new Power("Hope the dice like you", 'B', 'Y', 40);

                Power heartOfTheCards = new Power("Look deep within for the perfect card", 'C', 'J', 10);

                Enemy Gambler = new Enemy("The Gambler", 100, 150, 30, 10, roulette, allIn, kissDice, heartOfTheCards, 'C', R.drawable.gambler);

                Profile.enemyPower1 = roulette;
                Profile.enemyPower2 = allIn;
                Profile.enemyPower3 = kissDice;
                Profile.enemyPower4 = heartOfTheCards;

                Profile.currentEnemy = Gambler;

                Profile.progress = 0;
                Profile.fighting = 0;
                Profile.textCounter = 0;
                Profile.largestCrit = 0;
                Profile.largestAtk = 0;
                Profile.initCheck = false;
                Profile.powerSelection = 0;
                Profile.enemyPowerSelection = 0;

                Profile.overallScore = 0;

                newGame.this.startActivity(new Intent(newGame.this, OpeningCutscene.class));
            }


        });


        //Change power names and stuff
        emotownSelect.setOnClickListener(new View.OnClickListener() {



            @Override


            public void onClick(View view) {
                //You have befriended a local spirit who seems to have a royal aura and a big sword
                Power falsetto = new Power("Falsetto Fire!", 'V', 'D', 10000);

                //Your prickly exterior has sharpened your tongue to cause actual damage.
                Power tantrum = new Power("Tiny Tantrum", 'T', 'D', 50);

                //Cats are your only friends in this desolate place. Use them against your enemy
                Power crashNBurn = new Power("Crash and Burn", 'A', 'D', 10);

                //You have made a deal with a Faustian alien cat. You temporarily use the powers of a magical girl
                Power glare = new Power("Baby Face Glare", 'T', 'D', 40);

                Hero JustinFiever = new Hero("Justin Fiever", 200, 20, 6, 'J', glare, crashNBurn, tantrum, falsetto, R.drawable.nick_sync);

                Profile.MAX_HEALTH = 200;

                Profile.PROFILE_ID = 1;

                Profile.power1 = glare;

                Profile.power2 = crashNBurn;

                Profile.power3 = tantrum;

                Profile.power4 = falsetto;

                Profile.profileHero = JustinFiever;

                Power roulette = new Power("Bet on the ball", 'G', 'S', 20);

                Power allIn = new Power("Bet Everything", 'V', 'Z', 30);

                Power kissDice = new Power("Hope the dice like you", 'B', 'Y', 40);

                Power heartOfTheCards = new Power("Look deep within for the perfect card", 'C', 'J', 10);

                Enemy Gambler = new Enemy("The Gambler", 100, 150, 30, 10, roulette, allIn, kissDice, heartOfTheCards, 'C', R.drawable.gambler);

                Profile.enemyPower1 = roulette;
                Profile.enemyPower2 = allIn;
                Profile.enemyPower3 = kissDice;
                Profile.enemyPower4 = heartOfTheCards;

                Profile.currentEnemy = Gambler;

                Profile.progress = 0;
                Profile.fighting = 0;
                Profile.textCounter = 0;
                Profile.largestCrit = 0;
                Profile.largestAtk = 0;
                Profile.initCheck = false;
                Profile.powerSelection = 0;
                Profile.enemyPowerSelection = 0;

                Profile.overallScore = 0;

                newGame.this.startActivity(new Intent(newGame.this, OpeningCutscene.class));
            }


        });


        //Change power names and stuff
        lordeSelect.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {
                //You have taken your hit song to heart.
                Power royal = new Power("Royal", 'C', 'D', 100, R.drawable.royal);

                //Don't you think it's boring how people talk?
                Power tennisCourts = new Power("Tennis Courts", 'S', 'V', 50, R.drawable.tennis);

                //You've got the power of your country behind you.
                Power newZealand = new Power("New Zealand", 'T', 'O', 10000, R.drawable.nz);

                //You use your dope album to attack
                Power pureHeroine = new Power("Pure Heroine", 'B', 'D', 25, R.drawable.ph);

                Hero lorde = new Hero("Lorde", 200, 20, 6, 'J', royal, tennisCourts, newZealand, pureHeroine, R.drawable.lorde);

                Profile.MAX_HEALTH = 200;

                Profile.PROFILE_ID = 1;

                Profile.power1 = royal;

                Profile.power2 = tennisCourts;

                Profile.power3 = newZealand;

                Profile.power4 = pureHeroine;

                Profile.profileHero = lorde;

                Power roulette = new Power("Bet on the ball", 'G', 'S', 20);

                Power allIn = new Power("Bet Everything", 'V', 'Z', 30);

                Power kissDice = new Power("Hope the dice like you", 'B', 'Y', 40);

                Power heartOfTheCards = new Power("Look deep within for the perfect card", 'C', 'J', 10);

                Enemy Gambler = new Enemy("The Gambler", 100, 150, 30, 10, roulette, allIn, kissDice, heartOfTheCards, 'C', R.drawable.gambler);

                Profile.enemyPower1 = roulette;
                Profile.enemyPower2 = allIn;
                Profile.enemyPower3 = kissDice;
                Profile.enemyPower4 = heartOfTheCards;

                Profile.currentEnemy = Gambler;

                Profile.progress = 0;
                Profile.fighting = 0;
                Profile.textCounter = 0;
                Profile.largestCrit = 0;
                Profile.largestAtk = 0;
                Profile.initCheck = false;
                Profile.powerSelection = 0;
                Profile.enemyPowerSelection = 0;

                Profile.overallScore = 0;

                newGame.this.startActivity(new Intent(newGame.this, OpeningCutscene.class));
            }


        });
    }

}
