package com.suhaspoul.ex_06_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class TestSelenium_16_FluentW_LambdaE {

    @Description("Verifying implicit wait by example")
    @Test
    public void implicitW_LambdaE() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");

        // Define Fluent Wait using Lambda Expression
        WebElement myElement = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))                  // Total wait time
                .pollingEvery(Duration.ofSeconds(2))                  // Polling interval
                .ignoring(NoSuchElementException.class)               // Ignore if not found
                .until(s -> s.findElement(By.id("submit")));          // Lambda: find and return element

        myElement.click();
        driver.quit();

    }
}
