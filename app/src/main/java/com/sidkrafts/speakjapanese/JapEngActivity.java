package com.sidkrafts.speakjapanese;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Sid on 25-01-2018.
 */

class JapEngActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jap_eng);
        getSupportActionBar().hide();
    }
}
