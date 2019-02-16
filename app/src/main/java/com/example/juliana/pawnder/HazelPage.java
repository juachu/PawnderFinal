package com.example.juliana.pawnder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HazelPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazel_page);

        Button like = (Button) findViewById(R.id.likebtn);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent myIntent = new Intent(HazelPage.this, OptionsPage.class);
                    startActivity(myIntent);
                }
            }
        });

        Button next = (Button) findViewById(R.id.nextbtn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                        Intent myIntent = new Intent(HazelPage.this, Profiles.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
