package com.nathanstruhs.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    // button member variables
    private Button mTrueButton;
    private Button mFalseButton;

    // onCreate() called when an instance of the activity subclass is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // for the activity to receive a user interface
        // setContentView() 'inflates' a layout and puts it on screen
            // each widget int he layout is instantiated as defined by its attributes
        setContentView(R.layout.activity_quiz);

        // retrieving the resource id to connect with our QuizActivity member variables
            // (Button) type casts the view to a Button object
        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
