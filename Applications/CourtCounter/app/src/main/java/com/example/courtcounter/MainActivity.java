package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeButtonA(View view) {
        displayForTeamA( scoreTeamA = scoreTeamA + 3);

    }
    public void addTwoButtonA(View view) {
        displayForTeamA( scoreTeamA = scoreTeamA + 2);

    }
    public void addOneButtonA(View view) {
        displayForTeamA( scoreTeamA = scoreTeamA + 1);

    }
    public void addThreeButtonB(View view) {
        displayForTeamB( scoreTeamB = scoreTeamB + 3);

    }
    public void addTwoButtonB(View view) {
        displayForTeamB( scoreTeamB = scoreTeamB + 2);

    }
    public void addOneButtonB(View view) {
        displayForTeamB( scoreTeamB = scoreTeamB + 1);

    }

    public void resetButton(View view){
        displayForTeamA(0);
        displayForTeamB(0);
        scoreTeamB = 0;
        scoreTeamA = 0;
    }
}
