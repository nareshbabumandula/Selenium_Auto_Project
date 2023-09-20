package com.exceptionhandling.example;

public class TestCustomException {

    static void testAge(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age is less than 18");
        }else{
            System.out.println("Age is valid..!");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        testAge(10);
    }
}
