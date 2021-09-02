package com.example.api_post.part6;

public class ObjectStructureClass {

    private int userId;
    private String body;
    private String title;

    public ObjectStructureClass(int userId, String body, String title) {
        this.userId = userId;
        this.body = body;
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ObjectStructureClass{" +
                "userId=" + userId +
                ", body='" + body + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
