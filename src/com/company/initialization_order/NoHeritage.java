package com.company.initialization_order;

public class NoHeritage {

    int i = 0;
    {
        System.out.println(i);
    }

    static int i2 = 1;
    static int i3 = 2;
    static {
        System.out.println(i2+i3);
    }

    static {
        new NoHeritage();
    }

    static {
        System.out.println("after creating object");
    }

    NoHeritage(){
        System.out.println("Constructor");
    }

//    public static void main(String[] args) {
//    }

}
