package com.application.scripts;

public class WRDCApp {


    public static void verifyLogin(String username, String password){
        if(username.isEmpty() || username.equals(null)){
            System.out.println("username should not be empty");
        }else if(password.isEmpty() || password.equals(null)) {
        } else{
            System.out.println("Login Successful");
        }
    }

    public static void main(String[] args) {
        verifyLogin("naresh", "secure*123");
    }
}
