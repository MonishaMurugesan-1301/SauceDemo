package testCases_3;

import org.testng.annotations.Test;

import webpages_3.HomePage3;





public class HomePage_Test3 extends Login_Test3 {
	
	@Test(dependsOnMethods = "loginTest3")
    public void addProductToCartTest() {
   	 HomePage3 hp3 = new HomePage3(driver);
        hp3.navigateToThirdProduct();
        
        hp3.clickAddToCart_3();
        
        hp3.navigateToProduct_1();
        hp3.clickAddToCart_1();
        
        
	}
}
	
    


