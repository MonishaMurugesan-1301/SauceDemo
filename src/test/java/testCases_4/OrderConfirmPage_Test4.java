package testCases_4;

import org.testng.Assert;
import org.testng.annotations.Test;

import webpages_4.OrderConfirmPage_4;
	

	public class OrderConfirmPage_Test4 extends CheckOutPage_Test {

	    @Test(dependsOnMethods = "checkoutInformationTest")
	    public void placeOrderTest() throws InterruptedException {
	        OrderConfirmPage_4 Op4 = new OrderConfirmPage_4(driver);

	        Op4.clickFinishButton();
	        Thread.sleep(2000); 
 
	        Assert.assertTrue(Op4.isOrderPlacedMessageDisplayed(),
	                "Order placed message is not displayed.");

	        
	        Op4.clickBackToHomeLink();
	        Thread.sleep(2000); 
	    }
	}



