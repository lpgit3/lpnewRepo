package teststeps;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.opera.core.systems.OperaDesktopDriver;
import com.opera.core.systems.OperaDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObject.SuncorpOBJ;
public class SunSteps extends Baseclass {
		public SunSteps() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

		
		//public static Logger log;
		public  SuncorpOBJ google;
		public WebDriver driver;
		Logger	log=LogManager.getLogger("SunSteps");
		
		//public  CommerceObjectLogin cmrcelogin;	
      public Baseclass bsclass;
     
		//// gooogle search ////////////////////////////////
    @Before
      public void setup1() throws IOException {
    	    bsclass = new Baseclass();
  
    	  String browserread=bsclass.getbrowser();
         switch(browserread.toLowerCase()) {
               case "chrome":
		           WebDriverManager.chromedriver().setup();
		           driver= new ChromeDriver();
		           break;
		           
               case "msedge":
		           WebDriverManager.edgedriver().setup();
		           driver= new EdgeDriver();
		           break;  
		           
               case "firefox":
		           WebDriverManager.firefoxdriver().setup();
		           driver= new FirefoxDriver();
		           break; 
		           
               case "safari":
		           WebDriverManager.safaridriver().setup();
		           driver= new SafariDriver();
		           break;  
		           
               case "Opera":
            	   WebDriverManager.operadriver().setup();
		           driver= new OperaDriver();
		           break;   
		           
		         
		         default:
		        	 driver=null;
		        	 break;
		        	 
}
      }
      
     
		@Given("user launch a chrome browser")
		public void user_launch_a_chrome_browser() throws FileNotFoundException {
			
		//driver.manage().window().maximize();
			  google = new SuncorpOBJ(driver);
			//  cmrcelogin= new CommerceObjectLogin(driver);
			 // sel = new SeleniumObject(driver);
			  log.info("chrome launched successsfully");
			}

			
		@When("user enter an URL as {string}")
		public void user_enter_an_url_as(String url) {
			    driver.get(url);
			  log.info("URL entered");
			}

		@When("enter a search text as {string}")
		public void enter_a_search_text_as(String text) throws IOException {
			   google.EnterSearchText(text);
			String ab=   google.getscreenshot("gogglescreenshot");
			   log.info("captured screenshot At : "+ab.substring(33));
			   log.info("facebook URL entered");
			   
			}

		
		@Then("close browser")
		public void close_browser() {
		    driver.close();
		    driver.quit();
		    log.info("chrome closed and quit");
		    log.info("========================================================");
		}
		
	///////////// Alert handle on Demoqa
		@Given("user launch browser")
		public void user_launch_browser() {
		   driver.manage().window().maximize();
		}

		@When("user enter an URL {string}")
		public void user_enter_an_url(String URL) {
		   driver.get(URL);
		   log.info("Enterd URL : " +URL);
		}

		@When("validate user should be land on page title {string}")
		public void validate_user_should_be_land_on_page_title(String expttl) {
		  String actttl= driver.getTitle();
		  Assert.assertEquals(expttl, actttl);
		  log.info("Page tittle : "+actttl); 
		}

		@When("click on click me button of see alert")
		public void click_on_click_me_button_of_see_alert() {
		   google.clickonalertButton();
		   log.info("succesfully clicked on alert button ");
		}

		@Then("user should open a see alert pop-up")
		public void user_should_open_a_see_alert_pop_up() throws IOException {
			 Alert alert =   driver.switchTo().alert();
		String text= alert.getText();
		   google.getscreenshot("alertScreenshot");
		   log.info("Opened Alert title : "+text);
		}

		@When("click on Ok button of alert")
		public void click_on_ok_button_of_alert() {
		//	alert.accept();
			log.info("clicked on alert Ok button");
		}

		@Then("Alert should close")
		public void alert_should_close() {
		    
	//	String title=	alert.getText();
	//	assert.assertNotEquals(,title );
		}



		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

