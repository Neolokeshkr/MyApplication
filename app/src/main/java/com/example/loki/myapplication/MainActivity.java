package com.example.loki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        if (v.getId() ==R.id.bLogin)
        {
            Intent i = new Intent(MainActivity.this, Display.class);
            startActivity(i);
        }

        if (v.getId() ==R.id.signUp)
        {
            Intent i = new Intent(MainActivity.this, SignUp.class);
            startActivity(i);
        }

    }








}
