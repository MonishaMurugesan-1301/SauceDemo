package testCases_2;

import org.testng.annotations.Test;

import webpages_2.HomePage2;

public class HomePage_Test2 extends Login_Test2 {
	
	

	@Test(dependsOnMethods = "loginTest2")
    public void addProductToCartTest() throws InterruptedException {
   	 HomePage2 hp2 = new HomePage2(driver);
        hp2.navigateToThirdProduct();
        Thread.sleep(3000);
        
        
        hp2.printProductPriceInHomePage();
        Thread.sleep(3000);
  
        hp2.clickAddToCart();
        Thread.sleep(4000);
        hp2.cartIconElement();
        Thread.sleep(4000);
	}
	

}
