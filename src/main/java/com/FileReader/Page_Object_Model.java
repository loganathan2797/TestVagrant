package com.FileReader;

import org.openqa.selenium.WebDriver;

import com.pageMethods.Imdb_Page;
import com.pageMethods.Wiki_Page;

public class Page_Object_Model {
	private static WebDriver driver;
	
	private Wiki_Page details=null;
	private Imdb_Page imdbdetails=null;
	
public Page_Object_Model(WebDriver driver2) {
	driver=driver2;	
	System.out.println("Page Object Model Constructor");
}
	
public Wiki_Page getdetails() {
if(details == null) {
	System.out.println("wiki Details print");
	details = new Wiki_Page(driver);
}
	
	return details;
	
}
	
	
	public Imdb_Page getimdbdetails() {
		if (imdbdetails ==null) {
			imdbdetails = new Imdb_Page(driver);
	}
		return imdbdetails;	
		
	
}}