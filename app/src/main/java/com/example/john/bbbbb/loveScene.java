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

public class loveScene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_scene);
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

        LinearLayout layout = (LinearLayout) findViewById(R.id.loveSceneText);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(BattleArena.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }*/
        int i = 0;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("You sidle up to her and tell her, .");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("You are an ok partner. It'd be a shame waste that potential.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("She faux drops her head in annoyance. She opens her mouth to respond. Then she thinks better of it."
                + "She turns on her heel and walks away haughtily.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Wait!");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("you shout. She turns around with a half-smile on her face. She raises her eyebrows and responds in as cocky as voice as you've ever heard, ");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("What? If I'm just ok then I am sure you don't need my help.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Maybe you are more than ok, ");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("I respond.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("I guess since I have some free time I can help you. But it's not like I want to. I just find myself with a few free moments as this hospital falls apart around us.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("She tosses some dust magic on you and says as she leaves, ");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(loveScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("See you on the other side. Have fun storming the exit.");
        layout.addView(tx[i]);

        Profile.profileHero.skillset[0].damage *= 2;
        Profile.profileHero.skillset[1].damage *= 2;
        Profile.profileHero.skillset[2].damage *= 2;
        Profile.profileHero.skillset[3].damage *= 2;

        Button continueButton = (Button) findViewById(R.id.continueButton);

        ;


        continueButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                loveScene.this.startActivity(new Intent(loveScene.this, Loading.class));
            }


        });


    }

}
