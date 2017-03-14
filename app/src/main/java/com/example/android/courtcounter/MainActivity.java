package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int totalScore = 0;
    private static int totalScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(totalScore);
        displayForTeamB(totalScoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void points3(View view){
        totalScore += 3;
        displayForTeamA(totalScore);
    }
    public void points2(View view){
        totalScore += 2;
        displayForTeamA(totalScore);
    }
    public void free(View view){
        totalScore += 1;
        displayForTeamA(totalScore);
    }
    public void points3b(View view){
        totalScoreB += 3;
        displayForTeamB(totalScoreB);
    }
    public void points2b(View view){
        totalScoreB += 2;
        displayForTeamB(totalScoreB);
    }
    public void freeb(View view){
        totalScoreB += 1;
        displayForTeamB(totalScoreB);
    }

    public void resetButton(View view){
        totalScore=0;
        totalScoreB=0;
        displayForTeamA(totalScore);
        displayForTeamB(totalScoreB);
    }

}
