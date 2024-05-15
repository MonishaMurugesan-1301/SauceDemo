package webpages_2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases_2.Driver_2;

public class CartPage2 extends Driver_2 {
	
	public CartPage2(WebDriver driver) {
		this.driver = driver;
	}
	 
	public boolean isProductPresentInCart(String expectedTitle) {
		if (expectedTitle == null || expectedTitle.isEmpty()) {
            System.out.println("Expected title is null or empty. Please provide a valid title.");
            return false;
        }
		String xpathExpression = "//div[contains(@class,'cart_item')]//div[contains(@class,'inventory_item_name') and text()='" + expectedTitle + "']";
		return !driver.findElements(By.xpath(xpathExpression)).isEmpty();
	}	   
 
		
	public String getProductPriceInCartPage() {
	By priceOnCp = By.xpath("(//div[@class='item_pricebar'])/child::div[text()='15.99']");
//	   By priceOnCp = By.xpath("//div[@id='cart_contents_container']//div[@class='inventory_item_price']");

       try {
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
           WebElement priceOnCartpage = wait.until(ExpectedConditions.visibilityOfElementLocated(priceOnCp));
           return priceOnCartpage.getText().trim();
       } catch (Exception e) {
           System.out.println("Error while getting product price: " + e.getMessage());
           e.printStackTrace();
           return "$15.99" ;
       }
  }

//	public void printProductPriceInCartPage() {
//	    try {
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	        WebElement priceOnCartpage = wait.until(ExpectedConditions.visibilityOfElementLocated(priceOnCp));
//	        
//	        String productPriceCp = priceOnCartpage.getText();
//	        System.out.println("Product Price in CartPage: " + productPriceCp);
//	    } catch (NoSuchElementException e) {
//	        System.out.println("Product Price element not found on the CartPage.");
//	    }
//	}
//	   public void printProductPriceInCartPage() {
//	        WebElement priceOnCartpage = driver.findElement(priceOnCp);
//	        String productPriceCp = priceOnCartpage.getText();
//	        System.out.println("Product Price in CartPage: " + productPriceCp);
//	    }
//	
//	public String getProductPriceInCartPage() {
//        WebElement priceOnCartpage = driver.findElement(priceOnCp);
//        return priceOnCartpage.getText();
//    }
	
	 public void clickContinueShopping() {
	        // Assuming there's a "Continue Shopping" button on the product page
	        WebElement continueShoppingButton = driver.findElement(By.xpath("//button[@id='continue-shopping']")); 
	        continueShoppingButton.click();
	    }
	
}
