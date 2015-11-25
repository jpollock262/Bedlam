package com.example.john.bbbbb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
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

        Button newGameButton = (Button) findViewById(R.id.newGameButton);
        Button continueGameButton = (Button) findViewById(R.id.continueGameButton);
        Button highScoreButton = (Button) findViewById(R.id.highScoreButton);



        newGameButton.setOnClickListener(new View.OnClickListener() {



            @Override


            public void onClick(View view) {
                MainMenu.this.startActivity(new Intent(MainMenu.this, newGame.class));
            }


        });

        continueGameButton.setOnClickListener(new View.OnClickListener() {



            @Override


            public void onClick(View view) {

            }


        });

        highScoreButton.setOnClickListener(new View.OnClickListener() {



            @Override


            public void onClick(View view) {
                MainMenu.this.startActivity(new Intent(MainMenu.this, highScores.class));
            }


        });

    }

}
