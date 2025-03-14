package utility;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\lppaw\\Desktop\\cucumber 2\\cucumbber\\FeatureFile\\suncorp.feature",
	//	features=".//feature/",
	//	features={".//feature/login.feature",".//feature/google.feature"},
		glue= "teststeps", 
		dryRun=false,
		monochrome=true
		//plugin= {"pretty","junit:target/report/junitReport.xml","html:target/report/htmlReport.html","json:target/report/jsonReport.json"},
		//tags="@IntPaymentandTravel"
		
		)













public class Runner {

	
	
	
	
	
	
	
	
	
	
	
	
}
