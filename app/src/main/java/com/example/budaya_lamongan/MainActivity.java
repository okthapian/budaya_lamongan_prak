package com.example.budaya_lamongan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickwisata(View view) {
        Intent wst=new Intent(MainActivity.this,wisata.class);
        startActivity(wst);
    }

    public void clickkesenian(View view) {
        Intent wst=new Intent(MainActivity.this,kesenian.class);
        startActivity(wst);
    }
    public void clickkuis(View view) {
        Intent wst=new Intent(MainActivity.this,kuis.class);
        startActivity(wst);
    }
    public void clickabout(View view) {
        Intent wst=new Intent(MainActivity.this,about.class);
        startActivity(wst);
    }
}
