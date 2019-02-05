package com.company.strings;

public class Tester {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("0123");

        String string = ". . 2 1 3 4";
        string = string.replace(".", sb);
        System.out.println(string);

        sb.replace(0, 1,"q");
        System.out.println(sb);
    }
}
