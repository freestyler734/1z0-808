package com.company.initialization_order;

public class Parent {

    static String s1 = "parent static";

    static {
        System.out.println(s1);
    }

    String s2;
    {
        s2 = "parent not static";
        System.out.println(s2);
    }

    Parent(){
        System.out.println("Parent Constructor");
    }
}
