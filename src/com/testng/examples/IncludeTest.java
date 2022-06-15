package com.testng.examples;

import org.testng.annotations.Test;

public class IncludeTest {

    @Test
    public void vehicle(){
        System.out.println("Executing vehicle method..!");
    }
    @Test
    public void vehicle_car(){
        System.out.println("Executing vehicle_car method..!");
    }

    @Test
    public void Vehicle_bike(){
        System.out.println("Executing Vehicle_bike method..!");
    }
    @Test
    public void automobile_vehicle(){
        System.out.println("Executing automobile_vehicle method..!");
    }

}
