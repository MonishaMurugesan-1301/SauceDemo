package webpages_4;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import testCases_4.Driver_4;

	public class CheckOutPage_4  extends Driver_4 {
	    WebDriver driver;

	    By FirstNameInput = By.id("first-name");
	    By LastNameInput = By.id("last-name");
	    By ZipCodeInput = By.id("postal-code");
	    By continueButton = By.xpath("//input[@id='continue']");   //.id("continue-button");

	    public CheckOutPage_4(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterFirstName(String FirstName) {
	        WebElement firstName1 = driver.findElement(FirstNameInput);
	        firstName1.clear();
	        firstName1.sendKeys(FirstName);
	    }

	    public void enterLastName(String LastName) {
	        WebElement lastName1 = driver.findElement(LastNameInput);
	        lastName1.clear();
	        lastName1.sendKeys(LastName);
	    }

	    public void enterZipCode(String zipCode) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement zipCode1 = wait.until(ExpectedConditions.presenceOfElementLocated(ZipCodeInput));
	        zipCode1.clear();
	        zipCode1.sendKeys(zipCode);
	    }
	    public void clickContinueButton() {
	        WebElement continueBtn = driver.findElement(continueButton);
	        continueBtn.click();
	    }
	}



