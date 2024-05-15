package webpages_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases_1.Driver;

public class CartPage extends Driver {

	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		//this.wait = new WebDriverWait(driver, 10);
	}
	 
	
	public boolean isProductPresentInCart(String expectedTitle) {
		if (expectedTitle == null || expectedTitle.isEmpty()) {
            System.out.println("Expected title is null or empty. Please provide a valid title.");
            return false;
        }
		String xpathExpression = "//div[@class='cart_item']//div[@class='inventory_item_name' and text()='" + expectedTitle + "']";
		return !driver.findElements(By.xpath(xpathExpression)).isEmpty();
	}
	//User should be able to view the selected item in the cart
		
	By productname = By.xpath("//div[@class='cart_item']//div[@class='inventory_item_name']");
	public String getProductTitleInCart() {
		WebElement ActproductTitle = driver.findElement(productname);
		
        return ActproductTitle.getText();
		
	}
	//user should be able to see title must be same as it is displaye in home page

	

}
