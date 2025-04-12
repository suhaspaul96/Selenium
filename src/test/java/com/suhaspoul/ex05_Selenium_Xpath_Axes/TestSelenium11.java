package com.suhaspoul.ex05_Selenium_Xpath_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium11 {

    //Practising Xpath axes

    @Test
    public void xpath_axes(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("admin@admin.com");

        //Xpath axes - child node
        WebElement password = driver.findElement(By.xpath("//li[@data-qa='rubehixixu']/child::input"));
        password.sendKeys("admin");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement error_msg = driver.findElement(By.xpath("//div[@class='notification-box-description']"));

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));
        //driver.quit();

    }
}
