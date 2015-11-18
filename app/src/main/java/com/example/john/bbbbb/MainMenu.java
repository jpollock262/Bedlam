package com.example.john.bbbbb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(R.string.title);

    }

    public void openSettings(View v)
    {
        Intent openSettings = new Intent(mainMenu.this, settings.class);
        startActivity(openSettings);
    }

    public void openHighScores(View v)
    {
        Intent openHighScores = new Intent(mainMenu.this, highScores.class);
        startActivity(openHighScores);
    }

    public void continueGame(View v)
    {
        Intent continueGame = new Intent(mainMenu.this, continueGame.class);
        startActivity(continueGame);
    }

    public void newGame (View v)
    {
        Intent newGame = new Intent(mainMenu.this, newGame.class);
        startActivity(newGame);
    }

}
