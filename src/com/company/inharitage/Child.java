package com.company.inharitage;


class Child extends Parent {

    String s = "2";

     final static void m(){}

    Child() {
        super(1,2);
       int k = super.i;
       grandParentString = "";

    }

    String doMethod(){

        return null;
    }

    public boolean isFlag() throws RuntimeException {
         return true;
    }

    public void printFlag() {
        System.out.println(isFlag());
    }

    public void printFlag(int q) {
        System.out.println(isFlag());
    }

    public static boolean staticFlag() {
        return true;
    }



    protected void fly() {
       System.out.println("fly Child");
    }

  }