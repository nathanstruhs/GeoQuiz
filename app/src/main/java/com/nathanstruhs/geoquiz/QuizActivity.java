package com.nathanstruhs.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuizActivity extends AppCompatActivity {

    // onCreate() called when an instance of the activity subclass is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // for the activity to receive a user interface
        // setContentView() 'inflates' a layout and puts it on screen
            // each widget int he layout is instantiated as defined by its attributes
        setContentView(R.layout.activity_quiz);
    }
}
