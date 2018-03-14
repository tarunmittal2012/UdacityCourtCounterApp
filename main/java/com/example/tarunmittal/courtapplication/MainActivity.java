package com.example.tarunmittal.courtapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button h1,h2,h3,h4,a1,a2,a3,a4,b7;

    int scorecard=0;
    int scorecard2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b7= (Button) findViewById(R.id.reset);
        h3= (Button) findViewById(R.id.extrapointA);
        h2= (Button) findViewById(R.id.fieldgoalA);
        h1= (Button) findViewById(R.id.touchdownA);
        h4= (Button) findViewById(R.id.tackleA);
        a4= (Button) findViewById(R.id.tackleB);
        a1= (Button) findViewById(R.id.touchdownB);
        a2= (Button) findViewById(R.id.fieldgoalB);
        a3= (Button) findViewById(R.id.extrapointB);


        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorecard+=6;
                displayA(scorecard);
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorecard+=3;
                displayA(scorecard);
            }
        });

        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorecard+=1;
                displayA(scorecard);
            }
        });

        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorecard2+=2;
                displayB(scorecard2);
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorecard+=2;
                displayA(scorecard);
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorecard2+=6;
                displayB(scorecard2);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorecard2+=3;
                displayB(scorecard2);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorecard2+=1;
                displayB(scorecard2);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scorecard=0;
                scorecard2=0;
                displayA(scorecard);
                displayB(scorecard2);
            }
        });
    }

    private void displayA(int scores)
    {
     TextView scoreA= (TextView) findViewById(R.id.text1);
scoreA.setText(String.valueOf(scores));
    }

    private void displayB(int scored)
    {
     TextView   scoreB= (TextView) findViewById(R.id.text2);
scoreB.setText(String.valueOf(scored));
    }

}
