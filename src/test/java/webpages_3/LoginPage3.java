package webpages_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testCases_1.Driver;

public class LoginPage3 extends Driver {
	     WebDriver driver;

	    // Locators
	     By usernameInput = By.id("user-name");
	     By passwordInput = By.id("password");
	     By loginButton = By.id("login-button");

	    public LoginPage3(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterUsername(String username) {
	        WebElement usernameField = driver.findElement(usernameInput);
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        WebElement passwordField = driver.findElement(passwordInput);
	        passwordField.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        WebElement loginBtn = driver.findElement(loginButton);
	        loginBtn.click();
	    }
	}


