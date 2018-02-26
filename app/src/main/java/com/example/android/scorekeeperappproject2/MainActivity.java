package com.example.android.scorekeeperappproject2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int scoreTeamA, faultsTeamA, cornersTeamA, redCardsTeamA, yellowCardsTeamA;
    int scoreTeamB, faultsTeamB, cornersTeamB, redCardsTeamB, yellowCardsTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the Team A Goal button is clicked
     */
    public void goalA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redCardsTeamA, yellowCardsTeamA );
    }

    /**
     * This method is called when the Team A Fault button is clicked
     */
    public void faultA(View v) {
        faultsTeamA=faultsTeamA + 1;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redCardsTeamA, yellowCardsTeamA);
    }
    /**
     * This method is called when the Team A Corner button is clicked
     */
    public void cornerA(View v) {
        cornersTeamA = cornersTeamA + 1;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redCardsTeamA, yellowCardsTeamA);
    }

    /**
     * This method is called when the Team A red card button is clicked
     */
    public void redCardA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redCardsTeamA, yellowCardsTeamA);
    }
    /**
     * This method is called when the Team A yellow card button is clicked
     */
    public void yellowCardA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redCardsTeamA, yellowCardsTeamA);
    }


/**
 * Displays the given score for Team A.
 */
public void displayForTeamA(int score,int faults, int corners, int redCards, int yellowCards) {
        TextView scoreView =(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        TextView faultsView = (TextView) findViewById(R.id.team_a_faults);
        faultsView.setText(String.valueOf(faults));
        TextView cornersView = (TextView) findViewById(R.id.team_a_corners);
        cornersView.setText(String.valueOf(corners));
        TextView redCardsView = (TextView) findViewById(R.id.team_a_redcards);
        redCardsView.setText(String.valueOf(redCards));
        TextView yellowCardsView = (TextView) findViewById(R.id.team_a_yellowcards);
        yellowCardsView.setText(String.valueOf(yellowCards));
      }

    /**
     * This method is called when the Team B Goal button is clicked
     */
    public void goalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redCardsTeamB, yellowCardsTeamB);
    }

    /**
     * This method is called when the Team B Fault button is clicked
     */
    public void faultB (View view) {
        faultsTeamB = faultsTeamB + 1;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redCardsTeamB, yellowCardsTeamB);
    }


    /**
     * This method is called when the Team B Corner button is clicked
     */
    public void cornerB(View view) {
        cornersTeamB = cornersTeamB + 1;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redCardsTeamB, yellowCardsTeamB);
    }

    /**
     * This method is called when the Team B red card button is clicked
     */
    public void redCardB(View v) {
        redCardsTeamB = redCardsTeamB + 1;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redCardsTeamB, yellowCardsTeamB);
    }
    /**
     * This method is called when the Team B yellow card button is clicked
     */
    public void yellowCardB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redCardsTeamB, yellowCardsTeamB);
    }
    /**
     * Displays the given scores for Team B
     */
    public void displayForTeamB(int score,int faults, int corners, int redCards, int yellowCards) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        TextView faultsView = (TextView) findViewById(R.id.team_b_faults);
        faultsView.setText(String.valueOf(faults));
        TextView cornersView = (TextView) findViewById(R.id.team_b_corners);
        cornersView.setText(String.valueOf(corners));
        TextView redCardsView = (TextView) findViewById(R.id.team_b_redcards);
        redCardsView.setText(String.valueOf(redCards));
        TextView yellowCardsView = (TextView) findViewById(R.id.team_b_yellowcards);
        yellowCardsView.setText(String.valueOf(yellowCards));
    }


    /**
     * This method is called when the Reset button is clicked
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        faultsTeamA = 0;
        cornersTeamA = 0;
        redCardsTeamA = 0;
        yellowCardsTeamA = 0;
        scoreTeamB = 0;
        faultsTeamB = 0;
        cornersTeamB = 0;
        redCardsTeamB = 0;
        yellowCardsTeamB = 0;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redCardsTeamA, yellowCardsTeamA);
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redCardsTeamB, yellowCardsTeamB);
    }

}

