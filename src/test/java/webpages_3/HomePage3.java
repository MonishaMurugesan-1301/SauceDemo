package webpages_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testCases_3.Driver_3;


public class HomePage3 extends Driver_3{
	
	  By thirdprdt = By.xpath("//div[@id=\"inventory_container\"]/div/div[3]");
	  By addToCartBtn = By.xpath("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	  By carticon = By.className("shopping_cart_link");
	 // By firstprdt = By.xpath("(//div[@id=\"inventory_container\"]//div[@class='inventory_item'])[1]");
	  By addCartBtn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	  
	public HomePage3(WebDriver driver) {            
	        this.driver = driver;
	    } 
	 
	 public void navigateToThirdProduct() {
		 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        WebElement thirdProduct = driver.findElement(thirdprdt);
	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", thirdProduct);
	 }
	 
	 
	 public void clickAddToCart_3() {
        WebElement addToCartButton = driver.findElement(addToCartBtn);
        addToCartButton.click();
    }

	 public void navigateToProduct_1() {
	       
	        String productXPath = "(//div[@class='inventory_item'])[1]"; 
	        WebElement productElement = driver.findElement(By.xpath(productXPath));
	        productElement.click();
	    }
	 public void clickAddToCart_1() {
	        WebElement addCartButton = driver.findElement(addCartBtn);
	        addCartButton.click();
	    }

			        
}

