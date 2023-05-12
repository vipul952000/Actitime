package com.actitime.genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	FileLibrary f = new FileLibrary();
	
	
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connection",true);
	}
	
	@BeforeClass
	public void launchbrowser() throws IOException {
		new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    String URL = f.ReadDatafromPropertyFile("url");
		driver.get(URL);
		Reporter.log("Launch the Browser",true);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String USN = f.ReadDatafromPropertyFile("username");
		driver.findElement(By.id("username")).sendKeys("USN");
		String PWD = f.ReadDatafromPropertyFile("password");
		driver.findElement(By.name("pwd")).sendKeys("PWD");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("Logged In Successfully",true);
		
	}
	
	@AfterMethod
	public void logout () {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logged Out Successfully",true);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("Browser closed",true);
	}
	@AfterSuite
	public void databaseisdisconnection() {
		Reporter.log("Database is Disconnected",true);
	}
}
