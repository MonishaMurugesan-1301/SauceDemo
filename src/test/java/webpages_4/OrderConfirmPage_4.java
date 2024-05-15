package webpages_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testCases_4.Driver_4;

public class OrderConfirmPage_4 extends Driver_4 {
	WebDriver driver;

	    By finishButton = By.xpath("//button[@id='finish']");
	    By orderPlacedMessage = By.xpath("//div[@id='checkout_complete_container']");
	    By backToHomeLink = By.xpath("//button[@id='back-to-products']");

	    public OrderConfirmPage_4(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickFinishButton() {
	        WebElement finishBtn = driver.findElement(finishButton);
	        finishBtn.click();
	    }

	    public boolean isOrderPlacedMessageDisplayed() {
	        WebElement orderMessage = driver.findElement(orderPlacedMessage);
	        return orderMessage.isDisplayed();
	    }

	    public void clickBackToHomeLink() {
	        WebElement backToHome = driver.findElement(backToHomeLink);
	        backToHome.click();
	    }
	}
