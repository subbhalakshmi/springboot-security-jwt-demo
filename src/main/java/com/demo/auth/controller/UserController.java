package com.demo.auth.controller;

import com.demo.auth.response.Users;
import com.demo.auth.response.UsersDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

//    anyone
    @RequestMapping("/")
    public String hello(){
        return "welcome";
    }

//     admin roles
    @GetMapping(value = "/admin", produces = "application/json")
    public String getAdminDetails(){
        return "<h1>its admin page</h1>";
    }

//    user and admin roles
    @GetMapping(value = "/user", produces = "application/json")
    public List<UsersDetails> getuserdetails(){
        Users users = new Users();

        List<UsersDetails> usersDetailsList = new ArrayList<>();
        usersDetailsList.add(new UsersDetails(2,"jack","M"));
        usersDetailsList.add(new UsersDetails(3,"jem","M"));

        users.setUsersDetailsList(usersDetailsList);

//        UsersDetails userDetails = new UsersDetails(1,"jill","F");
//        usersDetailsList.add(userDetails);

        System.out.println("users.getUsersDetailsList() " + users.getUsersDetailsList().toString());
        System.out.println("usersDetailsList " + usersDetailsList.toString());



        return usersDetailsList;
    }

}
