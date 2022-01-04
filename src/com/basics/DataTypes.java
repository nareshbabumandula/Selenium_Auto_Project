package com.basics;

public class DataTypes {

    public static void main(String args[]){

        // Primitive data types
        byte b = 127; // Byte container range -128 to +127
        short s = 1234;
        int i = 53466;
        long l = 346347;
        float f = 23.5f;
        double d = 2345.464;
        char c = 't';
        boolean b1=true;
        System.out.println("Byte value of  b is : "  +b);
        System.out.println("Short value of s is : "  +s);
        System.out.println("Int value of i is : "  +i);
        System.out.println("Long value of l is : "  +l);
        System.out.println("Float value of f is : "  +f);
        System.out.println("Double value of d is : "  +d);
        System.out.println("Char value of c is : "  +c);
        System.out.println("Boolean value of b1 is : "  +b1);

        //Wrapper Classes for Primitives
        System.out.println("Minimum value for Byte datatype is  : "  + Byte.MIN_VALUE);
        System.out.println("Maximum value for Byte datatype is  : "  + Byte.MAX_VALUE);

    }

}
