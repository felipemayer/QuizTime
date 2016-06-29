package com.felipemayer.quiztime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class QuizOne extends MainActivity {

    private TextView actualQuizScoreTextView;
    private Button sendAnswerOne;
    private int quizPosition;
    private int quizScore;
    private TextView quizPositionOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        quizPosition = getIntent().getExtras().getInt(MainActivity.QUIZPOSITION);
        quizScore = getIntent().getExtras().getInt(MainActivity.QUIZSCORE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);

        String quizPositionText = String.valueOf(quizPosition);
        quizPositionOne = (TextView) findViewById(R.id.quizPositionOne);
        quizPositionOne.setText("Pergunta " + quizPositionText + " de 10");

        sendAnswerOne = (Button) findViewById(R.id.sendAnswerOne);
        sendAnswerOne.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                quizPosition = quizPosition + 1;
                Intent intent = new Intent(QuizOne.this, QuizOne.class);
                callActivity(intent, quizPosition, 1);
            }
        });
    }
}
