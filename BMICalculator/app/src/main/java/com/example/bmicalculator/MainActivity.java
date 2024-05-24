package com.example.bmicalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.v4.app.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();

        };
    public void myButtonListenerMethod(){
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText heightText = (EditText) findViewById(R.id.heightInput);
                String heightStr = heightText.getText().toString();
                double height = Double.parseDouble(heightStr);
                final EditText weightText = (EditText) findViewById(R.id.weightInput);
                String weightStr = weightText.getText().toString();
                double weight = Double.parseDouble(weightStr);
                double BMI = (weight)/(height*height);
                final EditText BMIResult = (EditText) findViewById(R.id.BMIResult);
                BMIResult.setText(Double.toString(BMI));
                String BMI_cat;
                if (BMI < 15){
                    BMI_cat = "Very severely underweight!";

                }
                else if(BMI < 16){
                    BMI_cat = "Severely underweight!";

                }
                else if(BMI < 18.5){
                    BMI_cat = "Underweight";

                }
                else if(BMI > 25){
                    BMI_cat = "Normal";

                }
                else if(BMI > 30){
                    BMI_cat = "Overweight";

                }
                else if(BMI > 35){
                    BMI_cat = "Obese class 1 - Moderately obese";

                }
                else if(BMI > 40){
                    BMI_cat = "Obese class 2 - Severely obese";

                }
                else{
                    BMI_cat = "Obese class 3 - Extremely obese";

                }
                final TextView BMICategory = (TextView) findViewById(R.id.BMICategory);
                BMICategory.setText(BMI_cat);

            }
        });
    }

    }

