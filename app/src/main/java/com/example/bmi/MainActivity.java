package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View v){
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String weightS = weightView.getText().toString();
        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String  heightS = heightView.getText().toString();


        double weightD = BMIModel.parseDouble(weightS);
        double heightD = BMIModel.parseDouble(heightS);

        double bmiD=BMIModel.getBMI(weightD,heightD);
        String bmiS=BMIModel.formatBMI(bmiD);
        ((TextView)findViewById(R.id.answer)).setText(bmiS);





    }





}
