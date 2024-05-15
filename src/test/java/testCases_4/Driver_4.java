package testCases_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.ExcelReader;

public class Driver_4 {

     WebDriver driver;        
	
	public static ExcelReader excel = new ExcelReader("C:\\Users\\monimuru\\eclipse-workspace\\SauceDemo\\src\\test\\resources\\Excel\\sauce .xlsx");
														
	@BeforeClass
		
	public void browsersetup() {
		System.setProperty("webdriver.chrome.driver",  
				"C:\\Users\\monimuru\\Desktop\\Path\\chromedriver-win64\\chromedriver.exe");
				
		driver = new ChromeDriver();
		String actURL = "https://www.saucedemo.com/";
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String expURL = driver.getCurrentUrl();
		Assert.assertEquals(actURL, expURL);
		System.out.println("Validation Succssful");
		
	}
	
	@AfterClass
	public void closebrowser() {
		if (driver!=null) {
			driver.quit();
		}
	}
}


