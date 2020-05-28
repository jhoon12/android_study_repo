package com.example.server20528;

import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("text")
    private String text;

    public Post(String text){
        this.text = text;
    }
}
