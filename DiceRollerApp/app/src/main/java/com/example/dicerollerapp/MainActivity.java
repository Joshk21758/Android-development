package com.example.dicerollerapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();

        }

    public void myButtonListenerMethod(){
        Button button = (Button) findViewById(R.id.rollButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int rollResult = rand.nextInt(6) + 1;
                TextView diceResult = (TextView) findViewById(R.id.diceResult);
                diceResult.setText(Integer.toString(rollResult));
                ImageView img = (ImageView) findViewById(R.id.diceImage);

                switch (rollResult){
                    case 1:
                        img.setImageResource(R.drawable.dice1);
                        break;

                    case 2:
                        img.setImageResource(R.drawable.dice2);
                        break;

                    case 3:
                        img.setImageResource(R.drawable.dice3);
                        break;

                    case 4:
                        img.setImageResource(R.drawable.dice4);
                        break;

                    case 5:
                        img.setImageResource(R.drawable.dice5);
                        break;

                    case 6:
                        img.setImageResource(R.drawable.dice6);
                        break;


                }
            }
        });
    }
    }
