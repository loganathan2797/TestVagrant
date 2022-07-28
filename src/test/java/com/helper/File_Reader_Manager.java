package com.helper;

public class File_Reader_Manager {
	
	

	public static File_Reader_Manager getInstanceFRM()  throws Throwable{
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;

	}

	public Configuration_Readerfile getInstanceCR() throws Throwable {

		Configuration_Readerfile reader = new Configuration_Readerfile();

		return reader;
	}


}
