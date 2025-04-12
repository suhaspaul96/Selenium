package com.suhaspoul.ex_07_Input_Select_Alerts_Radio_Checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_17 {

    WebDriver driver;
    @Description("Verifying inputs, selects, alerts, radio, checkbox")
    @Test(priority = 1)
    public void Input_Checkbox_Radio() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.manage().window().maximize();

        WebElement radio_btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        radio_btn.click();

        WebElement button_first = driver.findElement(By.id("buttoncheck"));
        button_first.click();

        WebElement msg = driver.findElement(By.xpath("//p[@class='text-gray-900 text-size-15 my-10 text-black radiobutton']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(msg.getText(),"Radio button 'Male' is checked");

    }
    @Test(priority = 2)
    public void Second_validation() throws InterruptedException {

        WebElement second_male_btn = driver.findElement(By.xpath("(//input[@type='radio'])[6]"));
        second_male_btn.click();

        WebElement age_btn = driver.findElement(By.xpath("(//input[@name='ageGroup'])[3]"));
        age_btn.click();

        WebElement get_value_btn = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        get_value_btn.click();

        WebElement msg2 = driver.findElement(By.xpath("//div[@class='w-4/12 smtablet:w-full rigth-input']"));

        Assert.assertEquals(msg2.getText(),"Gender : Male\nAge : 15 - 50");


        Thread.sleep(2000);
        driver.quit();
    }
}
