package com.java.programs;

public class StringReverseTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("srilatha");
        System.out.println(sb.reverse());

        String sText = "srilatha";

        char ch[] = sText.toCharArray();

        for(char c: ch){
            System.out.println(c);
        }
        System.out.println(ch.length);
        System.out.println("Reverse of the string : " + sText);
        String reverse="";
        for(int i=ch.length-1;i>=0;i--){
            reverse+=ch[i];
        }

        System.out.println("Reverse of the string : " + sText + " is " + reverse);
    }

}
