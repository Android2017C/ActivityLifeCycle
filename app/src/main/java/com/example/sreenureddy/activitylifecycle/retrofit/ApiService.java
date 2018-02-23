package com.example.sreenureddy.activitylifecycle.retrofit;

import com.example.sreenureddy.activitylifecycle.modelclass.BaseModelRequest;
import com.example.sreenureddy.activitylifecycle.modelclass.BaseModelResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by SreenuReddy on 2/21/2018.
 */

public interface ApiService {


    @POST("contacts")
    Call<BaseModelResponse> contactsRequest(@Body BaseModelRequest newPlantRequest);
    /*@GET("contacts")
    Call<BaseModelResponse> getcontactsRequest();*/
}