package com.company.wrappers;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tester {

    public static void main(String[] args) {
        Integer i1 = 1; // автоупаковка
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;

        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1 == i3: " + (i1 == i3));
      //  System.out.println("i1 == b1: " + (i1 == b1));
        System.out.println("i1.equals(i2): " + (i1.equals(i2)));
        System.out.println("i1.equals(g1): " + (i1.equals(g1)));
        System.out.println("i1.equals(b1): " + (i1.equals(b1)));


        Integer r = ++i1;
        System.out.println(r == i1);

        Character c = 1;
        Float d = 1.f;
        char ch = 1;

        label:{
           // s label;
            String[] s ={};
        }
        final int s = 1;
        char ch2 = s;

        switch (1) {

        }

        int min = Integer.MIN_VALUE;
        System.out.println(min);

        short sh = 9;
        Short v = 9;
        Integer in = 9;
        in = (int) v.shortValue();

            //   Integer i =

        Byte aByte  = 1;
        Short aShort  = 1;
        Integer aInt = 1;
        Long aLong = 1L;
        Character aChar = 1;
        Float aFloat = 1.f;
        Double aDouble = 1.;
        Boolean b = true;


      //  aInt = sh;
        int x;


        do {
            x = 3;
        } while (false);


        byte by = 1;



        aLong = aByte.longValue();


        int i,j,k,l;

        i = j = k = l = 90;

        boolean bo = true;

        if(!bo)
            if(!bo)
                System.out.println("1");
        else
            J: System.out.println("2");





        //aInt = by;
    }
}
