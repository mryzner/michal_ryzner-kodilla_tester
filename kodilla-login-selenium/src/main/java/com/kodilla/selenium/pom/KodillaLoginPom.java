package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom extends AbstractPOM {
    @FindBy(css = "input[type=email]")
    WebElement emailField;

    @FindBy(css = "input[type=password]")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), \"Log in\")]")
    WebElement loginButton;

    public KodillaLoginPom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
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
