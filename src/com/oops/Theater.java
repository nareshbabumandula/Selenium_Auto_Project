package com.oops;

public abstract class Theater {

    abstract void parking();

    // Non-abstract method or method with body or concrete method
    void onlineBooking(){
        System.out.println("Online booking facility..!"); // implementation
    }

    public static void main(String[] args) {
        // Theater t = new Theater(); // We cannot instantiate an abstract class
    }
}
