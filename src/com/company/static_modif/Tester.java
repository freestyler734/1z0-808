package com.company.static_modif;

//import static com.company.static_modif.inner_package.A.i;
//import static com.company.static_modif.inner_package.B.i;
import static com.company.static_modif.inner_package.B.test;
public class Tester {

    public static void main(String[] args) {

        Static staticObj = new Static();
        System.out.println(staticObj.count);
        staticObj = null;
        System.out.println(staticObj.count);
        staticObj.staticMethod();
        new Static().staticMethod();
        test(1);

    }
}
