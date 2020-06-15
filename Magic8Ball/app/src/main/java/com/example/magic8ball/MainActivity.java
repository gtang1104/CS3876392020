package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ball;
    private TextView answer;
    private ImageView img;
    private String[] ansArray = {"As I see it, yes.", "Better not tell you now.",
    "Signs point to yes", "Don’t count on it.", "My sources say no."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ball = findViewById(R.id.askball);
        answer = findViewById(R.id.answer);
        img= findViewById(R.id.answerImg);
        ball.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
                int rand = new Random().nextInt(ansArray.length);
                answer.setText(ansArray[rand]);
                switch (rand) {
                    case 0:
                        img.setImageResource(R.drawable.one);
                        break;
                    case 1:
                        img.setImageResource(R.drawable.two);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.three);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.four);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.five);
                        break;
                    default:
                        break;
                }
    }
}