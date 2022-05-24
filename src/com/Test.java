package com;

public class Test {

    public static void main(String[] args) {
        String str1="Java2blog";
        String str2=new String("Java2blog");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
