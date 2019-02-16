package com.example.juliana.pawnder;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Button create = (Button) findViewById(R.id.smtButton);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent myIntent = new Intent(CreateAccount.this, Profiles.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
