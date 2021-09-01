package com.example.api_post;

import com.example.api_post.responser.MainObjectResponseClass;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface OurRetrofitClient {

    @POST("q")
    Call<MainObjectResponseClass> GetPostValue(@Body MainObject mainObject);

}
