package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException 
	{
		
		
		
		//here we call the methods in Page object so we create a object
		LoginPage lp=new LoginPage(driver); 
		
		//by using lp object call methods
		lp.setUserName(username);
		Logger.info("Entered username");
		
		lp.setPassword(password);
		Logger.info("Entered Password");
		lp.clickSubmit();
		
		if(driver.getTitle().equals(" Guru99 Bank Home Page "))
		{
			System.out.println("True");
			Logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			System.out.println("False");
			Logger.info("Login test failed");
		}
		
	}

}
