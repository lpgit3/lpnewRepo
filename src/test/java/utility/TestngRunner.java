package utility;

import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="//C://Users//lppaw//Desktop//cucumber 2//cucumbber//demoqa.feature",
	//	features=".//feature/",
	//	features={".//feature/login.feature",".//feature/google.feature"},
		glue= "teststeps", 
		dryRun=false,
		monochrome=false,
		plugin= {"pretty","html:C:\\Users\\lppaw\\Desktop\\cucumber 2\\cucumbber\\Report/htmlreport.html","json:C:\\Users\\lppaw\\Desktop\\cucumber 2\\cucumbber\\Report/jsonReport.json"}
	//	tags="@hrmLogin"
		
		)
 



public class TestngRunner  {

}
	
	
	
	

