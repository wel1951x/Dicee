package com.tahoesoftware.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity
        extends AppCompatActivity
    {

    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] diceArray =
                {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
                };

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDie = (ImageView) findViewById(R.id.image_leftDice),
                        rightDie = (ImageView) findViewById(R.id.image_rightDice);

        rollButton.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View view)
                {
//                Log.d("Dicee", "Ze Button has been pressed");

                Random randomNumberGenerator = new Random();
                int randomNumber = randomNumberGenerator.nextInt(6);
/*
                Log.d("Dicee", "Random number is " + randomNumber);
                Toast.makeText(getApplicationContext(), "Random number is " + randomNumber,
                        Toast.LENGTH_SHORT).show();
*/
                leftDie.setImageResource(diceArray[randomNumber]);
                randomNumber = randomNumberGenerator.nextInt(6);
                rightDie.setImageResource(diceArray[randomNumber]);
                }
            });
        }
    }
