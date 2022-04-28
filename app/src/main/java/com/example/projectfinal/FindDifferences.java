package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
public class FindDifferences extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    ArrayList<Button> buttonArrayList = new ArrayList<>();
    ArrayList<Integer> click = new ArrayList<>();
    ButtonСoordinate[] coord = new ButtonСoordinate[]{
            new ButtonСoordinate("1090",//0
                    "400"),
            new ButtonСoordinate("550",//1
                    "500"),
            new ButtonСoordinate("970",//2
                    "580"),
            new ButtonСoordinate("1000",//3
                    "860"),
            new ButtonСoordinate("600",//4
                    "870"),
            new ButtonСoordinate("2090",//5
                    "400"),
            new ButtonСoordinate("1550",//6
                    "500"),
            new ButtonСoordinate("1950",//7
                    "570"),
            new ButtonСoordinate("2000",//8
                    "860"),
            new ButtonСoordinate("1600",//9
                    "870"),};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_differences);
        btn1 = findViewById(R.id.btn1);
        btn6 = findViewById(R.id.btn6);
        btn2 = findViewById(R.id.btn2);
        btn7 = findViewById(R.id.btn7);
        btn3 = findViewById(R.id.btn3);
        btn8 = findViewById(R.id.btn8);
        btn4 = findViewById(R.id.btn4);
        btn9 = findViewById(R.id.btn9);
        btn5 = findViewById(R.id.btn5);
        btn10 = findViewById(R.id.btn10);
        buttonArrayList.add(btn1);
        buttonArrayList.add(btn2);
        buttonArrayList.add(btn3);
        buttonArrayList.add(btn4);
        buttonArrayList.add(btn5);
        buttonArrayList.add(btn6);
        buttonArrayList.add(btn7);
        buttonArrayList.add(btn8);
        buttonArrayList.add(btn9);
        buttonArrayList.add(btn10);
        btn1.setTranslationX(Float.parseFloat(coord[0].x));
        btn1.setTranslationY(Float.parseFloat(coord[0].y));
        btn6.setTranslationX(Float.parseFloat(coord[5].x));
        btn6.setTranslationY(Float.parseFloat(coord[5].y));
        btn2.setTranslationX(Float.parseFloat(coord[1].x));
        btn2.setTranslationY(Float.parseFloat(coord[1].y));
        btn7.setTranslationX(Float.parseFloat(coord[6].x));
        btn7.setTranslationY(Float.parseFloat(coord[6].y));
        btn3.setTranslationX(Float.parseFloat(coord[2].x));
        btn3.setTranslationY(Float.parseFloat(coord[2].y));
        btn8.setTranslationX(Float.parseFloat(coord[7].x));
        btn8.setTranslationY(Float.parseFloat(coord[7].y));
        btn4.setTranslationX(Float.parseFloat(coord[3].x));
        btn4.setTranslationY(Float.parseFloat(coord[3].y));
        btn9.setTranslationX(Float.parseFloat(coord[8].x));
        btn9.setTranslationY(Float.parseFloat(coord[8].y));
        btn5.setTranslationX(Float.parseFloat(coord[4].x));
        btn5.setTranslationY(Float.parseFloat(coord[4].y));
        btn10.setTranslationX(Float.parseFloat(coord[9].x));
        btn10.setTranslationY(Float.parseFloat(coord[9].y)); }
    public void onClick(View view) {
        int id = view.getId();
        int index = 0;
        for (int i = 0; i < buttonArrayList.size(); i++) {
            if (id == buttonArrayList.get(i).getId()) {
                index = i;
                break; } }
        buttonArrayList.get(index).setBackgroundColor(Color.GREEN);
        if (index < 5) {
            buttonArrayList.get(index + 5).setBackgroundColor(Color.GREEN);
            buttonArrayList.get(index + 5).setClickable(false); } else{
            buttonArrayList.get(index - 5).setBackgroundColor(Color.GREEN);
            buttonArrayList.get(index - 5).setClickable(false); }
        click.add(1);
        if (click.size() == 5) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish(); } }
    public void Back(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish(); }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish(); }
}