package com.example.praktikum_intentrefa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void handleExplicitIntent(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}