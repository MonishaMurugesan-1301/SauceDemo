package webpages_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testCases_1.Driver;

public class LoginPage extends Driver {
	     WebDriver driver;

	    // Locators
	     By usernameInput = By.id("user-name");
	     By passwordInput = By.id("password");
	     By loginButton = By.id("login-button");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterUsername(String username) {
	        WebElement usernameField = driver.findElement(usernameInput);
	        usernameField.sendKeys(username);
	    }
	    //User should be able to enter the username.


	    public void enterPassword(String password) {
	        WebElement passwordField = driver.findElement(passwordInput);
	        passwordField.sendKeys(password);
	    }
	    //User should be able to enter the password.


	    public void clickLoginButton() {
	        WebElement loginBtn = driver.findElement(loginButton);
	        loginBtn.click();
	    }
	    //User should be able to login saucedemo website successfully
	}


