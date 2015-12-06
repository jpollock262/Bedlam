package com.example.john.bbbbb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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

        Button nickSyncSelect = (Button) findViewById(R.id.nickSyncSelect);

        nickSyncSelect.setOnClickListener(new View.OnClickListener() {



            @Override


            public void onClick(View view) {
                //You have befriended a local spirit who seems to have a royal aura and a big sword
                Power excalibur = new Power("EXCALIBUR!", 'L', 'D', 10000);

                //Your prickly exterior has sharpened your tongue to cause actual damage.
                Power twinTail = new Power("BAKA", 'V', 'D', 50);

                //Cats are your only friends in this desolate place. Use them against your enemy
                Power nyan = new Power("Cat Scratch Fever", 'A', 'D', 10);

                //You have made a deal with a Faustian alien cat. You temporarily use the powers of a magical girl
                Power loliTransformation = new Power("Mahou Shoujo", 'T', 'D', 40);

                Hero NickSink = new Hero("Nick Sink", 200, 20, 6, 'J', twinTail, nyan, loliTransformation, excalibur);

                Profile.MAX_HEALTH = 200;

                Profile.power1 = twinTail;

                Profile.power2 = nyan;

                Profile.power3 = loliTransformation;

                Profile.power4 = excalibur;

                Profile.profileHero = NickSink;

                Power roulette = new Power("Bet on the ball", 'G', 'S', 20);

                Power allIn = new Power("Bet Everything", 'V', 'Z', 30);

                Power kissDice = new Power("Hope the dice like you", 'B', 'Y', 40);

                Power heartOfTheCards = new Power("Look deep within for the perfect card", 'C', 'J', 10);

                Enemy Gambler = new Enemy("The Gambler", 100, 150, 30, 10, roulette, allIn, kissDice, heartOfTheCards, 'C');

                Profile.enemyPower1 = roulette;
                Profile.enemyPower2 = allIn;
                Profile.enemyPower3 = kissDice;
                Profile.enemyPower4 = heartOfTheCards;

                Profile.currentEnemy = Gambler;

                newGame.this.startActivity(new Intent(newGame.this, OpeningCutscene.class));
            }


        });
    }

}
