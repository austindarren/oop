package com.qaoops.test;

import org.testng.annotations.Test;

import com.oops.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	public LoginPage loginpage;
	
	
	@Test(priority=1)
	public void verifyLoging()
	{
		loginpage = new LoginPage(driver);
		loginpage.doLogin("austindarren@gmail.com", "Ashish@07");
		
	}

}
