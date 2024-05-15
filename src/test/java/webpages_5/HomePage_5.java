package webpages_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases_5.Driver_5;

public class HomePage_5 extends Driver_5{
	WebDriver driver;
	
	By filterIcon = By.xpath("//select[@class='product_sort_container']");
	By optionLocator = By.xpath("//select[@class='product_sort_container']/option[2]");
	By productsname = By.xpath("(//div[@class='inventory_list'])/child::div");
	By carticon = By.className("shopping_cart_link");
	By cartnumber = By.xpath("(//a[@class=\"shopping_cart_link\"])/child::span");

	
	
	
    public HomePage_5(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFilterIcon() {
        driver.findElement(filterIcon).click();
    }

    public void selectSortingOptionByNameZtoA() {
                
       // By optionLocator = By.xpath("//ul[@class='sorting-options']//li[contains(text(), '" + option + "')]");
        WebElement optionElement = driver.findElement(optionLocator);
        optionElement.click();
    }
    
    public boolean areProductsSortedFromNameZtoA() {
    	WebElement productsTitle = driver.findElement(productsname);
    	String sortedProductNames = productsTitle.getText();
		return true;
    }
 	

	private boolean areProductsSortedFromNameZtoA(String sortedProductNames) {
		return sortedProductNames.equals(areProductsSortedFromNameZtoA(sortedProductNames));
  
	}
	

	public void addMultipleProductsToCart(int numberOfProducts) {
        By productLocator = By.xpath("//div[@class='inventory_item_name ']");
        java.util.List<WebElement> products = driver.findElements(productLocator);

        for (int i = 0; i < numberOfProducts && i < products.size(); i++) {
        	
        	WebElement product = products.get(i);
            WebElement addToCartButton = products.get(i).findElement(By.xpath("//button[text()='Add to cart']"));
            
            System.out.println("Clicking on product: " + product.getText());
            addToCartButton.click();
            System.out.println("Added to cart: " + product.getText());
           
        }
    }
	public void cartIconElement() {
		WebElement CartIcon = driver.findElement(carticon);
		CartIcon.click();	
	}

	 public boolean isCartIconDisplayedWithProductCount() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        boolean cartNumberElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cartnumber)) != null;

	        return cartNumberElement;
	        //return true;
	    }
	
	 public String getProductCount() {
		 WebElement CartNumber = driver.findElement(cartnumber);
		 return CartNumber.getText();
	 }
	 
}


	

