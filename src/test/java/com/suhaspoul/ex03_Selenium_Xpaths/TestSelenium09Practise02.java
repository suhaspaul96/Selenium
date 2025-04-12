package com.suhaspoul.ex03_Selenium_Xpaths;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09Practise02 {

    WebDriver driver;

    @Description("Project of xpaths, Automating amazon website")
    @Test(priority = 1)
    public void login() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

    }
        @Test(priority = 2)
        public void srch_phone() throws InterruptedException {

        WebElement search_box = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
        search_box.sendKeys("Phones");

        WebElement search_btn = driver.findElement(By.xpath("//button[@type='submit']"));
        search_btn.click();

        }

        @Test(priority = 3)
        public void verify_close()throws InterruptedException {

        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Assert.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/search?q=Phones&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
        //Thread.sleep(2000);
        driver.quit();
    }
}

