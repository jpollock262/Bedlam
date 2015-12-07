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

public class FourthScene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_scene);
       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        LinearLayout layout = (LinearLayout) findViewById(R.id.fourthSceneText);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(BattleArena.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }*/
        int i = 0;
        tx[i] = new TextView(FourthScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Frisk has always struck you as an odd sort of doctor. She keeps to herself and seems to always be scared when getting too close to holes or caves. "
        + "She is a decent doctor and has always tried to do right by you, but you have always got the sense that something darker stirs behind her eyes."
        + "You have a feeling that taking her on would be no easy task, but she still represents the staff that experimented on you. And don't forget those delicious execu-I mean experience points.");
        layout.addView(tx[i]);


        Button fightButton = (Button) findViewById(R.id.fightFrisk);
        Button avoidButton = (Button) findViewById(R.id.spareButton);




        fightButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                FourthScene.this.startActivity(new Intent(FourthScene.this, BattleArena.class));
            }


        });

        avoidButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                FourthScene.this.startActivity(new Intent(FourthScene.this, SpareScene.class));
            }


        });

    }

}
