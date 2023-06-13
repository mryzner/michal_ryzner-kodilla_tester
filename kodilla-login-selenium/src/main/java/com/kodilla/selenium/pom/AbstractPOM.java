package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPOM {
    protected WebDriver driver;

    public AbstractPOM(WebDriver driver) {
        this.driver = driver;
    }
}
