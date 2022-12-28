package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Functions {
    public static void search(WebDriver driver) {
        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchBar.sendKeys("Bilgisayar");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
    }

    public static void selectRandomProduct(WebDriver driver) {
        // Ürünlerin listesi
        List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        // Rastgele bir ürün seçin
        Random random = new Random();
        int index = random.nextInt(products.size()-5);
        WebElement product = products.get(index+5);

        // Ürüne tıklayın
        product.click();
    }
    public static void addCart(WebDriver driver){
        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();
    }
    public static void goCart(WebDriver driver){
        WebElement goCart = driver.findElement(By.cssSelector("#nav-cart"));
        goCart.click();
    }
    public static void removeItem(WebDriver driver){
        WebElement removeItem = driver.findElement(By.xpath("//input[@data-action=\"delete\"]"));
        removeItem.click();
    }

}
