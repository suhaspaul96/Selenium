package com.suhaspoul.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium08{

    @Description("Verify error message")
    @Test
    public void verify_error_msg(){

            WebDriver driver = new ChromeDriver();
            driver.get("https://app.vwo.com");
            driver.manage().window().maximize();

            WebElement emailInputBox = driver.findElement(By.id("login-username"));
            emailInputBox.sendKeys("abc");
            WebElement passwordInputBox = driver.findElement(By.id("login-password"));
            passwordInputBox.sendKeys("<PASSWORD>");
            WebElement loginButton = driver.findElement(By.id("js-login-btn"));
            loginButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
//      Assert.assertTrue(error_msg.isDisplayed());
        Assert.assertEquals(error_msg.getText(),("Your email, password, IP address or location did not match"));


        driver.quit();

        }

    }

