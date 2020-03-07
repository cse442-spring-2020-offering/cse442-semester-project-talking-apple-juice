package com.example.theplug;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO)
        {
            setTheme(R.style.lightTheme);
        }else{
            setTheme(R.style.darkTheme);
        }
        setContentView(R.layout.activity_settings);

        Switch themeSwitch = findViewById(R.id.themeFlip);
        themeSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO)
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }

                finish();
                startActivity(new Intent(SettingsActivity.this, SettingsActivity.this.getClass()));
            }

        });
    }

}