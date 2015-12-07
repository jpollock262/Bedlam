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

public class SpareScene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spare_scene);
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

        Profile.sparedFrisk = true;

        LinearLayout layout = (LinearLayout) findViewById(R.id.spareSceneText);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(BattleArena.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }*/
        int i = 0;
        tx[i] = new TextView(SpareScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("For an instant you see the potential, everyone living together happily. No one committing violence. Frisk looks up with innocence in her eyes"
                + "Her small hand reaches toward you and you grasp ready to live your life together.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(SpareScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("But this hospital sucks the happiness from everyone who enters. This happy scene with Frisk is too much for the soul-sucking behemoth to stomach.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(SpareScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("The hospital takes this happiness from you too. Out of nowhere a dart flies into Frisk. No doubt one of the many serums developed and tested on the patients at this asylum, "
                + "the darkness you remember seeing behind Frisk's eyes take over and she attacks.");
        layout.addView(tx[i]);
        //Profile.progress++;


        Button continueButton = (Button) findViewById(R.id.continueButton);




        continueButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                SpareScene.this.startActivity(new Intent(SpareScene.this, BattleArena.class));
            }


        });

    }

}
