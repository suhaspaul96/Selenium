package com.suhaspoul.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08Practise01 {

    @Description("Verify error msg")
    @Test
    public void Test_Selenium08Practise01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        WebElement input_box = driver.findElement(By.id("username"));
        input_box.sendKeys("test");
        WebElement pw_input_box = driver.findElement(By.id("password"));
        pw_input_box.sendKeys("PASSWORD");
        WebElement login_btn = driver.findElement(By.id("submit"));
        login_btn.click();

        Thread.sleep(3000);

        WebElement error_msg = driver.findElement(By.id("error"));
        Assert.assertEquals(error_msg.getText(),("Your username is invalid!"));

        driver.quit();

    }

}
