package com.example.api_post;

public class DataObjectClass {

    private String nameFirst;
    private String nameLast;
    private String nameMiddle;
    private String name;
    private String namePrefix;
    private String nameSuffix;
    private LastLoginObject last_login;

    public DataObjectClass(String nameFirst, String nameLast, String nameMiddle, String name, String namePrefix, String nameSuffix, LastLoginObject last_login) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.nameMiddle = nameMiddle;
        this.name = name;
        this.namePrefix = namePrefix;
        this.nameSuffix = nameSuffix;
        this.last_login = last_login;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameMiddle() {
        return nameMiddle;
    }

    public void setNameMiddle(String nameMiddle) {
        this.nameMiddle = nameMiddle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public LastLoginObject getLast_login() {
        return last_login;
    }

    public void setLast_login(LastLoginObject last_login) {
        this.last_login = last_login;
    }
}
