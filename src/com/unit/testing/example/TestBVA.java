package com.unit.testing.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBVA {

    @Test
    public void testBVA(){
        assertEquals(true, BVA.verifyUserRegistration("nare"));
        assertEquals(false, BVA.verifyUserRegistration("na"));
    }
}
