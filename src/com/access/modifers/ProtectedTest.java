package com.access.modifers;

public class ProtectedTest {

    protected String URL = "https://www.mycontactform.com/";
    protected String username = "naresh";

    protected void accessSite(){
        System.out.println("Successfully accessed the site - " + URL);
    }

    protected void login(){
        System.out.println("Successfully logged in to MCF application with user - " + username);
    }

    // No argument constructor
    protected ProtectedTest() {
        System.out.println("Executing a protected constructor..!");
    }

    public static void main(String[] args) {
        ProtectedTest pt = new ProtectedTest();
        System.out.println(pt.URL);
        System.out.println(pt.username);
        pt.accessSite();
        pt.login();
    }
}
