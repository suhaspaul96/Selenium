package com.suhaspoul.ex_09_Selenium_Window_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium_21_Practise01 {

    WebDriver driver;

    @Test
    public void test_windowHandle() throws InterruptedException {

        driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {

            driver.switchTo().window(window);
            if (driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/windows/new1")) {
                System.out.println("Link matched");
            } else {
                System.out.println("Link is not matching");
            }

        }

    }

}
