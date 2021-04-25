package com.jideani.arithmatic;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText numberOne, numberTwo;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = findViewById(R.id.txtFirstNumber);
        numberTwo = findViewById(R.id.txtSecondNumber);
        result = findViewById(R.id.lblResult);

    }

    public void multiply(View view) {
        //first get as string then convert

        String firstNumber = numberOne.getText().toString();
        String secondNumber = numberTwo.getText().toString();


        if (firstNumber.isEmpty() || secondNumber.isEmpty()) {
            Toast.makeText(MainActivity.this, "Incorrect input!", Toast.LENGTH_SHORT).show();
            return;
        }
        int resultNumber = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);

        result.setText(String.valueOf(resultNumber));

        Toast.makeText(MainActivity.this, "Result is " + resultNumber, Toast.LENGTH_SHORT).show();
    }
}