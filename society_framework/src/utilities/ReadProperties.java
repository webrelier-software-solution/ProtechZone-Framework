package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
String FilePath = "D:\\program files\\society_framework\\src\\profiles\\config.properties";
	
	Properties prop = new Properties();
	
	
	public String readPropertyfile(String key) throws IOException{
		//read file from Location
		//load file
		//read loaded file
		
		File file = new File(FilePath);
		FileInputStream fis = new FileInputStream(file);
		//load file
		prop.load(fis);
				
		return prop.getProperty(key);
	}
}
