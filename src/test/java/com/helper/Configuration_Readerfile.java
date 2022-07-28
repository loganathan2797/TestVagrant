package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Readerfile {
	private static Properties p;
	
		public Configuration_Readerfile() throws Throwable{

		

			File f = new File(
					"C:\\Users\\Admin\\eclipse-workspace\\Assignment\\src\\test\\java\\com\\properties\\Configuration.properties");
			FileInputStream fis = new FileInputStream(f);
			 p = new Properties();
			p.load(fis);
		}
		

//		
//		public String getUrl(String type)  {
//if (type.equalsIgnoreCase("imdb")) {
//
//	String url = p.getProperty("imdbUrl");
//	System.out.println(url);
//	return url;
//	
//}else if (type.equalsIgnoreCase("wikiUrl")) {
//	String url = p.getProperty("imdbUrl");
//	System.out.println("wikiUrl");
//	return url;
//	
//}
//return type;
//
//		}
//		
		
		
public String getimdbUrl() {
	String imdbUrl=p.getProperty("imdbUrl");
	System.out.println(imdbUrl);
	return imdbUrl;
}
public String getwikiUrl() {
	String wikiUrl =p.getProperty("wikiUrl");
	System.out.println(wikiUrl);
	return wikiUrl;
}



public String getsearchbox() {
	String searchbox =p.getProperty("wikiUrl");
	System.out.println(searchbox);
	return searchbox;
}

}
