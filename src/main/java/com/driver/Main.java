package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly obj = new RWOnly();
        //'name' has a private access in 'com.driver.RWOnly'
        //obj.name = "venkat";
        obj.setName("NVN");
        System.out.println(obj.getName());
    }
}