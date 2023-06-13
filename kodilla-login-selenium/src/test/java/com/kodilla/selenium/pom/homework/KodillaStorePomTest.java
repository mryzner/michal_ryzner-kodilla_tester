package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KodillaStorePomTest {
    KodillaStorePom storePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }
    @Test
    public void testSearchInput_NoteBook() {
        int expectedResult = storePom.searchItem("NoteBook");
        assertEquals(2, expectedResult);
        driver.close();
    }
    @Test
    public void testSearchInput_School() {
        int expectedResult = storePom.searchItem("School");
        assertEquals(1, expectedResult);
        driver.close();
    }
    @Test
    public void testSearchInput_Brand() {
        int expectedResult = storePom.searchItem("Brand");
        assertEquals(1, expectedResult);
        driver.close();
    }
    @Test
    public void testSearchInput_Business() {
        int expectedResult = storePom.searchItem("Business");
        assertEquals(0, expectedResult);
        driver.close();
    }
    @Test
    public void testSearchInput_Gaming() {
        int expectedResult = storePom.searchItem("Gaming");
        assertEquals(1, expectedResult);
        driver.close();
    }
    @Test
    public void testSearchInput_Powerful() {
        int expectedResult = storePom.searchItem("Powerful");
        assertEquals(0, expectedResult);
        driver.close();
    }
    @Test
    public void searchResultShouldNotBeCaseSensitive() {
        int result = storePom.searchItem("NoteBook");
        driver.quit();

        ChromeOptions chromeOptions2 = new ChromeOptions();
        chromeOptions2.addArguments("--remote-allow-origins=*");
        WebDriver driver2 = new ChromeDriver(chromeOptions2);
        driver2.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom storePom2 = new KodillaStorePom(driver2);

        int result2 = storePom2.searchItem("NOTEBOOK");
        assertEquals(result, result2);
        driver2.close();
    }
}