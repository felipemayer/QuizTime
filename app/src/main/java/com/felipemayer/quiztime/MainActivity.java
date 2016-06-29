package com.felipemayer.quiztime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String QUIZPOSITION = "quiz_position";
    public final static String QUIZSCORE = "quiz_score";

    private EditText userNameInput;
    private Button beginQuiz;

    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameInput = (EditText) findViewById(R.id.userName);
        beginQuiz = (Button) findViewById(R.id.beginQuiz);

        beginQuiz.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = userNameInput.getText().toString();
                Intent intent = new Intent(MainActivity.this, QuizOne.class);
                callActivity(intent, 1, 1);
            }
        });
    }

    public void callActivity(Intent intent, int quizPosition, int quizScore) {
        intent.putExtra(QUIZPOSITION, quizPosition);
        intent.putExtra(QUIZSCORE, quizScore);
        startActivity(intent);
        finish();
    }

}
