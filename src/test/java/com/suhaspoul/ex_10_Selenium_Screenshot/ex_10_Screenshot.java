package com.suhaspoul.ex_10_Selenium_Screenshot;

import io.qameta.allure.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ex_10_Screenshot {

    WebDriver driver;

    @Description("Verifying taking screenshot")
    @Test()

    public void screenshot() throws IOException, InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://instagram.com");
        driver.manage().window().maximize();

        /*File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("src/test/resources/Screenshot2.png"));*/

        //File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(screenshot,new File("src/test/resources/Screenshot3.png"));

        Thread.sleep(2000);

        File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Screenshot, new File("src/test/resources/Screenshot3.png"));

        driver.quit();
    }

}
