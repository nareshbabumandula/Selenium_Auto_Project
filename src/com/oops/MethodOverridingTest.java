package com.oops;

public class MethodOverridingTest extends MethodOverloadTest{

    int a =10;

    void addition(){
        System.out.println("Executing addition method with no arguments in subclass");
    }

    // Constructor
    public MethodOverridingTest(){
        System.out.println("MethodOverridingTest Constructor..!");
    }

    static void Demo(){
        System.out.println("Executing sub class static method..!");
    }


    public static void main(String[] args) {
        MethodOverridingTest mot = new MethodOverridingTest();
        mot.addition();
        System.out.println(mot.a);
        Demo();
    }
}
