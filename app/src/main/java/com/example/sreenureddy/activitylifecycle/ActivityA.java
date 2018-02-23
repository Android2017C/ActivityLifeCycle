package com.example.sreenureddy.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ActivityA extends AppCompatActivity {

    TextView start_a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Log.i("ActivityLifeCycle", "A OnCreate");
        start_a=(TextView)findViewById(R.id.a);
        start_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(ActivityA.this,ActivityB.class);
                startActivity(a);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityLifeCycle", "A OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityLifeCycle", "A OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityLifeCycle", "A OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityLifeCycle", "A OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityLifeCycle", "AOnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityLifeCycle", "A OnDestroy");
    }
}
