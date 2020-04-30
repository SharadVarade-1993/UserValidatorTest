package com.user;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Sharad");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("sharad");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Varade");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("varade");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc.xyz@cl.com.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result=validator.validateEmailAddress("abc.xyz@cl.com.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc@gmail.com.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmailAddresses_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc.123@gmail.com.in");
        Assert.assertEquals(true, result);

    }
}