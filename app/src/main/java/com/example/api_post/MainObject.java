package com.example.api_post;

public class MainObject {
    private String token;
    private DataObjectClass data;

    public MainObject(String token, DataObjectClass data) {
        this.token = token;
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public DataObjectClass getData() {
        return data;
    }

    public void setData(DataObjectClass data) {
        this.data = data;
    }
}
