package com.java.basics;

public class VariablesTest {

    /*Instance method vs Static method
    Instance method can access the instance methods and instance variables directly.
    Instance method can access static variables and static methods directly.
    Static methods can access the static variables and static methods directly.
    Static methods can’t access instance methods and instance variables directly.
    They must use reference to object. And static method can’t use this keyword as there is no instance for ‘this’ to refer to.
    */

    // Data members
    int a=10; // Instance variables
    int b=20;
    static int c = 100; // Static variable
    int d;

    // + is for concatenation
    //method or block of code which we create for re-usability purpose
    void addition(){
        System.out.println("Addition of a and b is : " + (a+b));
    }

    //method
    void subtraction(){
        int a=100; // local variable
        int b=50;  // local variable
        System.out.println("Subtraction of a and b is : " + (a-b));
    }

    static void multiplication(){
        int a=30;
        int b=20;
        System.out.println("Multiplication of a and b is : " + (a*b));
    }


    public static void main(String[] args){
        VariablesTest d = new VariablesTest();
        VariablesTest d1 = new VariablesTest();
        d.addition();
        d.subtraction();
        multiplication();  // static method can be directly called without using the object reference
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(c); // static variable can be directly called without using the object reference
        System.out.println(d.d);

    }
}
