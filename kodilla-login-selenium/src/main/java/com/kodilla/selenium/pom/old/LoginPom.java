package com.kodilla.selenium.pom.old;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
    @FindBy(css = "input[type=email]")
    WebElement emailField;

    @FindBy(css = "input[type=password]")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), \"Log in\")]")
    WebElement loginButton;

    WebDriver driver;

    public LoginPom() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR\\IdeaProjects\\kodilla-course\\kodilla-login-selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        PageFactory.initElements(driver, this);

        driver.navigate().to("https://kodilla.com/pl/test/login");
    }
    public boolean login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        String alert = driver.switchTo().alert().getText();
        String message = alert.replace(alert.charAt(5),'s');
        driver.switchTo().alert().dismiss();
        return message.equals("Jestes teraz zalogowany!");
    }
    public void close() {
        driver.close();
    }
}
