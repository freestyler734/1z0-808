package com.company.exception;

import com.sun.javaws.exceptions.ErrorCodeResponseException;
import org.omg.CORBA.OBJ_ADAPTER;

import java.io.IOException;

public class Tester{

    public static void main(String[] args) {

        try {
            error();
        } catch (StackOverflowError error) {
            //System.out.println("StackOverflowError");
        }

        try {
            throw new Throwable();
        } catch (Throwable throwable) {
            //throwable.printStackTrace();
        }


        try {
            throw new Exception("Yurets");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        throw new Error();
//
//        long l = 0;
//        byte b = 0;
//        double d = b/0;
//        System.out.println(d);
     }

    public static void exception() throws Exception {
        //throw new IOException();
    }

    public static void runtimeException() throws RuntimeException {
        throw new RuntimeException();
    }

    public static void error() throws StackOverflowError {
        throw new StackOverflowError();
    }
}
