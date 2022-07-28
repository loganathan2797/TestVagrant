package com.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_File_Config {
	 
static Logger log = Logger.getLogger(Property_File_Config.class); 

public static void main(String[] args) {
	
	PropertyConfigurator.configure("log4j.properties");
	log.debug("Debug");
	
	log.info("Info");
	
	log.warn("Warning");
	
	log.error("Error");
	
	log.fatal("Faral Message");
}


}
