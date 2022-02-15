package com.demo.auth;

import com.google.gson.Gson;

import java.util.Comparator;

public class Laptops implements Comparator<Laptop>{

    @Override
    public int compare(Laptop t1, Laptop t2) {
//        System.out.println("t1 laps Sorted with price  : " + t1.getPrice());
//        System.out.println("t2 laps Sorted with price  : " + t2.getPrice());


        if(t1.getPrice() > t2.getPrice())
            return 1;
        else
            return -1;
    }

}
