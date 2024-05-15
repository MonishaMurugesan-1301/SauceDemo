package webpages_4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testCases_4.Driver_4;

public class HomePage4 extends Driver_4 {
	WebDriver driver;
	

	By filterIcon = By.xpath("//select[@class='product_sort_container']");
	By optionLocator = By.xpath("//select[@class='product_sort_container']/option[3]");
	By carticon = By.className("shopping_cart_link");
	
	
	
    public HomePage4(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFilterIcon() {
        driver.findElement(filterIcon).click();
    }

    public void selectSortingOption(String option) {
                
       // By optionLocator = By.xpath("//ul[@class='sorting-options']//li[contains(text(), '" + option + "')]");
        WebElement optionElement = driver.findElement(optionLocator);
        optionElement.click();
    }
    
    public boolean areProductsSortedByPriceLowToHigh() {
        By productPriceLocator = By.xpath("//div[@class='pricebar']/child::div");
        java.util.List<WebElement> priceElements = driver.findElements(productPriceLocator);

        
        for (int i = 1; i < priceElements.size(); i++) {
            double currentPrice = Double.parseDouble(priceElements.get(i - 1).getText().replace("$", ""));
            double nextPrice = Double.parseDouble(priceElements.get(i).getText().replace("$", ""));

            if (currentPrice > nextPrice) {
                return false;
            }
        }
        return true;
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

}