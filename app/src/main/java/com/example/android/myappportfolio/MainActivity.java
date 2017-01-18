package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button projectOne = (Button) findViewById(R.id.project_one);
        Button projectTwo = (Button) findViewById(R.id.project_two);
        Button projectThree = (Button) findViewById(R.id.project_three);
        Button projectFour = (Button) findViewById(R.id.project_four);
        Button projectFive = (Button) findViewById(R.id.project_five);
        Button projectSix = (Button) findViewById(R.id.project_six);

        projectOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.project_one_tap, Toast.LENGTH_SHORT).show();
            }
        });
        projectTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.project_two_tap, Toast.LENGTH_SHORT).show();
            }
        });
        projectThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.project_three_tap, Toast.LENGTH_SHORT).show();
            }
        });
        projectFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.project_four_tap, Toast.LENGTH_SHORT).show();
            }
        });
        projectFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.project_five_tap, Toast.LENGTH_SHORT).show();
            }
        });
        projectSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.project_six_tap, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
