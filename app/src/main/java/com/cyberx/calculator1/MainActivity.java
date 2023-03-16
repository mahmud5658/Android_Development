package com.cyberx.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView result;
    public Button plus_btn,minus_btn,multiply_btn,divide_btn,modulus_btn;
    public EditText numberEdittext1,numberEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        numberEdittext1 = findViewById(R.id.number1_editText);
        numberEditText2 = findViewById(R.id.number2_edittext);
        plus_btn = findViewById(R.id.addition_btn);
        minus_btn = findViewById(R.id.substraction_btn);
        multiply_btn = findViewById(R.id.multiplication_btn);
        divide_btn = findViewById(R.id.divide_btn);
        modulus_btn = findViewById(R.id.modulus_btn);
        plus_btn.setOnClickListener(this);
        minus_btn.setOnClickListener(this);
        multiply_btn.setOnClickListener(this);
        divide_btn.setOnClickListener(this);
        modulus_btn.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        String number1 = numberEdittext1.getText().toString();
        String number2 = numberEditText2.getText().toString();

        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        try {
            if (v.getId()==R.id.addition_btn){
                double sum = num1+num2;
                result.setText("Result: "+sum);
            } else if (v.getId()==R.id.substraction_btn) {
                double sub = num1-num2;
                result.setText("Result: "+sub);
            }
            else if(v.getId()==R.id.multiplication_btn){
                double multi = num1*num2;
                result.setText("Result: "+multi);
            }
            else if(v.getId()==R.id.divide_btn){
               double div = num1/num2;
                result.setText("Result: "+div);
            }
            else if(v.getId()==R.id.modulus_btn){
                double mod = num1%num2;
                result.setText("Result: "+mod);
            }
        }catch (Exception e){
            Toast.makeText(MainActivity.this, "Please enter number ", Toast.LENGTH_SHORT).show();
        }
        
    }
}