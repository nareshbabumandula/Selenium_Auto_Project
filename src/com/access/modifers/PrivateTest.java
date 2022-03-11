package com.access.modifers;

public class PrivateTest {

    private String URL = "https://www.mycontactform.com/";
    String username = "naresh";

    private void accessSite(){
        System.out.println("Successfully accessed the site - " + URL);
    }

    private void login(){
        System.out.println("Successfully logged in to MCF application with user - " + username);
    }

    // No argument constructor
    private PrivateTest() {
        System.out.println("Executing a private constructor..!");
    }

    public static void main(String[] args) {
        PrivateTest pt = new PrivateTest();
        System.out.println(pt.URL);
        System.out.println(pt.username);
        pt.accessSite();
        pt.login();
    }
}
