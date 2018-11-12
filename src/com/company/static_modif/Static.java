package com.company.static_modif;

public class Static {

    public static int count;

    private static final int constant;
    private final int constant2;
    static {
        constant = 0;
    }

    public Static(){
        constant2 = 0;
    }

    public void test() {
        count++;
    }

    public static void staticMethod() {
        System.out.println(++count);
    }
}
