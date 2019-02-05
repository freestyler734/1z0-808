package com.company.initialization_order;

public class WithHeritage extends Parent{

    static String s3 = "child static";

    static {
        System.out.println(s3);
    }

    String s4;
    {
        s4 = "child not static";
        System.out.println(s4);
    }

    WithHeritage(){
        System.out.println("Child Constructor");
    }
}
