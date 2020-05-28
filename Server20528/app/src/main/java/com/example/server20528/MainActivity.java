package com.example.server20528;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    String text = "명철아 안녕";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Post post = new Post(text);

        Log.d("text",text);

        textView = findViewById(R.id.textView);
        Call<Post> call = RetrofitClient.getInstance().getservice().GetRetrofitQuery(post);
        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if (response.isSuccessful()) {
                    Log.d("code",""+response.code());
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.e("fail", t.getMessage());
            }
        });
    }

}
