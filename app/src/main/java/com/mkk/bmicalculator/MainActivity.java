package com.mkk.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight, edtHeightFt, edtHeightIn;
        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
        TextView txtResult = findViewById(R.id.txtResult);
        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightFT);
        edtHeightIn = findViewById(R.id.edtHeightIN);
        LinearLayout llMain = findViewById(R.id.ll_main);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtHeightFt.getText().toString());
                int in = Integer.parseInt(edtHeightIn.getText().toString());

                double totalMeters = (((ft * 12) + in) * 2.53) / 100;
                double bmi = wt / (totalMeters * totalMeters);

                if (bmi > 25){
                    txtResult.setText("You're Overweight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.yellow));
                }
                else if (bmi < 18.5){
                    txtResult.setText("You're Underweight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.red));
                }
                else{
                    txtResult.setText("You're Healthy");
                    llMain.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }
        });
    }
}