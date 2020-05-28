package com.example.server;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Retrofit retrofit;
    AppInterFace appInterFace;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.getText);


        retrofit = new Retrofit.Builder()
                .baseUrl(AppInterFace.API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        appInterFace = retrofit.create(AppInterFace.class);
        Call<JsonParse> hello_server = appInterFace.getComment("");
        hello_server.enqueue(new Callback<JsonParse>() {
            @Override
            public void onResponse(Call<JsonParse> call, Response<JsonParse> response) {
                Log.d("Test", response.body().toString());
                text.setText(response.body().toString());
                if (response.code() == 200)
                    Log.d("response code", "success");
                else
                    Log.e("response error",response.message());
            }

            @Override
            public void onFailure(Call<JsonParse> call, Throwable t) {

            }
        });
    }
}
