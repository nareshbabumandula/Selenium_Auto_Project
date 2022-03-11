package com.access.modifers;

public class PackageOutsideClass {

    public static void main(String[] args) {
        System.out.println("Accessing package/default access modifiers outside the class");
        PackageTest pt = new PackageTest();
        System.out.println(pt.URL);
        System.out.println(pt.username);
        pt.accessSite();
        pt.login();
    }
}
