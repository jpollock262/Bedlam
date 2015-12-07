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

public class SeventhScene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_scene);
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

        LinearLayout layout = (LinearLayout) findViewById(R.id.seventhSceneText);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(BattleArena.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }*/
        int i = 0;
        tx[i] = new TextView(SeventhScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("In the entrance hall, you see the familiar sight of a girl with white hair fighting off some enemies. It's the nurse you are always flirting with, Weiss. "
                + "She easily finishes off her enemies with a flick of her experiment-obtained (she felt bad subjecting only the patients to it) ice powers. "
                + "Her side ponytail bounces as she bounds up and inquires, ");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(SeventhScene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Are you here to lose to me too?");
        layout.addView(tx[i]);

        if(Profile.sparedFrisk == false && Profile.avoidedNurse == false)
        {
            i++;
            tx[i] = new TextView(SeventhScene.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("You killed my boss and you killed my best friend Frisk in cold blood. Prepare to freeze to death.");
            layout.addView(tx[i]);
            Profile.currentEnemy.health += Profile.profileHero.level * 40;
        }

        else if(Profile.sparedFrisk == false && Profile.avoidedNurse == true)
        {
            i++;
            tx[i] = new TextView(SeventhScene.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("Why? WHY DID YOU KILL FRISK?! She was my best friend. She tried to help all the patients and you just killed her. "
                    + "I know we got close, but I refuse to accept this. ");
            layout.addView(tx[i]);
            Profile.currentEnemy.health += Profile.profileHero.level * 20;
        }

        else if(Profile.sparedFrisk == true && Profile.avoidedNurse == false)
        {
            i++;
            tx[i] = new TextView(SeventhScene.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("Did you really have to kill my boss? I know she had this weird thing about paperwork, but still...");
            layout.addView(tx[i]);
            //Profile.currentEnemy.health += Profile.profileHero.level * 20;
        }

        else if(Profile.sparedFrisk == true && Profile.avoidedNurse == true)
        {
            i++;
            tx[i] = new TextView(SeventhScene.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("A smile plays at the corner of her lips. She does not seem like she is readying herself for combat.");
            layout.addView(tx[i]);
        }


        Button continueButton = (Button) findViewById(R.id.continueButton);





        continueButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                if(Profile.sparedFrisk == false && Profile.avoidedNurse == false)
                {
                    startActivity(new Intent(SeventhScene.this, BattleArena.class));
                }

                else if(Profile.sparedFrisk == false && Profile.avoidedNurse == true)
                {
                    startActivity(new Intent(SeventhScene.this, BattleArena.class));
                }

                else if(Profile.sparedFrisk == true && Profile.avoidedNurse == false)
                {
                    startActivity(new Intent(SeventhScene.this, justFriends.class));
                }

                else if(Profile.sparedFrisk == true && Profile.avoidedNurse == true)
                {
                    startActivity(new Intent(SeventhScene.this, tsundereTest.class));
                }

            }


        });



    }

}
