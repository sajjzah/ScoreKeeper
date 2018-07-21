package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalTeamA = 0;
    int goalTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalTeamA(View v) {
        goalTeamA++;
        displayScoreForTeamA(goalTeamA);
    }

    public void goalTeamB(View v) {
        goalTeamB++;
        displayScoreForTeamB(goalTeamB);
    }

    public void foulTeamA(View v) {
        foulTeamA++;
        displayFoulsForTeamA(foulTeamA);
    }

    public void foulTeamB(View v) {
        foulTeamB++;
        displayFoulsForTeamB(foulTeamB);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul) + " (Fouls)");
    }

    public void displayFoulsForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul) + " (Fouls)");
    }

    public void reset(View v) {
        goalTeamA = 0;
        goalTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayScoreForTeamA(goalTeamA);
        displayScoreForTeamB(goalTeamB);
        displayFoulsForTeamA(foulTeamA);
        displayFoulsForTeamB(foulTeamB);
    }
}
