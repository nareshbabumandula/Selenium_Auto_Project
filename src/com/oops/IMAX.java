package com.oops;

public class IMAX extends Theater{

    void cafteria(){
        System.out.println("Cafeteria is open..!");
    }

    @Override
    void parking() {
        System.out.println("Parking facility is available to park 100 cars and 500 bikes");
    }

    @Override
    void ticketBooking() {
        System.out.println("Ticket booking facility is available");
    }

    // instance block
    {
        System.out.println("This is an instance block in derived class");
    }

    public static void main(String[] args) {
        IMAX im = new IMAX();
        im.cafteria();
    }
}
