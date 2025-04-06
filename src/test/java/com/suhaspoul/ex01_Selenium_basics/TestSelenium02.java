package com.suhaspoul.ex01_Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {

    WebDriver driver;

    @Test(priority = 1)
    public void verify_login(){

        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
         driver.quit();


    }
    @Test(priority = 2)
    public void verify_submit(){

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        System.out.println(driver.getTitle());
        //driver.quit();

    }
    @Test(priority = 3)
    public void verify_logout(){
        driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).click();
    }

}
