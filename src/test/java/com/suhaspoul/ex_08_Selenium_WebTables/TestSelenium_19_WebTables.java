package com.suhaspoul.ex_08_Selenium_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_19_WebTables {

    WebDriver driver;
    @Description("Verifying Webtables content")
    @Test(priority = 1)
    public void WebTable(){

        driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();
    }
    @Test(priority = 2)
    public void webcontent(){

        WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        System.out.println("No of rows: "+rows.size());

        for(WebElement row : rows){

        List<WebElement> cols = row.findElements(By.tagName("td"));
        for(WebElement col : cols){

            System.out.println(col.getText());

        }
            System.out.println();

        }
    }

    @Test(priority = 3)
    public void teardown(){

        driver.close();
        driver.quit();
    }

}
