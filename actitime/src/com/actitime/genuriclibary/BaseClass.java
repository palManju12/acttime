package com.actitime.genuriclibary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		
		Reporter.log("data base is connected",true);
	}
   @BeforeTest
   public void lauchbrowser() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.actitime.com/login.do");
	 Reporter.log("browser launch",true); 
   }
   @BeforeMethod
   public void Login() {
	   driver.findElement(By.id("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   driver.findElement(By.xpath("//div[.='Login ']")).click();
	   Reporter.log("logged is successfully",true);
   }
   @AfterMethod
   public void logout() {
	   driver.findElement(By.id("logoutLink")).click();
	   Reporter.log("logout successfull",true);
   }
   @AfterClass
   public void closeBroser() {
	   driver.close();
	   Reporter.log("broser is close",true);
   }
  @AfterSuite
  public void databasedisconnected() {
	  Reporter.log("data base is disconnected",true);
  }
   
   
   
   
   
   
}
