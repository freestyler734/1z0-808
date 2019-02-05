package com.company.common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int m() {
        try {
            return 1;
        } catch (RuntimeException e) {
            return 2;
        } catch (Exception e) {
            return 2;
        }
        finally {
           //return 2;
        }

      //  return 1;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//
//        System.out.println(list instanceof Object);
//        System.out.println(list instanceof List);
//        System.out.println(list instanceof ArrayList);

        Integer integer = new Integer(5);
        integer = null;

//        integer++;

//        System.out.println(integer.getClass());
//        System.out.println(integer.intValue());

        Integer[] array = {1,2,3,4};
        List<Integer> list1 = Arrays.asList((Integer[]) array);

//        list1.remove(2);

        long l = new Long("123");

        String s = null;
        s = s + "1".intern();
        System.out.println(s);




        String s1 = "строка";
        String s2 = "стр" + "ока";

        String s3 = "ока";
        System.out.println(s1 == s2);
        System.out.println(s1 == s2);
        System.out.println(s1 == ("стр" + s3));
        System.out.println(s1 == ("стр" + s3).intern());



        List ll = new ArrayList<Double>();
        ll.add(1.);
        ll.add(2.);
        System.out.println(ll.contains("asdas"));

       // int int = 1;
        String String = "";

        //Integer Integer = new Integer();

        int k = 1;

        String str;

        char c = 'a' + 'b';

        int jk = c + 's';

        StringBuilder b = new StringBuilder();

        Double[] as = new Double[1];

        Double[] dx = (Double[]) ll.toArray(as);

        System.out.println("as == dx " + (as == dx));

    }
}
