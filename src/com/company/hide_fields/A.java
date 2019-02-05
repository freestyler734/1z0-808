package com.company.hide_fields;

public class A implements I {

    static int staticI = 1;

    static {
       // new Character();
    }

    public int printStatic() {
        return staticI;
    }

    public int print() {
        return i;
    }
    int i = 1;

    private void sout() {
        System.out.println("A");
    }

    public void dom() {
        sout();
    }

}
