package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.Functions.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com.tr");
        driver.manage().window().fullscreen();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"sp-cc-accept\"]")).click();
        search(driver);
        selectRandomProduct(driver);
        addCart(driver);
        goCart(driver);
        removeItem(driver);
        Thread.sleep(3000);
        driver.quit();
    }
}
