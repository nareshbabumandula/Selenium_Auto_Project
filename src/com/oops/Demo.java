package com.oops;


import com.google.common.base.CharMatcher;
import org.testng.annotations.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Demo {

    @Test
    public void Test1(){
        System.out.println("Test1");
    }
    @Test
    public void Test2(){
        System.out.println("Test2");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }
}
