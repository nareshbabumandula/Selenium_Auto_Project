package com.oops;

public class EncapsulationTest {

    public static void main(String[] args) {
        EncapsulationExample encap = new EncapsulationExample();
        encap.setUsername("ravi");
        System.out.println(encap.getUsername());
        encap.setPassword("Ignore123");
        System.out.println(encap.getPassword());
    }
}
