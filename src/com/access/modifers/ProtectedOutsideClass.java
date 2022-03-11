package com.access.modifers;

public class ProtectedOutsideClass {

    public static void main(String[] args) {
        ProtectedTest pt = new ProtectedTest();
        System.out.println(pt.URL);
        System.out.println(pt.username);
        pt.accessSite();
        pt.login();
    }
}
