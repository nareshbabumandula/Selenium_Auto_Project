package com.application.scripts;

public class Demo extends Test{


    static int i=20;

    Demo(){
         System.out.println("demo");
    }

    public static void main(String[] args) {
        String s1=new String("irfan");
        String s2=new String("irfan");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("irfan"+1+2);
        System.out.println(1+2+"irfan");

        int a=7;
        System.out.println(a++);
        System.out.println(a);

    }
}
