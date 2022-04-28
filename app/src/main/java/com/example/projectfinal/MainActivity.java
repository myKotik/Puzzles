package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void FindCat(View view) {
        Intent a = new Intent(this, FindCat.class);
        startActivity(a);
        finish();
    }
    public void puzzles(View view) {
        Intent b = new Intent(this, Puzzles.class);
        startActivity(b);
        finish();
    }
    public void differences(View view) {
        Intent с = new Intent(this, FindDifferences.class);
        startActivity(с);
        finish();
    }
}