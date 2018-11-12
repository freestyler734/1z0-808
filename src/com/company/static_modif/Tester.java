package com.company.static_modif;

public class Tester {

    public static void main(String[] args) {

        Static staticObj = new Static();
        System.out.println(staticObj.count);
        staticObj = null;
        System.out.println(staticObj.count);
        staticObj.staticMethod();
        new Static().staticMethod();
    }
}
