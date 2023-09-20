package com.locators;

public class Practice {

    public static void main(String[] args) {
        String str = "selenium with java and manual testing";
        String str2 = str.replaceAll("[^aeiou]","");
        System.out.println(str2);
    }
}
