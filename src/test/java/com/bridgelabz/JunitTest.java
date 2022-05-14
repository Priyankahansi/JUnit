package com.bridgelabz;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class JunitTest {
    Junit obj1 = new Junit();
    @org.junit.Test
    public void firstName() {
        boolean result = obj1.firstName("Abc");
        assertTrue(result);
    }

    @org.junit.Test
    public void lastName() {
        boolean result = obj1.lastName("Abc");
        assertTrue(result);
    }

    @org.junit.Test
    public void email() {
        boolean result = obj1.email("abc.aaa@bl.co.sy");
        assertTrue(result);
    }

    @org.junit.Test
    public void mobileNumber() {
        boolean result = obj1.mobileNumber("8217468589");
        assertTrue(result);
    }

    @org.junit.Test
    public void password() {
        boolean result = obj1.password("Praju@123");
        assertTrue(result);
    }
}




