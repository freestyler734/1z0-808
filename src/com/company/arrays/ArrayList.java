package com.company.arrays;

public class ArrayList {

    static void method() throws Exception {

    }

    static {
       // method();
    }

    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer[] array = new Integer[6];

        list.toArray(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

        array[1] = 33;
        System.out.println();
        for (int i: list) {
            System.out.print(i + " ");
        }


    }

}
