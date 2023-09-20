package com.locators;

public class Demo {

    static int count =0;
    static int x = 1111;
    static {
        x = x-- - --x;
    }
    {
        x = x++ + ++x;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.count = 10;
        d2.count=20;
        Demo.count=100;
        System.out.println(d1.count);
        System.out.println(d2.count);
        System.out.println(x);
    }
}
