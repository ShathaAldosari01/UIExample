package com.example.uiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //part 1
    public void onbtnXClick(View view){
        TextView hi = findViewById(R.id.helloTxt);
        hi.setText("I Love you!");
    }
}