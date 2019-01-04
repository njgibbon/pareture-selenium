package com.njgibbon.test.selenium.pareture.suites;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
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
@TestMethodOrder(OrderAnnotation.class)
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

    //Hit the with no 'www' and check returns correctly
    @Test
    @Order(1)
    public void test1() throws InterruptedException
    {
        System.out.println("test 1");
        System.out.println("load pareture site without www");
        driver.get("https://pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //some validation
        assertTrue(driver.getPageSource().contains("Site"));
        assertTrue(driver.getPageSource().contains("Writing"));
        assertTrue(driver.getPageSource().contains("Code"));
        assertTrue(driver.getPageSource().contains("CV"));
        assertTrue(driver.getPageSource().contains("Social"));
    }

    //Hit the with 'www' and check returns correctly
    @Test
    @Order(2)
    public void test2() throws InterruptedException
    {
        System.out.println("test 2");
        System.out.println("load pareture site with www");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //some validation
        assertTrue(driver.getPageSource().contains("Site"));
        assertTrue(driver.getPageSource().contains("Writing"));
        assertTrue(driver.getPageSource().contains("Code"));
        assertTrue(driver.getPageSource().contains("CV"));
        assertTrue(driver.getPageSource().contains("Social"));

        //xpath to this site link
        System.out.println("click self internal link");
        driver.findElement(By.xpath("/html/body/div/main/div[2]/a")).click();
        Thread.sleep(1000);  //wait 1s

        //same validation
        assertTrue(driver.getPageSource().contains("Site"));
        assertTrue(driver.getPageSource().contains("Writing"));
        assertTrue(driver.getPageSource().contains("Code"));
        assertTrue(driver.getPageSource().contains("CV"));
        assertTrue(driver.getPageSource().contains("Social"));
    }

    //Hit the external blog link
    @Test
    @Order(3)
    public void test3() throws InterruptedException
    {
        System.out.println("test 3");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //xpath to blog link
        System.out.println("click blog external link");
        driver.findElement(By.xpath("/html/body/div/main/div[3]/a[1]")).click();
        Thread.sleep(1000);  //wait 1s

        //some validation
        //assert here
    }

    //Hit the external blog archive link
    @Test
    @Order(4)
    public void test4() throws InterruptedException
    {
        System.out.println("test 4");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //xpath to blog link
        System.out.println("click blog archive external link");
        driver.findElement(By.xpath("/html/body/div/main/div[3]/a[2]")).click();
        Thread.sleep(1000);  //wait 1s

        //some validation
        //assert here
    }

    //Hit the external github link
    @Test
    @Order(5)
    public void test5() throws InterruptedException
    {
        System.out.println("test 5");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //xpath to blog link
        System.out.println("click github external link");
        driver.findElement(By.xpath("/html/body/div/main/div[5]/a")).click();
        Thread.sleep(1000);  //wait 1s

        //some validation
        //assert here
    }

    //Hit the external linkedin link
    @Test
    @Order(6)
    public void test6() throws InterruptedException
    {
        System.out.println("test 6");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //xpath to blog link
        System.out.println("click linkedin external link");
        driver.findElement(By.xpath("/html/body/div/main/div[7]/a")).click();
        Thread.sleep(1000);  //wait 1s

        //some validation
        //assert here
    }

    //Hit the external twitter link
    @Test
    @Order(7)
    public void test7() throws InterruptedException
    {
        System.out.println("test 7");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //xpath to blog link
        System.out.println("click twitter external link");
        driver.findElement(By.xpath("/html/body/div/main/div[9]/a[1]")).click();
        Thread.sleep(1000);  //wait 1s

        //some validation
        //assert here
    }

    //Hit the external facebook link
    @Test
    @Order(8)
    public void test8() throws InterruptedException
    {
        System.out.println("test 8");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //xpath to blog link
        System.out.println("click fb external link");
        driver.findElement(By.xpath("/html/body/div/main/div[9]/a[2]")).click();
        Thread.sleep(1000);  //wait 1s

        //some validation
        //assert here
    }

    //Hit the internal resources link
    @Test
    @Order(9)
    public void test9() throws InterruptedException
    {
        System.out.println("test 9");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //xpath to blog link
        System.out.println("click resource internal link");
        driver.findElement(By.xpath("/html/body/footer/a[1]")).click();
        Thread.sleep(1000);  //wait 1s

        //some validation
        //assert here
        assertTrue(driver.getPageSource().contains("A list of the most significant material used on the site or in the creation of the site"));
    }

    //Hit the internal sitemap link
    @Test
    @Order(10)
    public void test10() throws InterruptedException
    {
        System.out.println("test 10");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(1000);  //wait 1s

        //xpath to blog link
        System.out.println("click sitemap internal link");
        driver.findElement(By.xpath("/html/body/footer/a[2]")).click();
        Thread.sleep(1000);  //wait 1s

        //some validation
        //assert here
        assertTrue(driver.getPageSource().contains("<loc>https://www.pareture.xyz/index.html</loc>"));
    }

}
