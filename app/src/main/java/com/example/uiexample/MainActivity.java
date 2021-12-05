package com.example.uiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnHoverListener, CompoundButton.OnCheckedChangeListener {

    private CheckBox tasks[]= new CheckBox[3];
    private TextView deletes[] = new TextView[3];

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.deleteT1:
            case R.id.deleteT2:
            case R.id.deleteT3:
                Toast.makeText(this, "Tast Deleted!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.task1:
            case R.id.task2:
            case R.id.task3:
                if(b)
                    Toast.makeText(this, "Will Done!", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onHover(View view, MotionEvent motionEvent) {
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasks[0] = findViewById(R.id.task1);
        tasks[1] = findViewById(R.id.task2);
        tasks[2] = findViewById(R.id.task3);

        deletes[0] = findViewById(R.id.deleteT1);
        deletes[1] = findViewById(R.id.deleteT2);
        deletes[2] = findViewById(R.id.deleteT3);

        tasks[0].setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        tasks[1].setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        tasks[2].setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);

        deletes[0].setOnClickListener(this);
        deletes[1].setOnClickListener(this);
        deletes[2].setOnClickListener(this);


//       //other way yo do it
//        tasks[0].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(b)
//                    Toast.makeText(MainActivity.this, "Will Done!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        tasks[1].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(b)
//                    Toast.makeText(MainActivity.this, "Will Done!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        tasks[2].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(b)
//                    Toast.makeText(MainActivity.this, "Will Done!", Toast.LENGTH_SHORT).show();
//            }
//        });


//        /*I can know if it is cheak or not by the following */
//        tasks[0].isChecked();



    }
}