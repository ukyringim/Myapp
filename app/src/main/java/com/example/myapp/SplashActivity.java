package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class SplashActivity extends AppCompatActivity {

    EditText text;
    EditText n_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        text = findViewById(R.id.text);
        n_text = findViewById(R.id.n_text);
    }

    public void dosomething(View view) {
      //  text.setText("Something");
        String value_1 = text.getText().toString();
        String value_2 = n_text.getText().toString();
      //  Toast.makeText(this, value, Toast.LENGTH_SHORT).show();

        //converting string into integer

        int num_1 = Integer.parseInt(value_1);
        int num_2 = Integer.parseInt(value_2);

        //create a new variable and gives it value of num_1 + num_2
        //show toast message displaying the sum using the toast...
        int sum = num_1 + num_2;

        Toast.makeText(this,  num_1 + "+" +num_2 + " = " +sum, Toast.LENGTH_SHORT).show();

    }
}