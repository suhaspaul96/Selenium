package com.suhaspoul.ex03_Selenium_Xpaths;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class TestSelenium09Practise10 {

    WebDriver driver;

    @Description("Project of xpaths, Automating amazon website")
    @Test(priority = 1)
    public void login() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void srch_phone() {

        WebElement search_box = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search_box.sendKeys("Phones");

        WebElement search_btn = driver.findElement(By.id("//input[@type='submit']"));
        search_btn.click();

    }

    @Test(priority = 3)
    public void verify_close() throws InterruptedException {

        System.out.println("Current URL: " + driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/s?k=phone&crid=1HD9IL7Z60866&sprefix=phone%2Caps%2C231&ref=nb_sb_noss_2");
        Thread.sleep(2000);
        driver.quit();
    }

}
