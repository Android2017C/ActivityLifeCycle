package com.example.sreenureddy.activitylifecycle.serviceactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.sreenureddy.activitylifecycle.R;
import com.example.sreenureddy.activitylifecycle.modelclass.Contacts;

/**
 * Created by SreenuReddy on 2/23/2018.
 */

public class SingleContactDetails extends AppCompatActivity {

    TextView id, name, gender;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_contact_details);
        id = (TextView) findViewById(R.id.a);
        name = (TextView) findViewById(R.id.b);
        gender = (TextView) findViewById(R.id.c);
        Intent intent = getIntent();
        Contacts getbundledata = (Contacts) intent.getSerializableExtra("bundleContacts");
        id.setText(getbundledata.getId());
        name.setText(getbundledata.getName());
        gender.setText(getbundledata.getGender());

    }
}
