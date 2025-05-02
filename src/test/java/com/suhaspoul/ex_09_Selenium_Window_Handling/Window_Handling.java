package com.suhaspoul.ex_09_Selenium_Window_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Window_Handling {

    WebDriver driver;
    @Test()
    public void windowhandles() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parenthandle = driver.getWindowHandle();
        System.out.println("current window handle: "+parenthandle);
        Set<String> handles = driver.getWindowHandles();

        for(String handle: handles){
            System.out.println(handle);
        }

        WebElement Button1 = driver.findElement(By.id("newWindowBtn"));
        Button1.click();

        Thread.sleep(2000);

        driver.close();
        driver.quit();


    }

}
