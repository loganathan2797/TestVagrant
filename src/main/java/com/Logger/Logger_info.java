package com.Logger;

import java.lang.management.LockInfo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_info {
	static Logger log = Logger.getLogger(LockInfo.class); 

	public static void main(String[] args) {
		
BasicConfigurator.configure();		
		
		log.debug("Debug");
		log.info("Info");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Faral Message");
	}
	


}
