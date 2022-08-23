package com.example.squiggyfrogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Fact3Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact3_screen);

        Button backMain = (Button)findViewById(R.id.backMainBtn);

        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backMainPressed();
            }
        }); // listener that calls next activity method
    }

    private void backMainPressed ()
    {
        Button back2main = (Button) findViewById(R.id.backMainBtn);
        back2main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                Toast.makeText(getBaseContext(), "Congrats! You now know about the Squiggster!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Fact3Screen.this, MainActivity.class));
                Log.i("info", "back2main pressed");
            } // end onCLick
        });
    } // end start button handler
}