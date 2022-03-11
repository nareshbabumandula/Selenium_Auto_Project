package com.oops;

public class Arithmatic extends EncapsulationExample {

    // Instance variables
    // State or characteristics or attributes or data members
    int a=10;
    int b=20;

    // Behavior or action
    void addition(){
        System.out.println("Addition of a and b is  : " + (a+b));
    }

    void subtraction(){
        System.out.println("Subtraction of a and b is  : " + (a-b));
    }

    void multiplication(){
        System.out.println("Multiplication of a and b is  : " + (a*b));
    }

    void division(){
        System.out.println("Division of a and b is  : " + (b/a));
    }

    void modulus(){
        System.out.println("Modulus of a and b is  : " + (b%a));
    }

    Arithmatic(){
        System.out.println("This is a constructor..!");
    }


    public static void main(String[] args) {
        Arithmatic arth = new Arithmatic();
        System.out.println(arth.a);
        System.out.println(arth.b);
        arth.addition();
        arth.subtraction();
        arth.multiplication();
        arth.division();
        arth.modulus();

    }


}
