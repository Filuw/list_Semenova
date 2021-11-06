package com.example.list_semenova;

import java.util.List;

import okhttp3.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class Contributor {
    private String login;
    private int contributions;

    @Override
    public String toString(){
        return login + " (" + contributions + ")";
    }
}
