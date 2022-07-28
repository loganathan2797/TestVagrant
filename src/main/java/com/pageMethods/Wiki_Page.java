package com.pageMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wiki_Page {

	private static WebDriver driver;

	public Wiki_Page(WebDriver driver2) {
		driver = driver2;
		PageFactory.initElements(driver, this); 
	}


	@FindBy(xpath = "//input[@name='search']")
	private WebElement search_Box;
	@FindBy(id = "searchButton")
	private WebElement Search_Button;
	@FindBy(xpath = "//div[text()='Release date']")
	private WebElement Release_Text;
	@FindBy(xpath = "//div[text()='Release date']/../following-sibling::td/div/ul/li")
	private WebElement Release_Value;
	@FindBy(xpath = "//th[text()='Country']")
	private WebElement Country_Text;
	@FindBy(xpath = "//div[text()='Release date']/../following-sibling::td/div/ul/li")
	private WebElement Country_Value;

	public WebElement getsearch_Box() {
		System.out.println(" search in wiki ");
		return search_Box;
	}

	public WebElement getSearch_Button() {
		return Search_Button;
	}

	public WebElement getRelease_Date() {
		return Release_Text;
	}

	public WebElement getCountry() {
		return Country_Text;
	}

	public WebElement getRelease_Value() {
		return Release_Value;
	}

	public WebElement getCountry_Value() {
		return Country_Value;
	}

}
