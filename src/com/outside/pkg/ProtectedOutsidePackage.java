package com.outside.pkg;

import com.access.modifers.PackageTest;
import com.access.modifers.ProtectedTest;

public class ProtectedOutsidePackage extends ProtectedTest{

    public static void main(String[] args) {
        /*System.out.println("Accessing protected access modifiers outside the package");
        ProtectedTest pt = new ProtectedTest();
        System.out.println(pt.URL);
        System.out.println(pt.username);
        pt.accessSite();
        pt.login();*/

        ProtectedOutsidePackage pop = new ProtectedOutsidePackage();
        System.out.println(pop.URL);
        System.out.println(pop.username);

    }


}
