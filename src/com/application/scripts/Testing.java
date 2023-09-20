package com.application.scripts;

public class Testing {
    static int x= 10 ;
    int y=20;
    public static void main(String[] args) {
        /*Testing o1=new Testing();
        o1.x=444;
        o1.y=323;
        Testing o2 = new Testing();
        System.out.println(o2.x);
        System.out.println(o2.y);*/

        String s1="Selenium";
        String s2="Selenium";
        String s3=new String("Selenium");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
