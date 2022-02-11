package com.oops;

public class Calculation extends Arithmatic{


    // Simple Interest = (P*T*R)/100
    void calculateInterest(){
        float p, t, r, si;
        p = 8000;
        r=10;
        t=2;
        si = (p*t*r)/100;
        System.out.println("Simple interest is : " + si);

    }

    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.calculateInterest();
        System.out.println(cal.a);
        System.out.println(cal.b);
        cal.addition();
        cal.subtraction();
        cal.multiplication();
        cal.division();
        cal.modulus();
    }
}
