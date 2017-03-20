package com.piotrwysocki.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int goalsTeamA = 0;
    private int goalsTeamB = 0;
    private int foulsTeamA = 0;
    private int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given goals for Team A.
     */
    private void displayGoalsTeamA(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.goals_teamA);
        goalsView.setText(String.valueOf(goals));
    }

    /**
     * Displays the given goals for Team B.
     */
    private void displayGoalsTeamB(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.goals_teamB);
        goalsView.setText(String.valueOf(goals));
    }

    /**
     * Displays the given fouls for Team A.
     */
    private void displayFoulsTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.fouls_teamA);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the given fouls for Team B.
     */
    private void displayFoulsTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.fouls_teamB);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Increases the number of goals the team A.
     */
    public void addGoalForTeamA(View view) {
        goalsTeamA += 1;
        displayGoalsTeamA(goalsTeamA);
    }

    /**
     * Increases the number of goals the team B.
     */
    public void addGoalForTeamB(View view) {
        goalsTeamB += 1;
        displayGoalsTeamB(goalsTeamB);
    }

    /**
     * Increases the number of fouls the team A.
     */
    public void addFoulForTeamA(View view) {
        foulsTeamA += 1;
        displayFoulsTeamA(foulsTeamA);
    }

    /**
     * Increases the number of fouls the team B.
     */
    public void addFoulForTeamB(View view) {
        foulsTeamB += 1;
        displayFoulsTeamB(foulsTeamB);
    }

    /**
     * Resets the results for both teams back to 0.
     */
    public void clearResults(View view) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayGoalsTeamA(goalsTeamA);
        displayGoalsTeamB(goalsTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
    }
}
