package com.suhaspoul.ex_08_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_20_Practise02 {

    WebDriver driver;

    @Description("Verify the webtable printing")
    @Test()

    public void WebTable() {

        driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.id("countries"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        System.out.println("no of rows: "+rows.size());

        for( WebElement row : rows){

            List<WebElement> cols = row.findElements(By.tagName("td"));

            for(WebElement col:cols){
                System.out.println(col.getText());
            }
        }

        driver.quit();
    }


}
