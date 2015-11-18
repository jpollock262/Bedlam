package com.example.john.bbbbb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(R.string.settingsTitle);


    }

    public void eraseFile(View v)
    {

        SharedPreferences file = this.getSharedPreferences("saveFile", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = file.edit();
        editor.putInt("level", 0);
        editor.putInt("xp", 0);
        editor.putInt("fightID", 0);
        editor.putInt("playerChoice", 0);
        editor.commit();

    }

}
