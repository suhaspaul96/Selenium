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

public class TestSelenium_ImplicitWait {

    @Description("Verifying implicit wait by example")
    @Test
    public void implicit_wait(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");


        // 1. Define Fluent Wait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))  // Total wait time
                .pollingEvery(Duration.ofSeconds(2))  // Check interval
                .ignoring(NoSuchElementException.class); // Exceptions to ignore

        WebElement myElement = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("submit"));
            }
        });
        myElement.click();

        driver.quit();

    }}
