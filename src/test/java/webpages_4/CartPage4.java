package webpages_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testCases_4.Driver_4;

public class CartPage4 extends Driver_4{
	WebDriver driver;
	
	By checkoutbtn = By.xpath("//button[@id='checkout']");
	//By firstnameinput = By.xpath("//input[@id='first-name']");
	//By lastnameinput = By.xpath("//input[@id='last-name']");
	//By zipcodeinput = By.xpath("//input[@id='postal-code']");
	
	public CartPage4(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnCheckout() {
		driver.findElement(checkoutbtn).click();	
	}
	
	/*public void enterFirstName(String firstname) {
		WebElement FirstName = driver.findElement(firstnameinput);
		FirstName.click();
	}

	public void enterLastName(String lastname) {
		WebElement LastName = driver.findElement(lastnameinput);
		LastName.click();
	}
	public void enterZipCode(int code) {
		WebElement postalcode = driver.findElement(zipcodeinput);
		postalcode.click();
	}*/
}
