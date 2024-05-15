package testCases_4;

import org.testng.Assert;
import org.testng.annotations.Test;

import webpages_4.HomePage4;
	
public class HomePage_Test4 extends Login_Test4 {

	    @Test(dependsOnMethods = "loginTest4")
	    public void testSortingByPriceLowToHigh() throws InterruptedException {
	        HomePage4 hp4 = new HomePage4(driver);
	        hp4.clickFilterIcon();
	        Thread.sleep(2000);
	        
	        hp4.selectSortingOption("Price (Low to High)");
	        Thread.sleep(2000);
 
	        boolean isSortedByPrice = hp4.areProductsSortedByPriceLowToHigh();
	        System.out.println("Products are sorted by price low to high: " + isSortedByPrice);
	        Assert.assertTrue(isSortedByPrice, "Products are not sorted by price low to high.");
	    }
	    
	        @Test(dependsOnMethods = "testSortingByPriceLowToHigh")
	        public void testAddMultipleProductsAndAddToCart() throws InterruptedException {
	        	 HomePage4 hp4 = new HomePage4(driver);
	            
	            hp4.addMultipleProductsToCart(4);
	            Thread.sleep(4000);
	         
	            hp4.cartIconElement();
	            Thread.sleep(4000);
  
	    }
}

