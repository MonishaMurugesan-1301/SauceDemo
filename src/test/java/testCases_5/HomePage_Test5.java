package testCases_5;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import webpages_5.HomePage_5;



public class HomePage_Test5 extends Login_Test5{
	
	@Test(dependsOnMethods = "loginTest5")
    public void testSortingByNameZtoA() throws InterruptedException {
        HomePage_5 hp5 = new HomePage_5(driver);
        
        hp5.clickFilterIcon();
        Thread.sleep(2000);
        
        hp5.selectSortingOptionByNameZtoA();
        Thread.sleep(2000);

        boolean areProductsSortedFromZtoA = hp5.areProductsSortedFromNameZtoA();
        System.out.println("Products are sorted from Name ZtoA: " + areProductsSortedFromZtoA);
        Assert.assertTrue(areProductsSortedFromZtoA, "Products are not sorted by Name Z to A");
    }
    
        @Test(dependsOnMethods = "testSortingByNameZtoA")
        public void testAddMultipleProductsAndAddToCart() throws InterruptedException {
        	 HomePage_5 hp5 = new HomePage_5(driver);
            
            hp5.addMultipleProductsToCart(4);
            Thread.sleep(4000);
        }
        @Test(dependsOnMethods = "testAddMultipleProductsAndAddToCart")
            public void testCartIconWithProductCount() throws InterruptedException {
        	HomePage_5 hp5 = new HomePage_5(driver);
        	
            hp5.cartIconElement();
            Thread.sleep(3000);
    		
            boolean isCartIconDisplayedWithProductCount = hp5.isCartIconDisplayedWithProductCount();
            System.out.println("Is Products in cart:" + isCartIconDisplayedWithProductCount);
           
            String productCount = hp5.getProductCount();
            System.out.println("Number of Products in cart: " + productCount);
           
    		//Assert.assertTrue(isCartIconDisplayedWithProductCount, "Cart icon is not displayed with the correct product count.");
    	}
}
       
    	
                      

