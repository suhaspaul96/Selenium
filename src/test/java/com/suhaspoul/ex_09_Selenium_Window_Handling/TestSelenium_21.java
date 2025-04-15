package com.suhaspoul.ex_09_Selenium_Window_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium_21 {

    WebDriver driver;
    @Test
    public void test_fileupload_p5() {

        driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: " + windowHandles); // [974535CFD9B87DA0B44B44CC2FFC0591, 8E6F9A52E8382019CBB64FB9E6F024EC]


        for (String handle: windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed!");
            }
            driver.switchTo().window(parent);
        }
    }

}
