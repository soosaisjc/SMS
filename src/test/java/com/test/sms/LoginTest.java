package com.test.sms;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by soosai on 29/1/19.
 */
public class LoginTest {

    @Test
    public void testLoginObject() {
        Login login = new Login();
        assertNotNull(login);
    }

    @Test
    public void testLoginValid() {
        Login login = new Login();
        assertFalse(login.isValidLogin("Test", "pass"));
    }
}
