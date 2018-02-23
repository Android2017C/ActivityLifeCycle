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

public class ActivityB extends AppCompatActivity {
TextView start_b;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.i("ActivityLifeCycle","B OnCreate");
        start_b=(TextView)findViewById(R.id.b);
        start_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(ActivityB.this,ActivityC.class);
                startActivity(b);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityLifeCycle","B OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityLifeCycle","B OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityLifeCycle","B OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityLifeCycle","B OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityLifeCycle","B OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityLifeCycle","B OnDestroy");
    }
}
