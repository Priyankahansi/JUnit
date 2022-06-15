package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class MultipleEmailTest {
    @Test
    public void givenEmailId1_WhenProper_ShouldReturnTrue() {
        MultipleEmail multipleEmail = new MultipleEmail();
        boolean result = multipleEmail.validateEmail("def.123@bl.12.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmailId2_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("abc.yah@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmailId3_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("abc.123@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmailId4_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("abc.uuu@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmailId5_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("abc.ppp@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmailId6_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("abc.lll@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmailId7_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("abc.lll@bl.co.in");
        Assertions.assertTrue(result);
    }
}