package com.suhaspoul.ex01_Selenium_basics;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestSelenium01 {

    @Test
    public void verify_login(){

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("autofocus")).sendKeys("Cars");
        driver.findElement(By.name("btnK")).click();
        System.out.println(driver.getSessionId());
        System.out.println(driver.getTitle());
        driver.quit();


    }

}
