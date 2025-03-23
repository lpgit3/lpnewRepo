package teststeps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Baseclass {
	public WebDriver driver;
 Properties properties;
 String path="C:\\Users\\lppaw\\Desktop\\cucumber 2\\cucumbber\\config.properties";
	
		 public Baseclass() throws FileNotFoundException {
			 try {
					properties = new Properties();

					
					//to open config .properties file in input mode and load the file
					FileInputStream  fis = new FileInputStream(path);
					properties.load(fis);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 }
 
	public String getbrowser() {
		String value =properties.getProperty("browser");
		if(value!= null) 
			return value;
		else
			throw new RuntimeException("browser not mentioned");
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
