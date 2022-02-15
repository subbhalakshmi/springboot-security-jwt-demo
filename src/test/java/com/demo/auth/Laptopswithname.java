package com.demo.auth;

import com.google.gson.Gson;

import java.util.Comparator;

public class Laptopswithname implements Comparator<Laptop>{

    @Override
    public int compare(Laptop t1, Laptop t2) {
//        System.out.println("t1 laps Sorted with getRam  : " + t1.getRam());
//        System.out.println("t2 laps Sorted with getRam  : " + t2.getRam());


        if(t1.getRam() > t2.getRam())
            return 1;
        else
            return -1;
    }

}
