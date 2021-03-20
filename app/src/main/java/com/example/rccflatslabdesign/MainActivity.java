package com.example.rccflatslabdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void function1(View view) {
        startActivity(new Intent(MainActivity.this,FlatSlabRectangularCol.class));
    }
    public void function2(View view) {
    }
    public void function3(View view) {
    }
    public void function4(View view) {
    }
}