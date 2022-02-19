package com.oops;

public class MethodOverloadTest {

    int a =20;

    void addition(){
        System.out.println("Executing addition method with no arguments");
    }

    void addition(int a, int b){
        System.out.println("Executing addition method with integer arguments : " + a + "," + b);
    }

    void addition(double a, double b){
        System.out.println("Executing addition method with double arguments : " + a + "," + b);
    }

    public MethodOverloadTest() {
        System.out.println("MethodOverloadTest Constructor..!");
    }

    public MethodOverloadTest(int a) {
        System.out.println("MethodOverloadTest Constructor with a single parameter..!");
    }

    static void Demo(){
        System.out.println("Executing static method..!");
    }


    public static void main(String[] args) {
        MethodOverloadTest mot = new MethodOverloadTest();
        MethodOverloadTest mo = new MethodOverloadTest(100);
        mot.addition();
        mot.addition(20,50);
        mot.addition(20.5436,300.235436);
        Demo();
        MethodOverloadTest.Demo();



    }

}
