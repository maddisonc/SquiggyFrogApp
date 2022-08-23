package com.example.squiggyfrogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button)findViewById(R.id.startBtn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startBtnPressed();
            }
        }); // listener that calls next activity method

    }

    private void startBtnPressed ()
    {
        Button startButton = (Button) findViewById(R.id.startBtn);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                startActivity(new Intent(MainActivity.this, Fact1Screen.class));

            } // end onCLick
        });
    } // end start button handler


}