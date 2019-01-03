package com.njgibbon.test.selenium.pareture.suites;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Suite to test website navigation
//Navigate through to each link on the site internal and external
//Do a quick validation to check that the page is the correct target
//Validation doesn't need to be extensive as content checking is done by other suites
//Links will also have been verified during static analysis and exploratory test phases
public class TestSuite1
{
    private static WebDriver driver;

    @BeforeAll
    private static void beforeAll()
    {
        System.out.println("before suite set up web driver");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterAll
    private static void afterAll()
    {
        System.out.println("after suite clear down the web driver");
        driver.quit();
    }

    //Hit the site and do some checks on the page
    @Test
    public void test1() throws InterruptedException
    {
        driver.get("https://www.pareture.xyz");
        Thread.sleep(5000);  //wait 5s
        assertTrue(driver.getPageSource().contains("CVhg"));
    }


}
