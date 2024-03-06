package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(linkText="New Customer")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement CustomerName;
	
	@FindBy(name="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement txtdob;
	

	@FindBy(name="addr")
	@CacheLookup
	WebElement address;

	@FindBy(name="city")
	@CacheLookup
	WebElement city;

	@FindBy(name="state")
	@CacheLookup
	WebElement statename;

	@FindBy(name="pinno")
	@CacheLookup
	WebElement pincode;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement telephoneNo;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement mailId;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//tbody/tr[14]/td[2]/input[1]")
	@CacheLookup
	WebElement submit;
	
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	public void cusName(String cname)
	{
		CustomerName.sendKeys(cname);
	}
	public void cusgender(String cgender)
	{
		rdGender.click();
	}
	public void cusDob(String mm,String dd, String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}
	
	public void cusaddress(String caddress)
	{
		address.sendKeys(caddress);
	}
	public void cuscity(String ccity)
	{
		city.sendKeys(ccity);
	}
	public void cusstates(String cstates)
	{
		statename.sendKeys(cstates);
	}
	public void cuspinno(String cpinno)
	{
		pincode.sendKeys(String.valueOf(cpinno));
	}
	public void custelephoneno(String ctelepphoneno)
	{
		telephoneNo.sendKeys(ctelepphoneno);
	}
	public void cusmailid(String cmailid)
	{
		mailId.sendKeys(cmailid);
	}
	public void cuspassword(String cpassword)
	{
		password.sendKeys(cpassword);
	}
	public void cussubmit()
	{
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
