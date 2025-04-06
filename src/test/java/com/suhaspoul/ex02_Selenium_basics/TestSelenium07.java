package com.suhaspoul.ex02_Selenium_basics;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07 {

    @Description
    @Test
    public void open_url(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Navigation in-between
       driver.navigate().to("https://www.google.com/");
        driver.quit();
    }

}
