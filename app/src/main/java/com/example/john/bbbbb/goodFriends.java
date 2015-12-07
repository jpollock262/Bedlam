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

public class goodFriends extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_friends);
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

        LinearLayout layout = (LinearLayout) findViewById(R.id.goodFriendsSceneText);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(BattleArena.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }*/
        int i = 0;
        tx[i] = new TextView(goodFriends.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("You hug her and look up expectantly.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(goodFriends.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("For just a second a look of disappointment crosses her face. But then she smiles and says, ");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(goodFriends.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("You are my best friend. If you can make it through the next fight. Let's brave the real world together as the best of friends.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(goodFriends.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("You tilt your head and look up at her. She shakes her head and one of the corners of her mouths turns down. One tear goes down her cheek.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(goodFriends.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("You stifle your feelings and prepare yourself for the final battle.");
        layout.addView(tx[i]);

        Profile.profileHero.skillset[0].damage *= 1.5;
        Profile.profileHero.skillset[1].damage *= 1.5;
        Profile.profileHero.skillset[2].damage *= 1.5;
        Profile.profileHero.skillset[3].damage *= 1.5;

        Button continueButton = (Button) findViewById(R.id.continueButton);

        ;


        continueButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                goodFriends.this.startActivity(new Intent(goodFriends.this, Loading.class));
            }


        });

    }

}
