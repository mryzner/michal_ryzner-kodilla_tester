package com.kodilla.selenium.pom.old;

public class LoginPomApplication {
    public static void main(String[] args) {
        LoginPom loginPom = new LoginPom();
        loginPom.login("test@kodilla.com", "kodilla123");
        loginPom.close();
    }
}
