package com.example.server20528;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static RetrofitClient retrofitClient = new RetrofitClient();

    public static RetrofitClient getInstance() {
        return retrofitClient;
    }

    public RetrofitClient() {
    }

    public static final String ip = "http://10.156.145.143:3000";
    //객체 생성
    Retrofit retrofit = new Retrofit.Builder()
            //서버 url설정
            .baseUrl(ip)
            //데이터파싱설정
            .addConverterFactory(GsonConverterFactory.create())
            //객체정보반환
            .build();

    ApiService apiService = retrofit.create(ApiService.class);

    public ApiService getservice() {
        return apiService;
    }
}
