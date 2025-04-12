package com.suhaspoul.ex04_Selenium_Xpath_Functions;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium10 {

    @Description("Verify and test all the Xpath functions available there")
    @Test()
    public void Xpath_Functions() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        driver.manage().window().maximize();

        //contains()
        WebElement make_apt_btn = driver.findElement(By.xpath("//a[contains(@id,'btn-make-appointment')]"));
        make_apt_btn.click();

        Thread.sleep(2000);

        //starts-with()
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'txt-username')]"));
        username.sendKeys("John Doe");

        //Multiple element at same xpath - fetched 2nd one
        WebElement password = driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]"));
        password.sendKeys("ThisIsNotAPassword");

        //
        WebElement login_btn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_btn.click();

        Thread.sleep(1000);
        driver.quit();

    }
}
