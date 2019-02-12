package com.example.panczopc.multiapibar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 // kalendarz na dole
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.date);
        textViewDate.setText(currentDate);


    }

    public void Click(View view) {

        // intencje przechodzenie do innych activity
        switch (view.getId())
        {
            case R.id.bmi:
                Intent intent = new Intent(MainActivity.this,BmiActivity.class);
                startActivity(intent);
                break;
            case  R.id.gen:
                Intent intent1 = new Intent(MainActivity.this,GenActivity.class);
                startActivity(intent1);
                break;
            case R.id.player:
                Intent intent2 = new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(intent2);
                break;
            case R.id.drum_btn:
                Intent intent3 = new Intent(MainActivity.this,DrumActivity.class);
                startActivity(intent3);
                break;
            case R.id.kalk:
                Intent intent4 = new Intent(MainActivity.this,Compass.class);
                startActivity(intent4);
                break;
            case R.id.szkicbtn:
                Intent intent5 = new Intent(MainActivity.this,DrawActivity.class);
                startActivity(intent5);
                break;
            case R.id.cam:
                Intent intent6 = new Intent(MainActivity.this,CameraActivity.class);
                startActivity(intent6);
                break;
            case R.id.note:
                Intent intent7 = new Intent(MainActivity.this,GamesActivity.class);
                startActivity(intent7);
                break;






        }
    }
}
