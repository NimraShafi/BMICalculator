package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight,height;
    TextView result;
    String bmi_result, calculations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        result = findViewById(R.id.result);
    }

    public void calculateBMI(View view) {

        String weight1 = weight.getText().toString();
        String height1 = height.getText().toString();

        float weightValue = Float.parseFloat(weight1);
       float heightValue = Float.parseFloat(height1) / 100;

        float bmi = weightValue/ (heightValue * heightValue);

        if(bmi < 16){
            bmi_result = "severely under weight";
        } else if (bmi < 18.5) {
            bmi_result = "under weight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            bmi_result = "Normal weight";

        }else if (bmi >= 25 && bmi <= 29.9){
            bmi_result = "Overweight";
        }else {
            bmi_result = "Obese";
        }
        calculations = "Result:" + bmi + "\n" + bmi_result;
        result.setText(calculations);
    }
}