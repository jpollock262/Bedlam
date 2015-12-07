package com.example.john.bbbbb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class tsundereTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsundere_test);
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

        Button fightButton = (Button) findViewById(R.id.dereButton);
        Button avoidButton = (Button) findViewById(R.id.tsundereButton);

        Profile.progress++;




        fightButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                tsundereTest.this.startActivity(new Intent(tsundereTest.this, goodFriends.class));
            }


        });

        avoidButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                tsundereTest.this.startActivity(new Intent(tsundereTest.this, loveScene.class));
            }


        });

    }

}
