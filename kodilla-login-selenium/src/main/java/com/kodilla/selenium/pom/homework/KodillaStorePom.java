package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.AbstractPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends AbstractPOM {
    @FindBy(css = "input[name=search]")
    WebElement searchField;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public int searchItem(String productName) {
        searchField.sendKeys(productName);
        List<WebElement> elements = driver.findElements(By.cssSelector("div[class=element]"));
        return elements.size();
    }
}
