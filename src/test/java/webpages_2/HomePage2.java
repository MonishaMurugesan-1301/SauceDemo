package webpages_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases_2.Driver_2;

public class HomePage2 extends Driver_2{
	
	 private  final By thirdprdt = By.xpath("//div[@id=\"inventory_container\"]/div/div[3]");
	 private  final By addToCartBtn = By.xpath("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	 private  final By carticon = By.className("shopping_cart_link");
	 By priceOnHp = By.xpath("(//div[@class='pricebar'])[3]/child::div");
	 By elementOnHomePage = By.xpath("//div[@class='header_label']/child::div");
	 
	public HomePage2(WebDriver driver) {            
	        this.driver = driver;
	    } 
	 
	 public void navigateToThirdProduct() {
		 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        WebElement thirdProduct = driver.findElement(thirdprdt);
	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", thirdProduct);
	 }
	 
	
	 public String getProductPriceOnHomePage() {
		 try{
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement priceOnHomepage = wait.until(ExpectedConditions.visibilityOfElementLocated(priceOnHp));
	            return priceOnHomepage.getText();
	        } 
		 catch (org.openqa.selenium.TimeoutException e) {
	            System.out.println("Product Price in Homepage:" + priceOnHp.toString());
	            
	            return ""; 
	        }
		 catch (org.openqa.selenium.NoSuchElementException e) {
           System.out.println("Element not found: " + priceOnHp.toString());
	            
           return ""; 
	        }
	    }
	
	 public void printProductPriceInHomePage() {
		        WebElement priceOnHomepage = driver.findElement(priceOnHp);
		        String productPrice = priceOnHomepage.getText();
		        System.out.println("Product Price in HomePage: " + productPrice);
		    }
	        	 
	 public void clickAddToCart() {
        WebElement addToCartButton = driver.findElement(addToCartBtn);
        addToCartButton.click();
    }

    public void cartIconElement() {
        WebElement cartIcon = driver.findElement(carticon);
        cartIcon.click();
    }
   
    
    public void waitForHomePageToLoad() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementOnHomePage));
    }	
	
    public boolean isOnHomePage() {
    	String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";
        return driver.getCurrentUrl().equals(expectedHomePageUrl); 
    }
	
}
