package com.example.panczopc.multiapibar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiActivity extends AppCompatActivity {
private EditText et1,et2;
private TextView tv_result;
private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

    et1 = (EditText) findViewById(R.id.et_weight);
    et2 = (EditText) findViewById(R.id.et_height);
    tv_result = (TextView) findViewById(R.id.tv_result);
    btn = (Button) findViewById(R.id.button);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            bmi();
        }
    });



    }

    private void bmi(){


        float a,b,c;
        a = Float.parseFloat(et2.getText().toString())/100;
        b = Float.parseFloat(et1.getText().toString());
        c = b/(a*a);
        tv_result.setText("Twój współczynnik bmi to :   " + c );

        if(c<18.5){
            Toast.makeText(getApplicationContext(),"Masz Niedowagę",Toast.LENGTH_SHORT).show();
        }
        if ((c >18.5) && (c<= 24.9) ){

            Toast.makeText(getApplicationContext(),"Waga Prawidłowa",Toast.LENGTH_SHORT).show();
        }
        if((c>=25) &&(c<= 29.9)){

            Toast.makeText(getApplicationContext(),"Czas przed otyłością",Toast.LENGTH_SHORT).show();

        }
        if (c>=30){

            Toast.makeText(getApplicationContext(),"Otyłość",Toast.LENGTH_SHORT).show();
        }

    }


    }




