package com.suhaspoul.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium06Practise01 {

    @Description("Check if the content is present or not")
    @Test
    public void Test_ContentPresent() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("Facebook helps you connect and share with the people in your life.")) {

            //System.out.println("Facebook helps you connect and share with the people in your life.");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        driver.quit();

    }
}
