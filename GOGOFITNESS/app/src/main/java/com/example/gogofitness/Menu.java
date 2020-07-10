package com.example.gogofitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    int bool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void gotoBelly(View v){
        bool=0;
        Intent myIntent = new Intent();
        myIntent.setClass(this, Planer.class);
        myIntent.putExtra("intVariableName", bool);
        startActivity(myIntent);
    }
    public void gotoPacks(View v){
        bool=1;
        Intent myIntent = new Intent();
        myIntent.setClass(this, Planer.class);
        myIntent.putExtra("intVariableName", bool);
        startActivity(myIntent);
    }
}
