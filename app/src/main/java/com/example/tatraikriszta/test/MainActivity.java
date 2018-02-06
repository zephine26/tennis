package com.example.tatraikriszta.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tatraikriszta.test.R;

public class MainActivity extends AppCompatActivity {

    String serenaWilliams = "0";
    String venusWilliams = "0";
    String reset = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(serenaWilliams);
        displayForTeamB(venusWilliams);
    }
    /**
     * Displays the given score for Serena Williams.
     */
    public void displayForTeamA(String message) {
        TextView scoreView = (TextView) findViewById(R.id.serena_williams_score);
            scoreView.setText(message);
    }
    public void a0(View view)  {
        String message  = "love";
        displayForTeamA(message);
    }

    public void a15(View view)   {
        String message = "15";
        displayForTeamA(message);
    }

    public void a30(View view)   {
        String message ="30";
        displayForTeamA(message);
    }

    public void a40(View view) {
        String message = "40";
        displayForTeamA(message);
    }

    public void a60(View view)   {
        String message = "game";
        displayForTeamA(message);
    }



    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.serena_williams_score);
        quantityTextView.setText("" + number);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(String message) {
        TextView scoreView = (TextView) findViewById(R.id.venus_williams_score);
            scoreView.setText(String.valueOf(message));
    }

    public void b0(View view)  {
        String message  = "love";
        displayForTeamB(message);
    }

    public void b15(View view)   {
        String message  = "15";
        displayForTeamB(message);
    }

    public void b30(View view)   {
        String message  = "30";
        displayForTeamB(message);
    }

    public void b40(View view)   {
        String message  = "40";
        displayForTeamB(message);
    }

    public void b60(View view)   {
        String message  = "game";
        displayForTeamB(message);
    }

    public void reset(View view)   {
        serenaWilliams = "0";
        venusWilliams = "0";
        displayForTeamA(serenaWilliams);
        displayForTeamB(venusWilliams);
    }
}

