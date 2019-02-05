package com.company.inharitage;

public class Tester {

    public static void m(Object o) {}

    public static void main(String[] args) {
        System.out.println(new Child().isFlag());
        //System.out.println(new Parent().isFlag());

        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        
        Child child1 = (Child) parent1;
        Child child2 = (Child) parent2;
    }
}
