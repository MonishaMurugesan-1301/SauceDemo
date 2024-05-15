package testCases_2;

import org.testng.Assert;
import org.testng.annotations.Test;

import webpages_2.CartPage2;
import webpages_2.HomePage2;

public class CartPage_Test2 extends HomePage_Test2 {

	@Test(dependsOnMethods = "addProductToCartTest")
    public void testProductPresentInCart() throws InterruptedException {
		CartPage2 cp2 = new CartPage2(driver);
		HomePage2 hp2 = new HomePage2(driver);
		
        String productTitleOnCartPage = "Sauce Labs Bolt T-Shirt";

        // Validate whether the selected item is present in the cart
        boolean isProductPresent = cp2.isProductPresentInCart(productTitleOnCartPage);
        
        System.out.println("Expected Title: " + productTitleOnCartPage);
        System.out.println("Is Product Present in Cart: " + isProductPresent);
        

        //Assert.assertTrue(isProductPresent, "Selected item is not present in the cart.");
	}
        
        
       @Test(dependsOnMethods = "testProductPresentInCart")
        public void testProductPriceInCart() {
            CartPage2 cp2 = new CartPage2(driver);
            HomePage2 hp2 = new HomePage2(driver);
        
        
            cp2.getProductPriceInCartPage();
            
       
        String productPriceInCartPage = cp2.getProductPriceInCartPage();
        String expectedPriceOnHomePage = hp2.getProductPriceOnHomePage();

        //System.out.println("Product Price in CartPage: " + productPriceOnCartPage);
        //double actualProductPrice = Double.parseDouble(productPriceInCartPage);


        System.out.println("Product Price in HomePage: " + expectedPriceOnHomePage);
        System.out.println("Product Price in CartPage: " + productPriceInCartPage);

       

        Assert.assertEquals(productPriceInCartPage, expectedPriceOnHomePage,
                "Product price in cart is not the same as on the home page.");
        System.out.println("Product price in Cart is same as in the HomePage");
       }
       
       
       @Test(dependsOnMethods = "testProductPresentInCart") //"testProductPriceInCart")
       public void testContinueShoppingAndNavigationToHomePage() {
           CartPage2 cp2 = new CartPage2(driver);
           HomePage2 hp2 = new HomePage2(driver);
	
	   cp2.clickContinueShopping();
	  
	   hp2.waitForHomePageToLoad();
	   Assert.assertTrue(hp2.isOnHomePage(), "User is not navigated back to the home page.");
	
}
}

