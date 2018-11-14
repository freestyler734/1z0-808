package com.company.lambda;

import java.util.function.Predicate;

public abstract class Tester {

    public static void main(String[] args) {
      //  print((String s) -> { return 1;});

        Predicate<String> predicate = (String s) -> s.contains("s");
        System.out.println(predicate.test("asd"));

        MyFuncInterface i = (s) -> System.out.println(s);
    }

    public static void print(MyFuncInterface funcInterface) {
        String s = "test";
        funcInterface.myPrint(s);
    }

}
