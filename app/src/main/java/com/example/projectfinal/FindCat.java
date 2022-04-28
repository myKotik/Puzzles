package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
public class FindCat extends AppCompatActivity {
    Button btnAnswer;
    ImageView picCat;
    ButtonСoordinateCat[] cat = new ButtonСoordinateCat[]{
            new ButtonСoordinateCat(R.drawable.cat1,
                    1100, 1200),
            new ButtonСoordinateCat(R.drawable.cat2,
                    150, 1080),
            new ButtonСoordinateCat(R.drawable.cat3,
                    800, 1000),
            new ButtonСoordinateCat(R.drawable.cat4,
                    600, 750),
            new ButtonСoordinateCat(R.drawable.cat5,
                    500, 950),
            new ButtonСoordinateCat(R.drawable.cat6,
                    430, 1100),
            new ButtonСoordinateCat(R.drawable.cat7,
                    1150, 1000),
            new ButtonСoordinateCat(R.drawable.cat8,
                    750, 1080),
            new ButtonСoordinateCat(R.drawable.cat9,
                    800, 1150),
            new ButtonСoordinateCat(R.drawable.cat10,
                    550, 1080),
            new ButtonСoordinateCat(R.drawable.cat11,
                    1150, 1050),};
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_cat);
        btnAnswer = findViewById(R.id.btnAnswer);
        picCat = findViewById(R.id.picCat);
        btnAnswer.setTranslationX(cat[i].x);
        btnAnswer.setTranslationY(cat[i].y);
        picCat.setImageResource(cat[i].nextCat); }
    public void findCatBtn(View v) {
        i++;
        if (i == cat.length) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish(); }
        btnAnswer.setTranslationX(cat[i].x);
        btnAnswer.setTranslationY(cat[i].y);
        picCat.setImageResource(cat[i].nextCat);
        Toast.makeText(this, "Молодец, ты нашел кота", Toast.LENGTH_SHORT).show(); }
    public void Back(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish(); }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
        finish(); }
    public void picCat(View view) {
        Toast.makeText(this, "Попробуйте в другом месте", Toast.LENGTH_SHORT).show(); }
}