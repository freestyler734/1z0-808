package com.company.initialization_order;

public class WithWithHeritage extends WithHeritage{

    static String s5 = "child child static";
    static {
        System.out.println(s5);
    }
    String s6;
    {
        s6 = "child child not static";
        System.out.println(s6);
    }

    WithWithHeritage() {
        System.out.println("Child Child Constructor");
    }
}
