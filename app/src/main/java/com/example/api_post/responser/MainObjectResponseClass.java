package com.example.api_post.responser;

import com.example.api_post.LastLoginObject;

public class MainObjectResponseClass {


    private String name;
    private String nameFirst;
    private String nameLast;
    private String nameMiddle;
    private String namePrefix;
    private String nameSuffix;
    private LastLoginObject last_login;

    public MainObjectResponseClass(String name, String nameFirst, String nameLast, String nameMiddle, String namePrefix, String nameSuffix, LastLoginObject last_login) {
        this.name = name;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.nameMiddle = nameMiddle;
        this.namePrefix = namePrefix;
        this.nameSuffix = nameSuffix;
        this.last_login = last_login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "MainObjectResponseClass{" +
                "name='" + name + '\'' +
                ", nameFirst='" + nameFirst + '\'' +
                ", nameLast='" + nameLast + '\'' +
                ", nameMiddle='" + nameMiddle + '\'' +
                ", namePrefix='" + namePrefix + '\'' +
                ", nameSuffix='" + nameSuffix + '\'' +
                ", last_login=" + last_login +
                '}';
    }
}
