package com.suhaspoul.ex01_Selenium_basics;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSelenium01 {

    public void verify_login(){

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();


    }

}
