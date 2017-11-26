    package com.example.asus.aplikasibasket;

import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;
        import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int scoreHome=0;
    int scoreAway=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){
            scoreHome = savedInstanceState.getInt("someVarA");
            scoreAway=savedInstanceState.getInt("someVarB");
            TextView displayScoreHome=(TextView) findViewById(R.id.point_Home);
            displayScoreHome.setText(""+scoreHome);
            TextView displayScoreAway=(TextView) findViewById(R.id.point_Away);
            displayScoreAway.setText(""+scoreAway);}
    }

    public void twoPointsHome(View view){
        scoreHome+=2;
        TextView displayScore=(TextView) findViewById(R.id.point_Home);
        displayScore.setText(""+scoreHome);

    }

    public void threePointsHome(View view){
        scoreHome+=3;
        TextView displayScore=(TextView) findViewById(R.id.point_Home);
        displayScore.setText(""+scoreHome);


    }

    public void freeThrowPointHome(View view){
        scoreHome+=1;
        TextView displayScore=(TextView) findViewById(R.id.point_Home);
        displayScore.setText(""+scoreHome);
    }


    public void twoPointsAway(View view){
        scoreAway+=2;
        TextView displayScore=(TextView) findViewById(R.id.point_Away);
        displayScore.setText(""+scoreAway);

    }

    public void threePointsAway(View view){
        scoreAway+=3;
        TextView displayScore=(TextView) findViewById(R.id.point_Away);
        displayScore.setText(""+scoreAway);


    }

    public void freeThrowPointAway(View view){
        scoreAway+=1;
        TextView displayScore=(TextView) findViewById(R.id.point_Away);
        displayScore.setText(""+scoreAway);
    }

    public void resetScore(View view){
        scoreAway=0;
        scoreHome=0;
        TextView displayScoreHome=(TextView) findViewById(R.id.point_Away);
        displayScoreHome.setText(""+scoreAway);
        TextView displayScoreAway=(TextView) findViewById(R.id.point_Home);
        displayScoreAway.setText(""+scoreHome);
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("someVarA", scoreHome);
        outState.putInt("someVarB", scoreAway);
    }

}

