package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Files\\selenium-drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(9);

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchField.sendKeys("Mavic mini");

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        submitButton.click();
    }
}
