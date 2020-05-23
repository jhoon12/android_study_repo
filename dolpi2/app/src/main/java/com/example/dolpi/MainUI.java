package com.example.dolpi;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainUI extends main_baar_delete {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_ui);
        Toast.makeText(getApplicationContext(),"로그인 되었습니다!",Toast.LENGTH_LONG).show();
    }
}
