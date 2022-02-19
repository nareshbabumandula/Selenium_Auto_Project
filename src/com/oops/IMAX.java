package com.oops;

public class IMAX extends Theater{

    void cafteria(){
        System.out.println("Cafeteria is open..!");
    }

    @Override
    void parking() {
        System.out.println("Parking facility is available to park 100 cars and 500 bikes");
    }

    public static void main(String[] args) {
        IMAX im = new IMAX();
        im.cafteria();
    }
}
