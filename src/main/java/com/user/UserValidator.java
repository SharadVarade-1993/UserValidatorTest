package com.user;

import java.util.regex.Pattern;

public class UserValidator {
    private  static final String FIRST_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    private  static final String LAST_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    private  static final String EMAIL_ADDRESS_PATTERN="[a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})$";
    private  static final String PASSWORD_PATTERN="^[0-9a-zA-Z]{8,}$";
    private  static final String UPPER_PATTERN="^[A-Z]{1}[a-zA-Z]{7,}$";
    private  static final String ONE_NUMERIC_NUMBER_PATTERN="^([0-9]{1}[0-9a-zA-Z])$";
    private  static final String SPECIAL_CHARACTER_PATTERN="^([@#$%&!][0-9a-zA-Z]{1,7})$";



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


    public boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

    public boolean validateUpperCase(String upper){
        Pattern pattern = Pattern.compile(UPPER_PATTERN);
        return pattern.matcher(upper).matches();
    }

    public boolean validateOneNumber(String numeric){
        Pattern pattern = Pattern.compile(ONE_NUMERIC_NUMBER_PATTERN);
        return pattern.matcher(numeric).matches();
    }

    public boolean validateSpecialCharacter(String special){
        Pattern pattern = Pattern.compile(SPECIAL_CHARACTER_PATTERN);
        return pattern.matcher(special).matches();
    }
}
