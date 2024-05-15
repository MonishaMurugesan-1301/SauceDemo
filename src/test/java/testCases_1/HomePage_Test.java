package testCases_1;

import org.testng.annotations.Test;

import webpages_1.HomePage;

public class HomePage_Test extends Login_Test {
	
	@Test(dependsOnMethods = "loginTest")
    public void addProductToCartTest() {
   	 HomePage hp = new HomePage(driver);
        hp.navigateToLastProduct();
        
        hp.clickAddToCart();
        hp.clickCartIcon();
	}
}
	
    


