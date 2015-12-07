package com.example.john.bbbbb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class LevelUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_up);
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

        Profile.profileHero.level++;

        Profile.MAX_HEALTH += Profile.profileHero.level*20;

        Button power1Button = (Button) findViewById(R.id.power1);
        Button power2Button = (Button) findViewById(R.id.power2);
        Button power3Button = (Button) findViewById(R.id.power3);
        Button power4Button = (Button) findViewById(R.id.power4);

        power1Button.setText(Profile.power1.name);
        power2Button.setText(Profile.power2.name);
        power3Button.setText(Profile.power3.name);
        power4Button.setText(Profile.power4.name);


        power1Button.setOnClickListener(new View.OnClickListener() {



            @Override


            public void onClick(View view) {
                Profile.power1.damage += Profile.profileHero.level*10;
                Profile.profileHero.experiencePoints -= Profile.profileHero.level*100;
                LevelUp.this.startActivity(new Intent(LevelUp.this, Loading.class));
            }


        });

        power2Button.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {
                Profile.power2.damage += Profile.profileHero.level*10;
                Profile.profileHero.experiencePoints -= Profile.profileHero.level*100;
                LevelUp.this.startActivity(new Intent(LevelUp.this, Loading.class));
            }


        });

        power3Button.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {
                Profile.power3.damage += Profile.profileHero.level*10;
                Profile.profileHero.experiencePoints -= Profile.profileHero.level*100;
                LevelUp.this.startActivity(new Intent(LevelUp.this, Loading.class));
            }


        });

        power4Button.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {
                Profile.power4.damage += Profile.profileHero.level*10;
                Profile.profileHero.experiencePoints -= Profile.profileHero.level*100;
                LevelUp.this.startActivity(new Intent(LevelUp.this, Loading.class));
            }


        });


    }

}
