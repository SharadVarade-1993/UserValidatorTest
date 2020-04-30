package com.user;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result=validator.validateFirstName("Sharad");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result=validator.validateFirstName("sharad");
        Assert.assertEquals(false,result);
    }
}