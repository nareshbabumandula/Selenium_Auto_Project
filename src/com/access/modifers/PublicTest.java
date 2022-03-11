package com.access.modifers;

public class PublicTest {

    public String URL = "https://www.mycontactform.com/";
    public String username = "naresh";

    public void accessSite(){
        System.out.println("Successfully accessed the site - " + URL);
    }

    public void login(){
        System.out.println("Successfully logged in to MCF application with user - " + username);
    }

    // No argument constructor
    public PublicTest() {
        System.out.println("Executing a public constructor..!");
    }

    public static void main(String[] args) {
        PublicTest pt = new PublicTest();
        System.out.println(pt.URL);
        System.out.println(pt.username);
        pt.accessSite();
        pt.login();
    }
}
