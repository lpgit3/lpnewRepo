package teststeps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Baseclass {
	public static WebDriver driver;
 static Properties prop;
 static String path="C:\\Users\\lppaw\\Desktop\\cucumber 2\\cucumbber\\src\\test\\resources\\config.properties";
 static Logger loger;
 




public static WebDriver initializeBrowser() throws IOException {
	 prop = getproperties();
	 String browser=prop.getProperty("browser").toLowerCase();
	 
	 switch(browser.toLowerCase()) {
	 case "chrome":
		 driver=new ChromeDriver();
		 break;
		 
	 case "edge":
		 driver=new EdgeDriver();
		 break;
		 
	 case "firefox":
		 driver=new FirefoxDriver();
		 break;
		 
	default:
		System.out.println("browser not matched");
		return null;
	 
	 }
	 
	return driver;
	 
 }
 
 
 
 public static Properties getproperties() throws IOException {
	 FileReader file = new FileReader(System.getProperty(path));
	 prop=new Properties();
	 prop.load(file);
	return prop;
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
