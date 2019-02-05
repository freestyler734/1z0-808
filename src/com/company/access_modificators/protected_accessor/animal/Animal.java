package com.company.access_modificators.protected_accessor.animal;

public class Animal {

    public int a = 1;

    protected String text = "text";

    protected void printText() {
        System.out.println(text);
    }
}
