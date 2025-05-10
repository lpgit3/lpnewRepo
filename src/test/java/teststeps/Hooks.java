package teststeps;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
WebDriver driver;
Properties prop;
	
//@Before
	public void setup() throws IOException {
		
		driver=Baseclass.initializeBrowser();
		Baseclass.getproperties();
		//driver.manage().window().maximize();
	
	}
	
	
	//@After
	public void tearDown(Scenario scenario) {
		driver.close();
		driver.quit();
	}
	

	
	
//	@AfterStep
	public String addScreenshot(Scenario scenrio)  {
		if(scenrio.isFailed()) {
		TakesScreenshot scr = ((TakesScreenshot)driver);
	byte[] source	=scr.getScreenshotAs(OutputType.BYTES);
		
	scenrio.attach(source,scenrio.getName()+"_"+Hooks.generateRandomAplhabet()+"/png", scenrio.getName());
		
		}
		return null;
		
	}
	
	
	public static  String generateRandomAplhabet() {
		return RandomStringUtils.randomAlphabetic(4);
	}
	
	
	
	
	
	
	
	
	
}
