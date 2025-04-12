package com.suhaspoul.ex03_Selenium_Xpaths;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09 {

    //Automate the websites - https://katalon-demo-cura.herokuapp.com/profile.php#login

    @Description("Verify current URL")
    @Test
    public void verify_url() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        driver.manage().window().maximize();

        WebElement make_apt_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_apt_btn.click();

        WebElement username_input = driver.findElement(By.xpath("//input[@id='txt-username']"));
        username_input.sendKeys("John Doe");

        WebElement paswwrod_input = driver.findElement(By.xpath("//input[@id='txt-password']"));
        paswwrod_input.sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_btn.click();

        Thread.sleep(300);

        System.out.println("Current URL: " + driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();
    }
}
