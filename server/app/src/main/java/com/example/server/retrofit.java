package com.example.server;

import android.os.Bundle;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofit {
    private static retrofit ourInstance = new retrofit();
    public static retrofit getInstance() {
        return ourInstance;
    }
    private retrofit() {
    }
    public static final String API_URL =
            "http://10.156.145.141:3000";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        AppInterFace appInterFace = retrofit.create(AppInterFace.class);

    public AppInterFace getService() {
        return appInterFace;
    }

}

