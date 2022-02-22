package com.java.programs;

public class JavaProgramsTest {

    public String reverseString(String strText){
        String rev="";
        char ch[] = strText.toCharArray();

        for (int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        JavaProgramsTest pt = new JavaProgramsTest();
        System.out.println(pt.reverseString("deepshika"));
    }
}
