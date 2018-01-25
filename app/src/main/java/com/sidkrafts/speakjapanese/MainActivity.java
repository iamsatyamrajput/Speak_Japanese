package com.sidkrafts.speakjapanese;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void engJap(View view) {
        Intent getEngJapPage = new Intent(this,
                EngJapActivity.class);

        final int result = 1;

        startActivity(getEngJapPage);
    }

    public void japEng(View view) {
        Intent getJapEngPage = new Intent(this,
                JapEngActivity.class);
    }
}
