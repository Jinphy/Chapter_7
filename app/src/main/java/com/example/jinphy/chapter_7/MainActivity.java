package com.example.jinphy.chapter_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int cpuCount = Runtime.getRuntime().availableProcessors();
        Log.d("Main", cpuCount + "");
        View view;
    }

}
