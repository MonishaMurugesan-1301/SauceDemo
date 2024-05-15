package testCases_4;
import org.testng.annotations.Test;

import webpages_4.CheckOutPage_4;

public class CheckOutPage_Test extends CartPage_Test4 {

    @Test(dependsOnMethods = "checkout")
    public void checkoutInformationTest() throws InterruptedException {
        CheckOutPage_4 C4 = new CheckOutPage_4(driver);
        C4.enterFirstName("kavi");
        C4.enterLastName("cibi");
        C4.enterZipCode("637020");
        Thread.sleep(2000);
        
        C4.clickContinueButton();
    }
}




