package com.user;

import java.util.regex.Pattern;

public class UserValidator {
    private  static final String FIRST_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    private  static final String LAST_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    private  static final String EMAIL_ADDRESS_PATTERN="[a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})$";


    public boolean validateFirstName(String fname){
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public  boolean validateLastName(String lname){
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public boolean validateEmailAddress(String email){
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }
}
