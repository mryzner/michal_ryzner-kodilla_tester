package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaPomApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR\\IdeaProjects\\kodilla-course\\kodilla-login-selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/login");
        KodillaLoginPom loginPom = new KodillaLoginPom(driver);
        loginPom.login("test@kodilla.com", "kodilla123");
        loginPom.close();
        //driver.close();
    }
}
