package com.suhaspoul.ex02_Selenium_basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Test
    public static void main(String[] args) {
        TestSelenium03 seleniumTest = new TestSelenium03();
        seleniumTest.verify_submit();
    }

    public static void verify_submit(){

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://www.instagram.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
