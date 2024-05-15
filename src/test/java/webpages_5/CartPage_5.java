package webpages_5;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases_5.Driver_5;

public class CartPage_5 extends Driver_5{
	WebDriver driver;
	
	By openMenuButton = By.xpath("//button[@id='react-burger-menu-btn']");
    By resetAppStateButton = By.xpath("//a[@id='reset_sidebar_link']");
    By cartIcon = By.xpath("(//div[@id='shopping_cart_container'])/child::a");
    By emptycartnumber = By.xpath("(//div[@id=\"shopping_cart_container\"])/child::a");
    By openMenuButton1 = By.xpath("//a[@id='reset_sidebar_link']");
    By logoutLink = By.xpath("//a[@id='logout_sidebar_link']");
	
	
    public CartPage_5(WebDriver driver) {
    	this.driver = driver;
    }
	 public void clickOpenMenuButton() {
	       WebElement Menubtn = driver.findElement(openMenuButton);
	       Menubtn.click();
	    }

	    public void clickResetAppStateButton() {
	        WebElement Resetappstate = driver.findElement(resetAppStateButton);
	        Resetappstate.click();
	    
	    }

	    public String getProductCount() {
			 WebElement CartNumber = driver.findElement(emptycartnumber);
			 return CartNumber.getText();
		 }
	    

	    public void cartIconElement1() {
			WebElement CartIconbtn = driver.findElement(cartIcon);
			CartIconbtn.click();	
		}
	    
	    public boolean isCartEmpty() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        boolean cartNumberElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emptycartnumber)) != null;

	        return cartNumberElement;
	        //return cartNumberElement.isDisplayed() && cartNumberElement.equals("0");
	     
	    }
	    public String getProductCount2() {
			 WebElement cartNumberElement = driver.findElement(emptycartnumber);
			 return cartNumberElement.getText();
		 }
	    public void clickOpenMenuButton1() {
		       WebElement Menubtn1 = driver.findElement(openMenuButton1);
		       Menubtn1.click();
		    }
	   
	    public void clickLogoutLink() {
	        WebElement Logout = driver.findElement(logoutLink);
	        Logout.click();
	    }
}
