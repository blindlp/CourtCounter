package gt.com.irc.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int POINTS_FOR_FREE_THROW = 1;
    final int POINTS_FOR_TWO_POINTS = 2;
    final int POINTS_FOR_THREE_POINTS = 3;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(0);
        displayForTeamB(0);
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

    /**
     *
     * @param view
     */

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + POINTS_FOR_THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    /**
     *
     * @param view
     */

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + POINTS_FOR_TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }

    /**
     *
     * @param view
     */

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + POINTS_FOR_FREE_THROW;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + POINTS_FOR_THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    /**
     *
     * @param view
     */

    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + POINTS_FOR_TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }

    /**
     *
     * @param view
     */

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + POINTS_FOR_FREE_THROW;
        displayForTeamB(scoreTeamB);
    }
}
