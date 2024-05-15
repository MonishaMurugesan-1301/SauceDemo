package testCases_5;

import org.testng.Assert;
import org.testng.annotations.Test;

import webpages_5.CartPage_5;


public class CartPage_Test5 extends HomePage_Test5{

	
	 @Test(dependsOnMethods = "testCartIconWithProductCount")
     public void testResetAppStateAndLogout() throws InterruptedException {
         CartPage_5 cp5 = new CartPage_5(driver);

         cp5.clickOpenMenuButton();
         Thread.sleep(3000);

         cp5.clickResetAppStateButton();
         Thread.sleep(2000);
         
         cp5.getProductCount();
         Thread.sleep(2000);
         
         cp5.cartIconElement1();
         Thread.sleep(2000);
         
        boolean isCartEmpty = cp5.isCartEmpty();
        System.out.println("Is Cart Empty: " + isCartEmpty);
        
        String getProductCount = cp5.getProductCount2();
        System.out.println("No. of products in cart:" + getProductCount);
       
        cp5.getProductCount2();
        Thread.sleep(2000);

         Assert.assertTrue(isCartEmpty, "Cart is not empty after resetting app state.");
         cp5.clickOpenMenuButton1();
         Thread.sleep(2000);

         cp5.clickLogoutLink();
         Thread.sleep(2000);
     }
 }


