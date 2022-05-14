package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junit {
    Pattern pattern;
    Matcher matcher;

    public boolean firstName(String firstName) {
        String firstname = "[A-Z]{1}[a-z]{3,}$";
        pattern = Pattern.compile(firstName);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean lastName(String lastName) {
        String lastname = "[A-Z]{1}[a-z]{3,}$";
        pattern = Pattern.compile(lastName);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean email(String email) {
        String emailPattern = "abc.[a-z]{3,}@bl.co.[a-z]{2}$";
        pattern = Pattern.compile(email);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean mobileNumber(String mobileNumber) {
        String mobileNumberPattern = "[0-9]{10,}$";
        pattern = Pattern.compile(mobileNumber);
        matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public boolean password(String password) {
        String PasswordPattern = "^\\\\w(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&!^*+-?.,_]).{8,}$";
        pattern = Pattern.compile(password);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}





