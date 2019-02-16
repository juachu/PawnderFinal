package com.example.juliana.pawnder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profiles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiles);

        Button like = (Button) findViewById(R.id.likebtn2);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent myIntent = new Intent(Profiles.this, OptionsPage.class);
                    startActivity(myIntent);
                }
            }
        });

        Button next = (Button) findViewById(R.id.nextbtn2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent myIntent = new Intent(Profiles.this, HazelPage.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
