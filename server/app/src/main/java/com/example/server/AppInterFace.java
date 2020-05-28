package com.example.server;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AppInterFace {
   String API_URL =
            "10.156.145.141:3000";

    @GET("comments")
    Call<JsonParse>getComment(@Query("message") String message);

}
