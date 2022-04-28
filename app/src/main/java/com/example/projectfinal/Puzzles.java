package com.example.projectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class Puzzles extends AppCompatActivity {
    Button btn;
    TextView puzzles;
    EditText answerText;
    Question[] puz = new Question[]{
            new Question("1) Что ты не можешь скушать на завтрак и обед?",
                    "ужин"),
            new Question("2) Без пальцев показываю, без рук бью, без ног хожу, что я?",
                    "часы"),
            new Question("3) У семерых братьев по сестре. Сколько всего сестер?",
                    "одна"),
            new Question("4) Легче пера, но долго не удержать, что я?",
                    "дыхание"),
            new Question("5) Режьте меня, я лишь расту, что я?",
                    "дыра"),
            new Question("6) Я – вода, и по воде плаваю. Кто я такая?",
                    "льдина"),};
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzles);
        btn = findViewById(R.id.answer_btn);
        puzzles = findViewById(R.id.puzzles);
        answerText = findViewById(R.id.answerText);
        puzzles.setText(puz[i].question); }
    public void onClick(View v) {
        String a2 = answerText.getText().toString().toLowerCase();
        if (a2.equals(puz[i].answer)) {
            i++;
            if (i == puz.length) {
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                finish(); }
            puzzles.setText(puz[i].question);
            answerText.setText(null);
        } else {
            Toast.makeText(getApplicationContext(),
                    "не правильно",
                    Toast.LENGTH_SHORT).show(); }
    }
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