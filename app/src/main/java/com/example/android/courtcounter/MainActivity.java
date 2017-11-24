package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int score = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score);
    }

    public void addThree(View view)
    {
        displayForTeamA(3);
    }

    public void addTwo(View view)
    {
        displayForTeamA(2);
    }

    public void addOne(View view)
    {
        displayForTeamA(1);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
