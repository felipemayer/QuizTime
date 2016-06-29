package com.felipemayer.quiztime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class QuizTwo extends MainActivity {

    private TextView actualQuizScoreTextView;
    private Button sendAnswerOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int quizPosition = getIntent().getExtras().getInt(MainActivity.QUIZPOSITION);
        int quizScore = getIntent().getExtras().getInt(MainActivity.QUIZSCORE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);

        actualQuizScoreTextView = (TextView) findViewById(R.id.quizScoreTwo);
        actualQuizScoreTextView.setText(quizPosition);

        sendAnswerOne = (Button) findViewById(R.id.sendAnswerOne);
        sendAnswerOne.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizTwo.this, QuizTwo.class);
                callActivity( intent, 5, 1);
            }
        });


    }
}
