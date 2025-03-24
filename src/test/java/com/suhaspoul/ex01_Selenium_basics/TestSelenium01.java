package com.suhaspoul.ex01_Selenium_basics;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium01 {
    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        //driver.get("https://app.vwo.com");
        driver.get("https://google.com");
        System.out.println(driver.getTitle());




    }
}
