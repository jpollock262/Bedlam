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
import android.widget.ScrollView;
import android.widget.TextView;

public class OpeningCutscene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_cutscene);
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

       // ScrollView scroll = (ScrollView) findViewById(R.id.battleLog);
        LinearLayout layout = (LinearLayout) findViewById(R.id.openingText);
        TextView[] tx = new TextView[100];
        /*for (int i = 0; i < 10; i++) {
            tx[i] = new TextView(BattleArena.this);
            tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            tx[i].setText("This is the textviewNo" + i);
            layout.addView(tx[i]);
        }*/
        int i = 0;
        tx[i] = new TextView(OpeningCutscene.this);
        tx[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        tx[i].setText("The lights shine down on you. The crowd roars your band's name. This is what being alive was supposed to feel like." +
                "You start up the song every pre-teen girl and (much to their chagrin) every pre-teen girl's parents can sing the words to by heart." +
                "You reach the chorus that you wrote with a grand total of 5 words and feel the crowd yell." +
                "That's when the delusion changes. Your mouth gets covered by a sticker that reads 'WASHED UP' and try desperately to fight back with your 'real' music that you always wanted to make" +
                "But the industry ruthlessly buries you in debt as you try one shark jump after another to save you and your band's career. Nothing works. In a haze you press the button for a nurse." +
                "You need to sleep. Without dreams. Without the delusions and reminders. People make fun of you in the street. Pretty soon you are the person with a gym membership who never goes." +
                "That's how far you've fallen. You are normal. You press the button for the nurse over and over. No one comes. All you hear is the same ruthless chips by the uncaring guard as he plays poker with himself outside your room." +
                "And that's when an idea occurs. You get the idea for a new, catchy tune that people will find impossible to get out of their heads. This is your chance. You can prove you were the real artist in the group" +
                "All you have to do...is get out of this asylum.");
        layout.addView(tx[i]);


        Button continueButton = (Button) findViewById(R.id.continueButton);

        ;


        continueButton.setOnClickListener(new View.OnClickListener() {


            @Override


            public void onClick(View view) {

                OpeningCutscene.this.startActivity(new Intent(OpeningCutscene.this, BattleArena.class));
            }


        });

    }

}
