package com.example.server20528;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/")
    Call<Post> GetRetrofitQuery(@Body Post post);
}