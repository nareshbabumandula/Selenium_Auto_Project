package com.methods;

import java.util.ArrayList;

public class MethodsTest {

    // method without return type
    void m1(){
        System.out.println("m1 method return type is void");
    }

    // method with int type
    int m2(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }

    // method with int type
    boolean m3(){
        return true;
    }

    ArrayList<String> books(){
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("maths");
        alist.add("social");
        alist.add("science");
        alist.add("english");

        return alist;
    }



    public static void main(String[] args) {
        MethodsTest mt = new MethodsTest();
        mt.m1();
        int d = mt.m2();
        System.out.println(d);
        System.out.println(mt.m2());
        System.out.println(mt.m3());
        System.out.println(mt.books());

        ArrayList<String> sText = mt.books();
        System.out.println(sText.isEmpty());
        System.out.println(sText.get(0));

    }
}
