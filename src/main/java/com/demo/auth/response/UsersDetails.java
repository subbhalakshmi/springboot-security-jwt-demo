package com.demo.auth.response;

import com.google.gson.Gson;

public class UsersDetails {

    private int id;
    private String name;
    private String gender;


    public UsersDetails(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public UsersDetails() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /*@Override
    public String toString() {
        return "Users {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
