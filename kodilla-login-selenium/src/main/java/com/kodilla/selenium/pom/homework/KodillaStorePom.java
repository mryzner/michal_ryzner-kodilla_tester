package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.AbstractPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStorePom extends AbstractPOM {
    @FindBy(css = "input[name=search]")
    WebElement searchField;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public int searchItem(String productName) {
        searchField.sendKeys(productName);
        searchField.submit();
        WebElement item = driver.findElement(By.cssSelector("div[class=element]"));
        /*List<WebElement> elements = driver.findElements(By.cssSelector("div[class=element]"));
        return elements.size();*/
        return 0;
    }
}
