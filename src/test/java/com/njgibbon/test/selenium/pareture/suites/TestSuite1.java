package com.njgibbon.test.selenium.pareture.suites;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Suite to test website navigation
//Navigate through to each link on the site internal and external
//Do a quick validation to check that the page is the correct target
//Validation doesn't need to be extensive as content checking is done by other suites
//external sites will be left to manual validation whilst watching suite run
//Links will also have been verified during static analysis and exploratory test phases
//this is also to provide confidence
@TestMethodOrder(OrderAnnotation.class)
public class TestSuite1
{
    private static WebDriver driver;

    @BeforeAll
    private static void beforeAll()
    {
        System.out.println("before suite set up web driver");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
    }

    @AfterAll
    private static void afterAll()
    {
        System.out.println("after suite clear down the web driver");
        driver.quit();
    }

    //Hit site with no 'www' and check returns correctly
    //positive
    @Test
    @Order(1)
    public void test1() throws InterruptedException
    {
        System.out.println("test 1");
        System.out.println("load pareture site without www");
        driver.get("https://pareture.xyz");

        //some validation
        assertTrue(driver.getPageSource().contains("Site"));
        assertTrue(driver.getPageSource().contains("Writing"));
        assertTrue(driver.getPageSource().contains("Code"));
        assertTrue(driver.getPageSource().contains("CV"));
        assertTrue(driver.getPageSource().contains("Social"));
        Thread.sleep(2000);  //wait 2s
    }

    //Hit site with 'www' and check returns correctly
    //positive
    @Test
    @Order(2)
    public void test2() throws InterruptedException
    {
        System.out.println("test 2");
        System.out.println("load pareture site with www");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(2000);  //wait

        //some validation
        assertTrue(driver.getPageSource().contains("Site"));
        assertTrue(driver.getPageSource().contains("Writing"));
        assertTrue(driver.getPageSource().contains("Code"));
        assertTrue(driver.getPageSource().contains("CV"));
        assertTrue(driver.getPageSource().contains("Social"));

        //xpath to this site link
        System.out.println("click self internal link");
        driver.findElement(By.xpath("/html/body/div/main/div[2]/a")).click();
        Thread.sleep(2000);  //wait

        //same validation
        assertTrue(driver.getPageSource().contains("Site"));
        assertTrue(driver.getPageSource().contains("Writing"));
        assertTrue(driver.getPageSource().contains("Code"));
        assertTrue(driver.getPageSource().contains("CV"));
        assertTrue(driver.getPageSource().contains("Social"));
    }

    //Hit the external blog link
    //positive
    @Test
    @Order(3)
    public void test3() throws InterruptedException
    {
        System.out.println("test 3");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(2000);  //wait

        //xpath to blog link
        System.out.println("click blog external link");
        driver.findElement(By.xpath("/html/body/div/main/div[3]/a[1]")).click();
        Thread.sleep(2000);  //wait
    }

    //Hit the external blog archive link
    //positive
    @Test
    @Order(4)
    public void test4() throws InterruptedException
    {
        System.out.println("test 4");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(2000);  //wait

        //xpath to blog link
        System.out.println("click blog archive external link");
        driver.findElement(By.xpath("/html/body/div/main/div[3]/a[2]")).click();
        Thread.sleep(2000);  //wait
    }

    //Hit the external github link
    //positive
    @Test
    @Order(5)
    public void test5() throws InterruptedException
    {
        System.out.println("test 5");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(2000);  //wait

        //xpath to blog link
        System.out.println("click github external link");
        driver.findElement(By.xpath("/html/body/div/main/div[5]/a")).click();
        Thread.sleep(2000);  //wait
    }

    //Hit the external linkedin link
    //positive
    @Test
    @Order(6)
    public void test6() throws InterruptedException
    {
        System.out.println("test 6");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(2000);  //wait

        //xpath to blog link
        System.out.println("click linkedin external link");
        driver.findElement(By.xpath("/html/body/div/main/div[7]/a")).click();
        Thread.sleep(2000);  //wait
    }

    //Hit the external twitter link
    //positive
    @Test
    @Order(7)
    public void test7() throws InterruptedException
    {
        System.out.println("test 7");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(2000);  //wait

        //xpath to blog link
        System.out.println("click twitter external link");
        driver.findElement(By.xpath("/html/body/div/main/div[9]/a[1]")).click();
        Thread.sleep(2000);  //wait
    }

    //Hit the external facebook link
    //positive
    @Test
    @Order(8)
    public void test8() throws InterruptedException
    {
        System.out.println("test 8");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(2000);  //wait

        //xpath to blog link
        System.out.println("click fb external link");
        driver.findElement(By.xpath("/html/body/div/main/div[9]/a[2]")).click();
        Thread.sleep(2000);  //wait
    }

    //Hit the internal resources link
    //positive
    @Test
    @Order(9)
    public void test9() throws InterruptedException
    {
        System.out.println("test 9");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(2000);  //wait

        //xpath to blog link
        System.out.println("click resource internal link");
        driver.findElement(By.xpath("/html/body/footer/a[1]")).click();
        Thread.sleep(2000);  //wait

        //assert here
        assertTrue(driver.getPageSource().contains("A list of the most significant material used on the site or in the creation of the site"));
    }

    //Hit the internal sitemap link
    //positive
    @Test
    @Order(10)
    public void test10() throws InterruptedException
    {
        System.out.println("test 10");
        System.out.println("load pareture site with www as starting point");
        driver.get("https://www.pareture.xyz");
        Thread.sleep(2000);  //wait

        //xpath to blog link
        System.out.println("click sitemap internal link");
        driver.findElement(By.xpath("/html/body/footer/a[2]")).click();
        Thread.sleep(2000);  //wait

        //assert here
        assertTrue(driver.getPageSource().contains("<loc>https://www.pareture.xyz/index.html</loc>"));
        assertTrue(driver.getPageSource().contains("<loc>https://www.pareture.xyz/resources.txt</loc>"));
        assertTrue(driver.getPageSource().contains("<loc>https://www.pareture.xyz/json/pareture.json</loc>"));
    }

    //----------------------
    //Here are also pages that I would like to be accessible for various reasons
    //but are not navigatable to from the main SPA -  only directly

    //Hit the internal robots.txt link directly
    //positive
    @Test
    @Order(11)
    public void test11() throws InterruptedException
    {
        System.out.println("test 11");
        System.out.println("go to robots.txt");
        driver.get("https://www.pareture.xyz/robots.txt");
        Thread.sleep(2000);  //wait
        assertTrue(driver.getPageSource().contains("Disallow:"));
    }

    //Hit the internal humans.txt link directly
    //positive
    @Test
    @Order(12)
    public void test12() throws InterruptedException
    {
        System.out.println("test 12");
        System.out.println("go to humans.txt");
        driver.get("https://www.pareture.xyz/humans.txt");
        Thread.sleep(2000);  //wait
        assertTrue(driver.getPageSource().contains("We are such stuff as dreams are made on."));

    }

    //Hit the internal humans.txt link directly
    //positive
    @Test
    @Order(13)
    public void test13() throws InterruptedException
    {
        System.out.println("test 13");
        System.out.println("go to pareture.json");
        driver.get("https://www.pareture.xyz/json/pareture.json");
        Thread.sleep(2000);  //wait
    }

    //negative tests

    //Hit a page with http not https and receive error
    //negative
    @Test
    @Order(14)
    public void test14() throws InterruptedException
    {
        System.out.println("test 14");
        System.out.println("go to http");
        driver.get("http://www.pareture.xyz");
        Thread.sleep(2000);  //wait
        assertTrue(driver.getPageSource().contains("403 ERROR"));
    }

    //Hit a page with https but an invalid path and receive error
    //negative
    @Test
    @Order(15)
    public void test15() throws InterruptedException
    {
        System.out.println("test 15");
        System.out.println("go to invalid endpoint");
        driver.get("https://www.pareture.xyz/potato");
        Thread.sleep(2000);  //wait
        assertTrue(driver.getPageSource().contains("<Code>AccessDenied</Code>"));
    }

}
