package teststeps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.SuncorpOBJ;
import org.apache.logging.log4j.*;
public class SunSteps extends Baseclass {

	//public static Logger log;
		public  SuncorpOBJ google;
		public WebDriver driver;
<<<<<<< HEAD
		//public  CommerceObjectLogin cmrcelogin;	
      public Baseclass bsclass;

		//// gooogle search ////////////////////////////////
=======
		
>>>>>>> 7bfad8eb1060e985d8d63b8b7282ce0ea61ae928

		@Given("user launch a chrome browser")
		public void user_launch_a_chrome_browser() {
			bsclass=new Baseclass();
		Logger	log=LogManager.getLogger("SunSteps");
			   WebDriverManager.chromedriver().setup();
			  driver= new ChromeDriver();
			  google = new SuncorpOBJ(driver);
			//  cmrcelogin= new CommerceObjectLogin(driver);
			 // sel = new SeleniumObject(driver);
			  log.info("chrome launched successsfully");
			}

			
		@When("user enter an URL as {string}")
		public void user_enter_an_url_as(String url) {
			    driver.get(url);
			    log.info("goggle URL entered");
			}

		@When("enter a search text as {string}")
		public void enter_a_search_text_as(String text) {
			   google.EnterSearchText(text);
			   log.info("facebook URL entered");
			}

		
		@Then("close browser")
		public void close_browser() {
		    driver.close();
		    driver.quit();
		    log.info("chrome closed and quit");
		}
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

