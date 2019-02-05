package com.company.hide_fields;

public class B extends A {

    static int staticI = 2;

    public int printStatic() {
        return staticI;
    }

    int i = 2;

    public int print() {
        return i;
    }

    private void sout() {
        System.out.println("B");
    }

    public void dom() {
        sout();
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        int staticI = 1;
        System.out.println(staticI);

        a.dom();
        System.out.println("staticI " + a.printStatic());
        System.out.println("i " + a.print());

    }
}
