package com.oops;

public abstract class Theater extends Permission{

    abstract void parking();
    abstract void ticketBooking(); // asbtract or bodyless or method without body

    // Non-abstract method or method with body or concrete method
    void onlineBooking(){
        System.out.println("Online booking facility..!"); // implementation
    }

    // static method
    static void fireandsafety(){
        System.out.println("Fire and Safety measures were taken care..!");
    }

    void onlineBooking(String bookingtype){
        System.out.println("Online booking facility..!"); // implementation
    }

    // instance block
    {
        System.out.println("This is an instance block");
    }
    static{
        System.out.println("This is a static block");
    }

    public static void main(String[] args){
        // Theater t = new Theater(); // We cannot instantiate an abstract class
        fireandsafety();
    }
}
