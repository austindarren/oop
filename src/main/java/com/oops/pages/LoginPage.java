package com.oops.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private By emailId = By.id("username");
	private By pass = By.id("password");
	private By loginbutton = By.id("loginBtn");
	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() {
		return getWebElement(emailId);
	}

	/**
	 * @return the pass
	 */
	public WebElement getPass() {
		return getWebElement(pass);
	}

	/**
	 * @return the loginbutton
	 */
	public WebElement getLoginbutton() {
		return getWebElement(loginbutton);
	}
	
	public void doLogin(String user, String pass)
	{
		getEmailId().sendKeys(user);
		getPass().sendKeys(pass);
		getLoginbutton().click();
	}
	
	

}
