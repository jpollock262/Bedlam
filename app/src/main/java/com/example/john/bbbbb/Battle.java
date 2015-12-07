package com.example.john.bbbbb;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;



public class Battle extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        TranslateAnimation moveLefttoRight=new TranslateAnimation(-200, 2000,50,50);
        moveLefttoRight.setDuration(4000);
        moveLefttoRight.setFillAfter(true);
        ImageView attackanimation = (ImageView) findViewById(R.id.bak);
        ImageView eattackanimation = (ImageView) findViewById(R.id.heart);
        //AnimatorSet aSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.eswing);
        //AnimatorSet bSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.pswing);
        switch(Profile.powerSelection)
        {
            case 0:
                attackanimation.setImageResource(Profile.power1.picID);
                break;
            case 1:
                attackanimation.setImageResource(Profile.power2.picID);
                break;

            case 2:
                attackanimation.setImageResource(Profile.power3.picID);
                break;

            case 3:
                attackanimation.setImageResource(Profile.power4.picID);
                break;
        }
        attackanimation.startAnimation(moveLefttoRight);

        TranslateAnimation moveRightoLeft=new TranslateAnimation(200, -2000,50,50);
        moveRightoLeft.setDuration(4000);
        moveRightoLeft.setFillAfter(true);

        switch(Profile.enemyPowerSelection)
        {

            case 0:
                eattackanimation.setImageResource(Profile.enemyPower1.picID);
                break;
            case 1:
                eattackanimation.setImageResource(Profile.enemyPower2.picID);
                break;

            case 2:
                eattackanimation.setImageResource(Profile.enemyPower3.picID);
                break;

            case 3:
                eattackanimation.setImageResource(Profile.enemyPower4.picID);
                break;
        }
        eattackanimation.startAnimation(moveRightoLeft);







        Button con = (Button) findViewById(R.id.con);
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Battle.this.startActivity(new Intent(Battle.this, BattleArena.class));
            }


        });


    }


}
