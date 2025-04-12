package com.suhaspoul.ex_06_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium {

    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"

    @Test
    public void wait_test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("admin");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement error_msg = driver.findElement(By.xpath("//div[@class='notification-box-description']"));

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        driver.quit();

    }

}
