package com.practice.selenium;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


/**
 * Created by thomas.le on 11/9/2016.
 */
public class SeleniumTest {

    private static WebDriver driver;

    @BeforeClass
    public static void startChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.seleniumhq.org/");
    }

    @AfterClass
    public static void closeChromeDriver() {
        driver.close();
    }

    public static boolean isPresent(By by) {
        Boolean present = driver.findElements(by).size() > 0;
        return present;

    }

    @Test
    public void downloadLinkExists() {
        assertEquals(Boolean.TRUE, isPresent(HomePage.downloadSelenium));
    }

    @Test
    public void projectsTabExists() {
        assertEquals(Boolean.TRUE, isPresent(HomePage.projectsTab));
    }

    @Test
    public void downloadTabExists() {
        assertEquals(Boolean.TRUE, isPresent(HomePage.downloadTab));
    }

    @Test
    public void documentationTabExists() {
        assertEquals(Boolean.TRUE, isPresent(HomePage.documentationTab));
    }

    @Test
    public void supportTabExists() {
        assertEquals(Boolean.TRUE, isPresent(HomePage.supportTab));
    }

    @Test
    public void aboutTabExists() {
        assertEquals(Boolean.TRUE, isPresent(HomePage.aboutTab));
    }

    @Test
    public void goToChromeDriver() throws InterruptedException {
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("chromeDriver");
        searchBar.submit();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement link = driver.findElement(By.partialLinkText("GitHub"));
        link.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        link = driver.findElement(By.linkText("Visit the full ChromeDriver site"));
        link.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        System.out.println("Final page title: " + driver.getTitle());
        assertEquals("ChromeDriver - WebDriver for Chrome", driver.getTitle());

    }
}
