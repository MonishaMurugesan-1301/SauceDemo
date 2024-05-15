package testCases_1;

import org.testng.Assert;
import org.testng.annotations.Test;

import webpages_1.CartPage;

public class CartPage_Test extends HomePage_Test {
	
	@Test(dependsOnMethods = "addProductToCartTest")
    public void testProductInCart() {
		CartPage cp = new CartPage(driver);
		   	         
        String productTitleOnCartPage = "Test.allTheThings() T-Shirt (Red)";

        // Validate whether the selected item is present in the cart
        boolean isProductPresent = cp.isProductPresentInCart(productTitleOnCartPage);
        System.out.println("Expected Title: " + productTitleOnCartPage);
        System.out.println("Is Product Present in Cart: " + isProductPresent);

        Assert.assertTrue(isProductPresent, "Selected item is not present in the cart.");

        String actualTitleInCart = cp.getProductTitleInCart();
        System.out.println("Actual Title in Cart: " + actualTitleInCart);
        Assert.assertEquals(actualTitleInCart, productTitleOnCartPage);
              //  "Product title in cart is not the same as expected.");
        System.out.println("Product title in cart is the same as expected.");
        // Validate that the title of the product is the same as in the home page  		
	}
	
	

}

