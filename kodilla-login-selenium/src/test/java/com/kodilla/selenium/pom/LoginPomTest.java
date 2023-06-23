package com.kodilla.selenium.pom.old;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginPomTest {
    LoginPom loginPom;

    @BeforeEach
    public void setup() {
        loginPom = new LoginPom();
    }
    @Test
    public void testLoginPage_CheckErrorValidation() {
        String email = "test@toniedziala.pl";
        String password = "password";
        boolean loggedIn = loginPom.login(email, password);
        assertFalse(loggedIn);
    }

    @Test
    public void testLoginPage_CheckPositiveValidation() {
        String email = "test@kodilla.com";
        String password = "kodilla123";
        boolean loggedIn = loginPom.login(email, password);
        assertTrue(loggedIn);
    }

    @AfterEach
    public void testDown() {
        loginPom.close();
    }
}