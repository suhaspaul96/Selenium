package com.suhaspoul.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium06 {

    @Description("Open the URL and check the content presence or not")
    @Test
    public void Test_Selenium06(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("CURA Healthcare Service")){

            System.out.println("CURA Healthcare Service");
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }

        driver.quit();


    }
}
