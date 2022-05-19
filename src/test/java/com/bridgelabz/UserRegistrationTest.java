package com.bridgelabz;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    @Test
    public void checkValidEmail() {
        UserRegistration user = new UserRegistration();
        boolean pass = user.passwordValidation("abc.zxy@yahoo.com.in");
        assertSame(true, pass);
    }

    @Test
    public void checkValidEmail2() {
        UserRegistration user = new UserRegistration();
        boolean pass = user.passwordValidation("abc-100@yahoo.com");
        assertSame(true, pass);
    }

    @Test
    public void checkValidEmail3() {
        UserRegistration user = new UserRegistration();
        boolean pass = user.passwordValidation("abc.100@yahoo.com");
        assertSame(true, pass);
    }

    @Test
    public void checkValidEmail4() {
        UserRegistration user = new UserRegistration();
        boolean pass = user.passwordValidation("abc111@abc.com");
        assertSame(true, pass);
    }

    @Test
    public void checkValidEmail5() {
        UserRegistration user = new UserRegistration();
        boolean pass = user.passwordValidation("abc-100@yahoo.net");
        assertSame(true, pass);
    }

    @Test
    public void checkValidEmail6() {
        UserRegistration user = new UserRegistration();
        boolean pass = user.passwordValidation("abc.100@abc.com.au");
        assertSame(true, pass);
    }

    @Test
    public void checkValidEmail7() {
        UserRegistration user = new UserRegistration();
        boolean pass = user.passwordValidation("abc@gmail.com.com");
        assertSame(true, pass);
    }
}


