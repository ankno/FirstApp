package com.example.se_r_.firstapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edVal1,edVal2;
    TextView textResult;
    Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edVal1= findViewById(R.id.edValue1);
        edVal2= findViewById(R.id.edValue2);
        textResult=findViewById(R.id.txtResult);
        btnCal=findViewById(R.id.btnCalculate);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(edVal1.getText().toString());
                int b=Integer.parseInt(edVal2.getText().toString());
                int c=a+b;
                textResult.setText(edVal1.getText().toString()+" + "+edVal2.getText().toString()+" = "+c);
            }
        });
    }
}
