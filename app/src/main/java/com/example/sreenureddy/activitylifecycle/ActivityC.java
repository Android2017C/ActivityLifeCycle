package com.example.sreenureddy.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by SreenuReddy on 2/21/2018.
 */

public class ActivityC extends AppCompatActivity {

    TextView start_c, start_cc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Log.i("ActivityLifeCycle", "C OnCreate");
        start_cc = (TextView) findViewById(R.id.cc);
        start_c = (TextView) findViewById(R.id.c);
        start_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(ActivityC.this, ActivityA.class);
                startActivity(c);
            }
        });

        start_cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cc = new Intent(ActivityC.this, ActivityB.class);
                startActivity(cc);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityLifeCycle", "C OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityLifeCycle", "C OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityLifeCycle", "C OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityLifeCycle", "C OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityLifeCycle", " COnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityLifeCycle", "C OnDestroy");
    }
}
