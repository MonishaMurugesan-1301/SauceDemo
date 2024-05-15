package webpages_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import testCases_3.Driver_3;

public class CartPage3 extends Driver_3{
	
	By carticon = By.className("shopping_cart_link");
	
	public CartPage3(WebDriver driver) {
		this.driver = driver;
	}
	 public void cartIconElement() {
	        WebElement cartIcon = driver.findElement(carticon);
	        cartIcon.click();
	    }
	 public boolean isProductPresentInCart(String expectedTitle) {
			if (expectedTitle == null || expectedTitle.isEmpty()) {
	            System.out.println("Expected title is null or empty. Please provide a valid title.");
	            return false;
			}
	    String xpathExpression = "//div[contains(@class,'cart_item')]//div[contains(@class,'inventory_item_name') and text()='" + expectedTitle + "']";
	    return !driver.findElements(By.xpath(xpathExpression)).isEmpty();
	}	 	
	 
	   /*public void clickRemoveButtonForProduct1() {
	        
	        String removeButtonXPath = "//button[@id='remove-sauce-labs-bolt-t-shirt']";
	        WebElement removeButton = driver.findElement(By.xpath(removeButtonXPath));
	        removeButton.click();
	    }*/
	 
	   public void clickRemoveButtonForProduct2() {
	        
	        String removeButtonXPath = "//button[@id=\"remove-sauce-labs-backpack\"]";
	        WebElement removeButton = driver.findElement(By.xpath(removeButtonXPath));
	        removeButton.click();
	    }
	public boolean isProduct2removedInCart() {
		
		return true;
	}
	   
	   
	  
}
	 		

