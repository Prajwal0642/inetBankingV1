package com.inetbanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class Tc_AddCustomerTest_003 extends BaseClass 
{
	@Test
	public void addNewCustomer() throws IOException, Exception
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("username is provided");
		lp.setPassword(password);
		Logger.info("password is abcccprovided");
		
		lp.clickSubmit();
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		addcust.cusName("Sara");
		addcust.cusgender("male");
		addcust.cusDob("10", "15", "1985");
		addcust.cusaddress("India");
		addcust.cuscity("Ban");
		addcust.cusstates("Kar");
		addcust.cuspinno("570015");
		addcust.custelephoneno("9876543210");
		String email= randomestring()+"@gmail.com";
		addcust.cusmailid(email);
		addcust.cuspassword("abcdef");
		addcust.cussubmit();
		
		Thread.sleep(3000);
		
		Logger.info("Validation is started");
		
		boolean res= driver.getPageSource().contains("Customer Registeres Successfully!!!");
		if(res==true)
		{
			Logger.info("testcase is passed...");
			System.out.println("True");
		}
		else
		{
			Logger.info("testcase is failed...");
			captureScreen(driver,"addCustomer");
			System.out.println("False");
			
		}
	}

}
	

	
	

