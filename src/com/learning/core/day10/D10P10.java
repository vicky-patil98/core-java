package com.learning.core.day10;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class D10P10 {

    @Test(timeout = 2000)
    public void testValidUsername() {
        UserProfile userProfile = new UserProfile();
        userProfile.validateUsername("VijayP");
        
    }

    @Test(timeout = 2000)
    public void testInvalidUsername() {
        UserProfile userProfile = new UserProfile();
        userProfile.validateUsername("User123");
       
    }

    @Test(timeout = 2000)
    public void testValidPassword() {
        UserProfile userProfile = new UserProfile();
        userProfile.validatePassword("Password12");
        
    }

    @Test(timeout = 2000)
    public void testInvalidPassword() {
        UserProfile userProfile = new UserProfile();
        userProfile.validatePassword("pwd1");
        
    }
}
