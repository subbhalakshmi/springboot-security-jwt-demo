package com.demo.auth.response;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private List<UsersDetails> usersDetailsList = new ArrayList<>();

    public List<UsersDetails> getUsersDetailsList() {
        return usersDetailsList;
    }

    public void setUsersDetailsList(List<UsersDetails> usersDetailsList) {
        this.usersDetailsList = usersDetailsList;
    }

   /* @Override
    public String toString() {
        return "Users{" +
                "usersDetailsList=" + usersDetailsList +
                '}';
    }*/

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
