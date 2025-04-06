package com.suhaspoul.ex02_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {

    WebDriver driver;

    @Test(priority = 1)
    public void verify_login() {
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        System.out.println("Title of page is: "+driver.getTitle());
    }

    @Test(priority = 2)
    public void verify_quit() {
        driver.quit();
    }
}
