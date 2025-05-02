package com.suhaspoul.ex_10_Selenium_Screenshot;

import io.qameta.allure.Description;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestSelenium_23_Selenium {

    WebDriver driver;
    @Description
    @Test()
    public void screenshot() throws IOException, InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();

        File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Screenshot, new File("src/test/resources/Screenshot4.png"));

        Thread.sleep(2000);

        driver.quit();

    }
}
