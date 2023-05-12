package com.actitime.genuriclibary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Loginpage 
{
	//decleration
	
	@FindBy(id = "username")
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pwtbox;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;
	
	//initialiation
	
	public Loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//utiliation

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbox() {
		return pwtbox;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	

}
