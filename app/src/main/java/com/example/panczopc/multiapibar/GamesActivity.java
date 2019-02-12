package com.example.panczopc.multiapibar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
    }

    public void Click(View view) {

        switch (view.getId()) {
            case R.id.tictac:
                Intent intent = new Intent(GamesActivity.this, game.class);
                startActivity(intent);
                break;
            case R.id.spin:
                Intent intent1 = new Intent(GamesActivity.this,spinActivity.class);
                startActivity(intent1);
                break;

            case  R.id.dice:
                Intent intent2 = new Intent(GamesActivity.this,DiceActivity.class);
                startActivity(intent2);
        }
    }

}