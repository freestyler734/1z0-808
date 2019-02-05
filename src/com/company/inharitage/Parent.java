package com.company.inharitage;

import java.io.IOException;

public class Parent extends GrandParent  {

    String s = "1";

    static void m(){}

    private void fly() {
        System.out.println("fly Parent");
    }

     boolean isFlag() throws IOException{
        return false;
    }

    public void printFlag() {
    //    System.out.println(isFlag());
    }

    Parent(){
        this(1,2);
    }

    Parent(int i, int j) {
        super(i);
        String s = this.grandParentString;
    }

    Object doMethod() throws NullPointerException{
        return null;
    }


    public static boolean staticFlag() {
        return false;
    }


}
