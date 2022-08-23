package com.example.squiggyfrogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fact2Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact2_screen);

        Button next2 = (Button)findViewById(R.id.nextFactBtn2);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next2BtnPressed();
            }
        }); // listener that calls next activity method
    }

    private void next2BtnPressed ()
    {
        Button next2 = (Button) findViewById(R.id.nextFactBtn2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                startActivity(new Intent(Fact2Screen.this, Fact3Screen.class));

            } // end onCLick
        });
    } // end next button handler

}