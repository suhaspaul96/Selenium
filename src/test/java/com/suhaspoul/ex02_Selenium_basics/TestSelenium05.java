package com.suhaspoul.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSelenium05 {

    @Description("This is for testing assert")
    @Test
    public void Test_Selenium05(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");
        //assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");
        driver.quit();
    }
}
