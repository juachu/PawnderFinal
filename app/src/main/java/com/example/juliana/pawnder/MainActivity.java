package com.example.juliana.pawnder;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    String currentLanguage = "en", currentLang;
    Locale myLocale = new Locale(currentLanguage);
    final List<String> languages = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Locale.setDefault(myLocale);
        currentLanguage = getIntent().getStringExtra(currentLang);

        Spinner dropdown = findViewById(R.id.dropdown);
        // List<String> languages = new ArrayList<String>();

        languages.add("Select language");
        languages.add("English");
        languages.add("Espanol");
        languages.add("Francais");
        languages.add("Deutsche");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;

                    case 1:
                       setLocale("en");
                        break;

                    case 2:
                        setLocale("es");
                        break;

                    case 3:
                        setLocale("fr");
                        break;

                    case 4:
                        setLocale("de");
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button login = (Button) findViewById(R.id.loginbtn);
        Button createacc = (Button) findViewById(R.id.createaccbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent myIntent = new Intent(MainActivity.this, Login.class);
                    startActivity(myIntent);
                }
            }
        });

        createacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent myIntent = new Intent(MainActivity.this, CreateAccount.class);
                    startActivity(myIntent);
                }
            }
        });

    }

     public void setLocale(String localename){

        if(!localename.equals(currentLanguage)){

            myLocale = new Locale(localename);
            Resources res = getResources();
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration conf = res.getConfiguration();
            conf.setLocale(myLocale);
            res.updateConfiguration(conf, dm);
            Intent refresh = new Intent(this, MainActivity.class);
            refresh.putExtra(currentLang, localename);
            startActivity(refresh);

        }
        else{

            Toast.makeText(MainActivity.this, "Language is already being used", Toast.LENGTH_LONG);
        }
     }

    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
        System.exit(0);
    }
}


