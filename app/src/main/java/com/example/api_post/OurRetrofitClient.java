package com.example.api_post;

import com.example.api_post.part5.CreateUserClass;
import com.example.api_post.part6.ObjectStructureClass;
import com.example.api_post.responser.MainObjectResponseClass;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface OurRetrofitClient {

//    @POST("q")
//    Call<MainObjectResponseClass> GetPostValue(@Body MainObject mainObject);
//
//    @FormUrlEncoded
//    @POST("posts")
//    Call<CreateUserClass> CreateUser(
//            @Field("userId") int userId,
//            @Field("title") String title,
//            @Field("body") String body
//    );

    @PUT("posts/{1}")
    Call<ObjectStructureClass> PutRequest(@Path("id") int id,@Body ObjectStructureClass objectStructureClass);


}
