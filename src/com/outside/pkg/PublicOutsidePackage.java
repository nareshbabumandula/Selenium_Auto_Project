package com.outside.pkg;

import com.access.modifers.ProtectedTest;
import com.access.modifers.PublicTest;

public class PublicOutsidePackage extends ProtectedTest{

    public static void main(String[] args) {
        System.out.println("Accessing public access modifiers outside the package");
        PublicTest pt = new PublicTest();
        System.out.println(pt.URL);
        System.out.println(pt.username);
        pt.accessSite();
        pt.login();

    }


}
