package testCases_3;

import org.testng.Assert;
import org.testng.annotations.Test;

import webpages_3.CartPage3;
import webpages_3.HomePage3;



public class CartPage_Test3 extends HomePage_Test3 {
	
	
	@Test(dependsOnMethods = "addProductToCartTest")
    public void testAddToCartAndRemoveProduct() throws InterruptedException {
		CartPage3 cp3 = new CartPage3(driver);
		HomePage3 hp3 = new HomePage3(driver);

		cp3.cartIconElement();
		
		String product_1InCartPage = "Sauce Labs Bolt T-Shirt";

        boolean isProduct1Present = cp3.isProductPresentInCart(product_1InCartPage);
        System.out.println("Expected Title: " + product_1InCartPage);
        System.out.println("Is Product Present in Cart: " + isProduct1Present);

        Assert.assertTrue(isProduct1Present, "Selected item is not present in the cart.");
	
        String product_2InCartPage = "Sauce Labs Backpack";

        boolean isProduct2Present = cp3.isProductPresentInCart(product_2InCartPage);
        System.out.println("Expected Title: " + product_2InCartPage);
        System.out.println("Is Product Present in Cart: " + isProduct2Present);

      
        cp3.clickRemoveButtonForProduct2();
        Thread.sleep(2000);
        
        boolean isProduct2removedInCart = cp3.isProduct2removedInCart();
        System.out.println("Is Product 2 Removed in Cart: " + isProduct2removedInCart);
        
	}
}
