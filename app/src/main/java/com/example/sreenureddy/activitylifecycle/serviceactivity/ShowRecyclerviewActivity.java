package com.example.sreenureddy.activitylifecycle.serviceactivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.sreenureddy.activitylifecycle.clickeventhelpher.RecyclerViewClickListener;
import com.example.sreenureddy.activitylifecycle.clickeventhelpher.RecyclerViewTouchListener;
import com.example.sreenureddy.activitylifecycle.R;
import com.example.sreenureddy.activitylifecycle.adapter.ContactsAdapter;
import com.example.sreenureddy.activitylifecycle.modelclass.BaseModelRequest;
import com.example.sreenureddy.activitylifecycle.modelclass.BaseModelResponse;
import com.example.sreenureddy.activitylifecycle.modelclass.Contacts;
import com.example.sreenureddy.activitylifecycle.retrofit.ApiClient;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SreenuReddy on 2/21/2018.
 */

public class ShowRecyclerviewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ContactsAdapter contactsAdapter;
    ArrayList<Contacts> contactsList;
    ProgressDialog progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_result_activity);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        // recyclerView.addItemDecoration(new ItemDividerDecoration(this, LinearLayoutManager.VERTICAL));
        contactsList = new ArrayList<Contacts>();
        loadContacts();

        recyclerView.addOnItemTouchListener(new RecyclerViewTouchListener(getApplicationContext(), recyclerView, new RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Contacts contacts = contactsList.get(position);
                Intent intent = new Intent(ShowRecyclerviewActivity.this, SingleContactDetails.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("bundleContacts", contacts);
                // intent.putExtra("bundleContacts",contacts);
                intent.putExtras(bundle);
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }

    private void loadContacts()


    {
        progressBar = new ProgressDialog(ShowRecyclerviewActivity.this);
        progressBar.setMessage("Loading Contact Details .......");
        progressBar.show();
        progressBar.setCancelable(false);
        final BaseModelRequest baseModelRequest = new BaseModelRequest();
        ApiClient.getApiService("contacts").contactsRequest(baseModelRequest).enqueue(new Callback<BaseModelResponse>() {
            @Override
            public void onResponse(Call<BaseModelResponse> call, Response<BaseModelResponse> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        progressBar.dismiss();
                        BaseModelResponse baseModelResponse = response.body();
                        if (baseModelResponse.contacts.size() > 0) {
                            Log.d("contacts", "response--" + new Gson().toJson(baseModelResponse));
                            contactsList.addAll(baseModelResponse.contacts);
                        }

                        contactsAdapter = new ContactsAdapter(contactsList);
                        recyclerView.setAdapter(contactsAdapter);
                        contactsAdapter.notifyDataSetChanged();
//contactsList.add(contactsList);
                        Log.d("contacts", "body of data" + new Gson().toJson(baseModelResponse));
                    }
                }
            }

            @Override
            public void onFailure(Call<BaseModelResponse> call, Throwable t) {

            }
        });


    }


}
