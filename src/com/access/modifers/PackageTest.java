package com.access.modifers;

public class PackageTest {

    String URL = "https://www.mycontactform.com/";
    String username = "naresh";

    void accessSite(){
        System.out.println("Successfully accessed the site - " + URL);
    }

    void login(){
        System.out.println("Successfully logged in to MCF application with user - " + username);
    }

    // No argument constructor
    PackageTest() {
        System.out.println("Executing a package constructor..!");
    }

    public static void main(String[] args) {
        PackageTest pt = new PackageTest();
        System.out.println(pt.URL);
        System.out.println(pt.username);
        pt.accessSite();
        pt.login();
    }
}
