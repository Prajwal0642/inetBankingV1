package com.inetbanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) throws Exception 
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(user);
		Logger.info("user name provided");
		lp.setPassword(pwd);
		Logger.info("Password");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();  //close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			Logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			Logger.warn("Login passed");
			Thread.sleep(3000);
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept(); //close the logout alert
			driver.switchTo().defaultContent();
		}
		
		
	}
	
	public boolean isAlertPresent()     //user defined method created to check the alert is present or not
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String Path = "C:/Users/admin/eclipse-workspace/inetBankingV1/src/test/java/com/inetbanking/testData/Book1.xlsx";
	    
		int rownum=XLUtils.getRowCount(Path, "Sheet1");
		int cocount=XLUtils.getCellCount(Path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][cocount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<cocount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(Path, "Sheet1", i, j);  //1 0
				
				
			}
		}
	
	return logindata;
	}

}
