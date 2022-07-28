package com.Assignment;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FileReader.Page_Object_Model;
import com.assignment_Baseclass.Baseclass;
import com.helper.File_Reader_Manager;

import junit.framework.Assert;

public class Testing extends Baseclass {

	public static WebDriver driver;
	public static Page_Object_Model pom = new Page_Object_Model(driver);
	public static Logger log = Logger.getLogger(Testing.class);
	@BeforeClass
	public void browserLunch() throws Throwable {
		PropertyConfigurator.configure("log4j.properties");		
		implicitwait(30);
		log.info("Browser Launch");

		driver = getBrowser("chrome");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getwikiUrl();
		url_Launch(url);
		log.info("Url Launch Successfully ");
	}

	@Test
	public void Release_wiki() throws Throwable {
		String searchbox = File_Reader_Manager.getInstanceFRM().getInstanceCR().getimdbUrl();
		pom.getdetails().getSearch_Button().click();

		String Rele_text_wiki = pom.getdetails().getRelease_Date().getText();
		System.out.println(Rele_text_wiki);

		String Rele_value_wiki = pom.getdetails().getRelease_Value().getText();
		System.out.println(Rele_value_wiki);

		System.out.println(Rele_text_wiki + ":" + Rele_value_wiki);

		String Country_text_wiki = pom.getdetails().getRelease_Date().getText();
		System.out.println(Country_text_wiki);

		String Country_value_wiki = pom.getdetails().getRelease_Value().getText();
		System.out.println(Country_value_wiki);

		System.out.println(Country_text_wiki + " :" + Country_value_wiki);

		String Rele_value_imdb = pom.getdetails().getRelease_Value().getText();
		System.out.println(Rele_value_imdb);
		String Rele_valuewiki = pom.getdetails().getRelease_Value().getText();
		System.out.println("Rele_value_wiki");

		Assert.assertEquals(Rele_value_imdb, Rele_value_wiki);
		System.out.println("The Strings are validated");


		navigations("to", "https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");

		String search_box = File_Reader_Manager.getInstanceFRM().getInstanceCR().getsearchbox();
		inputvalues(pom.getimdbdetails().getSearch_Box(), searchbox);

		String Rele_text_imdb = pom.getdetails().getRelease_Date().getText();
		System.out.println(Rele_text_imdb);

		String Rele_valueimdb = pom.getdetails().getRelease_Value().getText();
		System.out.println(Rele_value_imdb);

		System.out.println(Rele_text_imdb + ":" + Rele_value_imdb);

		String Country_text_imdb = pom.getdetails().getRelease_Date().getText();
		System.out.println(Country_text_imdb);

		String Country_value_imdb = pom.getdetails().getRelease_Value().getText();
		System.out.println(Country_value_imdb);

		System.out.println(Country_text_imdb + " :" + Country_value_imdb);
	}

	@AfterClass
	public void browserTriminate() {
		quit();
	}
}
