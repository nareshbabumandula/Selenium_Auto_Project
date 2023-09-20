package com.exceptionhandling.example;

public class InvalidAgeException extends  Exception{

    InvalidAgeException(String message){
        super(message);
    }
}
