package testCases_4;

import org.testng.annotations.Test;

import webpages_4.CartPage4;

public class CartPage_Test4 extends HomePage_Test4{
	
	@Test(dependsOnMethods = "testAddMultipleProductsAndAddToCart")
	public void checkout() throws InterruptedException {
		CartPage4 cp4 = new CartPage4(driver);
		cp4.clickOnCheckout();
		Thread.sleep(2000);
	}
}
	
	