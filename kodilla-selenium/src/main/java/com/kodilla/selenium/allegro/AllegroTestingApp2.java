package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Files\\selenium-drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement categoryCombo = driver.findElement(By.cssSelector("#gh-cat"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(9);

        WebElement searchField = driver.findElement(By.cssSelector("#gh-ac"));
        searchField.sendKeys("Mavic mini");

        WebElement submitButton = driver.findElement(By.cssSelector("#gh-btn"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#srp-river-results > ul")));

        List<WebElement> elements = driver.findElements(By.cssSelector("div > a > .s-item__title"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
    }
}
