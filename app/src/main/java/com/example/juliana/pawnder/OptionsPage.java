package com.example.juliana.pawnder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_page);

        Button adopt = (Button) findViewById(R.id.adoptopt);

        adopt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent myIntent = new Intent(OptionsPage.this, AdoptionPage.class);
                    startActivity(myIntent);
                }
            }
        });

        Button visit = (Button) findViewById(R.id.visitopt);

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent myIntent = new Intent(OptionsPage.this, AdoptionPage.class);
                    startActivity(myIntent);
                }
            }
        });

        Button foster = (Button) findViewById(R.id.fosteropt);

        foster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent myIntent = new Intent(OptionsPage.this, AdoptionPage.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
