package com.pageMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Imdb_Page {
	
	
	
public WebDriver driver;
@FindBy(xpath = "//input[@type='text']")
private WebElement Search_Box;

@FindBy(xpath = "//button[@type='submit']")
private WebElement Search_Button;
@FindBy(xpath = "//a[text()='Release date']")
private WebElement Release_Text;
@FindBy(xpath = "//a[text()='Release date']//following-sibling::div/ul/li/a")
private WebElement Release_Value;
@FindBy(xpath = "//span[contains(text(),'Country')]")
private WebElement country_Text;
@FindBy(xpath = "//span[contains(text(),'Country')]//following-sibling::div/ul/li/a[text()='India']")
private WebElement country_value;


public WebElement getRelease_Date() {
	return Release_Text;
}

public WebElement getRelease_Value() {
	return Release_Value;
}

public Imdb_Page(WebDriver driver2) {

		   this.driver =driver2;
		   PageFactory.initElements(driver, this);
	   }

public WebElement getSearch_Box() {
	return Search_Box;
}
public WebElement getSearch_Button() {
	return Search_Button;
}

























}
