package com.actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	@FindBy (xpath = "(//div[@class='label'])[2]")
    private WebElement tsklink;
	
	@FindBy (xpath ="//div[.='Add New']")
	private WebElement addnewcust;
	
	@FindBy (xpath = "//div[.='+ New Customer']")
	private WebElement newsuct;
	
	@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement newname;
	
	@FindBy (xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement newdiscription;
	
	@FindBy (xpath = "//div[.='Create Customer']")
	private WebElement newcreate;
	
	@FindBy (xpath ="//div[@class='greyButton cancelBtn']")
	private WebElement newcancel;
	
	
	//initialization
	public TaskPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//utilization
	public WebElement getTsklink() {
		return tsklink;
	}


	public WebElement getAddnewcust() {
		return addnewcust;
	}


	public WebElement getNewsuct() {
		return newsuct;
	}


	public WebElement getNewname() {
		return newname;
	}


	public WebElement getNewdiscription() {
		return newdiscription;
	}


	public WebElement getNewcreate() {
		return newcreate;
	}


	public WebElement getNewcancel() {
		return newcancel;
	}
	
   
}
