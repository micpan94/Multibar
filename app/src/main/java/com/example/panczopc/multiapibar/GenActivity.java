package com.example.panczopc.multiapibar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class GenActivity extends AppCompatActivity {

    EditText et_min,et_max;
    Button gen_btn;
    TextView result;

    Random r;
    int min, max;
    int wynik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen);

        r = new Random();


        et_min = (EditText) findViewById(R.id.et_min);
        et_max = (EditText) findViewById(R.id.et_max);
        gen_btn = (Button) findViewById(R.id.gen_btn);
        result = (TextView) findViewById(R.id.result);

        gen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String tempMin,tempMax;
                tempMin = et_min.getText().toString();
                tempMax = et_max.getText().toString();

                if(!tempMin.equals("") && !tempMax.equals("")){

                    min = Integer.parseInt(tempMin);
                    max = Integer.parseInt(tempMax);
                }

                min = Integer.parseInt(et_min.getText().toString());
                max = Integer.parseInt(et_max.getText().toString());

                if(max>min){

                wynik = r.nextInt((max - min) +1) + min;
                result.setText("Twoja losowa liczba to : " + wynik);

                }

            }
        });

    }
}
