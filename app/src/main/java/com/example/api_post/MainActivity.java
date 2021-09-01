package com.example.api_post;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.api_post.responser.MainObjectResponseClass;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    LastLoginObject  lastLoginObject;
    DataObjectClass dataObjectClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://app.fakejson.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();


        lastLoginObject=new LastLoginObject("12/12/12","172.111");
        dataObjectClass=new DataObjectClass("Md.","Rafid","Rahman","Rafid","Tawhidur","rafid",lastLoginObject);
        MainObject mainObject=new MainObject("isgBSIeyei_VrdYJGNaCwA",dataObjectClass);




       OurRetrofitClient ourRetrofitClient=retrofit.create(OurRetrofitClient.class);

        Call<MainObjectResponseClass> res=ourRetrofitClient.GetPostValue(mainObject);

        res.enqueue(new Callback<MainObjectResponseClass>() {
            @Override
            public void onResponse(Call<MainObjectResponseClass> call, Response<MainObjectResponseClass> response) {

                Log.d("aa",response.body().toString());

                LastLoginObject object=response.body().getLast_login();
                String time=object.getDate_time();
                String ip=object.getIp4();
            }

            @Override
            public void onFailure(Call<MainObjectResponseClass> call, Throwable t) {

                Log.d("aa :","Failed");
            }
        });

    }
}