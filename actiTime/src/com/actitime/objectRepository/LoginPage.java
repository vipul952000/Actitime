package com.actitime.objectRepository;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
	@FindBy(name="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pwtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgnbtn;
	
	
	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
    public WebElement getUntb() {
		return untb;
	}


	public WebElement getPwtb() {
		return pwtb;
	}


	public WebElement getLgnbtn() {
		return lgnbtn;
	}

	
	
	
}
