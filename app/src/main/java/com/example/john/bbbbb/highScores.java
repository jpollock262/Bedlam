package com.example.john.bbbbb;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class highScores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/



        MyDBHandler dbHandler = new MyDBHandler(this, "scoreboardDB.db", null, 1);

        Score temp = dbHandler.findScores(Profile.PROFILE_ID);

        LinearLayout layout = (LinearLayout) findViewById(R.id.highScores);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(highScores.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }
        int i = 0;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your high score is " + temp.getHighScore());
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your highest attack damage is " + temp.getStrongestAtk());
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your highest crit damage is " + temp.getStrongestCritAtk());
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your longest battle was " + temp.getLongestBattleTime() + " turns long.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your shortest battle was " + temp.getShortestBattleTime() + " turns long.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your overall score was " + Profile.overallScore);
        layout.addView(tx[i]);*/

        int i = 0;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your high score is " + Profile.highScore);
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your highest attack damage is " + Profile.largestAtk);
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your highest crit damage is " + Profile.largestCrit);
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your longest battle was " + Profile.longestBattle + " turns long.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your shortest battle was " + Profile.shortestBattle + " turns long.");
        layout.addView(tx[i]);
        i++;
        tx[i] = new TextView(highScores.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("Your overall score was " + Profile.overallScore);
        layout.addView(tx[i]);

    }

}
