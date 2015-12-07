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

public class SixthScene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_scene);
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

        LinearLayout layout = (LinearLayout) findViewById(R.id.sixthSceneText);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(BattleArena.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }*/
        int i = 0;
        tx[i] = new TextView(SixthScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("You walk into a room you don't recognize. All around the room numbers, drawings of mythical heroes (NOT champions), and ridiculous essays on someone called Aghanim decorate the wall. "
            + "No one knew this patient's name. He just showed up one day. He was a famous programmer from wherever he was from, but after the Mango Famine of '22 he had an episode and never recovered. "
            + "His bulbous eyes stare at you and you feel cold. He shouts something about left and right before charging.");
        layout.addView(tx[i]);
       /* i++;
        tx[i] = new TextView(SixthScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("The Professor");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(SixthScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Regardless of past decisions, you relish the chance to fight this monster. Disguised as a 'rehabilitation' program for patients, the doctor would gauge the intelligence levels of patients. "
                + "Based on these results, patients would be sorted into groups to be put into certain, very legal (according to them) experiments.");
        layout.addView(tx[i]);*/


        Button continueButton = (Button) findViewById(R.id.continueButton);

        ;


        continueButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                SixthScene.this.startActivity(new Intent(SixthScene.this, BattleArena.class));
            }


        });

    }

}
