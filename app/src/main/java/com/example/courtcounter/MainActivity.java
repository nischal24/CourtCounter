package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore,teamBScore;
    private TextView textViewTeamA;
    private TextView textViewTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTeamA = findViewById(R.id.teamascore);
        textViewTeamB = findViewById(R.id.teambscore);

    }
    public void displayScoreForTeamA(int score)
    {
        textViewTeamA.setText(String.valueOf(score));
    }
    public void displayScoreForTeamB(int score)
    {
        textViewTeamB.setText(String.valueOf(score));
    }

    public void add3forTeamA(View view) {
        teamAScore=teamAScore+3;
        displayScoreForTeamA(teamAScore);
    }

    public void add2forTeamA(View view) {
        teamAScore=teamAScore+2;
        displayScoreForTeamA(teamAScore);
    }

    public void add1forTeamA(View view) {
        teamAScore=teamAScore+1;
        displayScoreForTeamA(teamAScore);
    }
    public void add3forTeamB(View view)
    {
        teamBScore=teamBScore+3;
        displayScoreForTeamB(teamBScore);
    }
    public void add2forTeamB(View view)
    {
        teamBScore=teamBScore+2;
        displayScoreForTeamB(teamBScore);
    }
    public void add1forTeamB(View view)
    {
        teamBScore=teamBScore+1;
        displayScoreForTeamB(teamBScore);
    }
    public void reset(View view)
    {
        teamAScore=0;
        teamBScore=0;
        displayScoreForTeamB(teamBScore);
        displayScoreForTeamA(teamAScore);
    }


}
