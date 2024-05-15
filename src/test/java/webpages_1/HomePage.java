package webpages_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testCases_1.Driver;

public class HomePage extends Driver {
    static WebDriver driver;
    
    By lstPrdt = By.xpath("//div[@id=\"inventory_container\"]/div/div[6]/div[2]");
    By addToCartBtn = By.xpath("//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
    By carticon = By.className("shopping_cart_link");
     
    public HomePage(WebDriver driver) {
        this.driver = driver;
    } 
    
    public void navigateToLastProduct() {
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement lastProduct = driver.findElement(lstPrdt);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", lastProduct);
        
    }
    //User should be able to navigate to last product

    public void clickAddToCart() {
        WebElement addToCartButton = driver.findElement(addToCartBtn);
        addToCartButton.click();
    }
    //User should be able to add last product to the cart.


    public void clickCartIcon() {
        WebElement cartIcon = driver.findElement(carticon);
        cartIcon.click();
    }
    //User should be displayed with cart page.


   
   
}
