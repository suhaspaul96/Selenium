package com.suhaspoul.ex_09_Selenium_Window_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium_22 {

    WebDriver driver;

    @Test
    public void window_handles() {
        driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowhandles = driver.getWindowHandles();
        for (String window : windowhandles) {

            if (!window.equals(parent)) {
                driver.switchTo().window(window);
            }
            String url = driver.getCurrentUrl();
            System.out.println("current window url: " + url);

            /*if (url.equals("https://the-internet.herokuapp.com/windows/new")) {
                System.out.println("Link matched");
            } else {
                System.out.println("Link not matching");
            }*/

        }
        driver.quit();

    }
}
