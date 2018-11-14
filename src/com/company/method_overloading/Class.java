package com.company.method_overloading;

public class Class {

//    public int method(long i){
//        return 1;
//    }
//
    public Class(int i) {

    }
    public void method(Object o){
        System.out.println("object");
    }

    public void method(double o){
        System.out.println("double");
    }

    public void method(long o){
        System.out.println("long");

    }

}
