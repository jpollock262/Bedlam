package com.example.john.bbbbb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BattleSummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_summary);
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

        LinearLayout layout = (LinearLayout) findViewById(R.id.battleSummary);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(BattleArena.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }*/
        int i = 0;
        tx[i] = new TextView(BattleSummary.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("You won " + Profile.currentEnemy.xpWon + " XP.");
        layout.addView(tx[i]);
        i++;
        int points = Profile.currentEnemy.health * -1 - Profile.fighting;
        Profile.fighting = 0;
        tx[i] = new TextView(BattleSummary.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("You got " + points + " points.");
        layout.addView(tx[i]);

        Profile.profileHero.experiencePoints += Profile.currentEnemy.xpWon;


        Button continueButton = (Button) findViewById(R.id.continueButtonSummary);

        ;


        continueButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {
                if(Profile.profileHero.experiencePoints >= 100 * Profile.profileHero.level){
                    startActivity(new Intent(BattleSummary.this, LevelUp.class));
                }
                else{
                    BattleSummary.this.startActivity(new Intent(BattleSummary.this, Loading.class));
                }

            }


        });

    }

}
