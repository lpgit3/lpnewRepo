package teststeps;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
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
  	@Given("user launch a demoqachrome browser")
	public void user_launch_a_demoqachrome_browser() {
		 WebDriverManager.chromedriver().setup();
           driver= new ChromeDriver();
	driver.manage().window().maximize();
		  google = new SuncorpOBJ(driver);
		//  cmrcelogin= new CommerceObjectLogin(driver);
		 // sel = new SeleniumObject(driver);
		  log.info("chrome launched successsfully");
	}
     
		//// gooogle search ////////////////////////////////
  /*  @Before
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
      
    */ 
		@Given("user launch a chrome browser")
		public void user_launch_a_chrome_browser() throws FileNotFoundException {
			 WebDriverManager.chromedriver().setup();
	           driver= new ChromeDriver();
		driver.manage().window().maximize();
			  google = new SuncorpOBJ(driver);
			//  cmrcelogin= new CommerceObjectLogin(driver);
			 // sel = new SeleniumObject(driver);
			  log.info("chrome launched successsfully");
			}

			
		@When("user enter an URL as {string}")
		public void user_enter_an_url_as(String url) {
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
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
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			 google = new SuncorpOBJ(driver);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
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


//////////// orangeHRM
		@Then("user should land on page title {string}")
		public void user_should_land_on_page_title(String expOrangeLogin) {
		String actualOrangelogin=  driver.getTitle();
		Assert.assertEquals(expOrangeLogin, actualOrangelogin);
		log.info("orangeHRM Login Page title : "+actualOrangelogin);
		}

		@When("user enter an username as {string}")
		public void user_enter_an_username_as(String username) {
			
		   google.enterUsername(username);
		   log.info("user entered orangeHRM valid username as : "+username);
		}

		@When("user enter an password as {string}")
		public void user_enter_an_password_as(String password) {
		  google.enterpassword(password);
		  log.info("user entered orangeHRM valid password as : "+password);
		}

		@When("click on Login button")
		public void click_on_login_button() {
		    google.clickonLoginButton();
		    log.info("user clicked on orangeHRM login button ");
		}

		@Then("user should land on orangeHRM home page title {string}")
		public void user_should_land_on_orange_hrm_home_page_title(String expOrangeHomepage) {
		 String actualOrangeHomepage=  driver.getTitle();
		 Assert.assertEquals(expOrangeHomepage, actualOrangeHomepage);
		 log.info("user landed orangeHRM home page title : "+actualOrangeHomepage);
		}

		@Then("capture orangeHRM homepage screenshot")
		public void capture_orange_hrm_homepage_screenshot() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    try {
			String scrn=	google.getscreenshot("OrangeHRMHomepage");
			 log.info("captured screenshot of orangeHRM Home page : "+scrn);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		}


////////////////  alert popuup
		
	


		@When("click on clickMe button of alertMe")
		public void click_on_click_me_button_of_alert_me() {
			google.clickon_Clickme_Button();
			log.info("Clicked on click me Button to open a popup");
		}

		@Then("alert pop up should open")
		public void alert_pop_up_should_open() {
		   google.alertText();
		   log.info("Available Opened pop up text : "+google.alertText());
		}

		@Then("alert box text should be {string}")
		public void alert_box_text_should_be(String Expalerttext) throws IOException {
			String actualtext=google.alertText();
			Assert.assertEquals(Expalerttext, actualtext);
		/*	String aaa=   google.getscreenshot("openAlert123"); 
			log.info("captured sceenshot of OpenPop up : "+aaa.substring(40));*/
		}

		@When("click on Ok button of AlertBox")
		public void click_on_ok_button_of_alert_box() throws IOException {
			 
		   google.clickon_Alert_OKButton();
		  
		   log.info("clicked on Ok button of Alert Box");
		}

		@Then("alert box should close")
		public void alert_box_should_close() {
		 google.getAlerrOutPut();
		}

		@Then("pop up box output should be {string}")
		public void pop_up_box_output_should_be(String Expout) {
		String actlOutput=  google.getAlerrOutPut();
		Assert.assertEquals(Expout, actlOutput);
		log.info("Available Pop up output : "+actlOutput);
		}

/////////  confirm box alert
		
		@When("click on clck me button of Confirm box")
		public void click_on_clck_me_button_of_confirm_box() {
			JavascriptExecutor jse=((JavascriptExecutor)driver);
			jse.executeScript("window.scrollBy(0,200)");
			
		  google.clickon_confirmClickMe();
		  log.info("clicked on click me button to open a confirm alert box");
		}

		@Then("alert text should be {string}")
		public void alert_text_should_be(String confiexp) {
		String confiActl=   google.confirmAlertText();
		Assert.assertEquals(confiexp, confiActl);
		log.info("Text present on confirm alert : "+confiActl);
		}

		@Then("click on Ok button of confirm box")
		public void click_on_ok_button_of_confirm_box() {
			google.clickok_ConfirmBoxOKButton();
			log.info("clicked on OK button present on Confirm alert box");
		}

		@Then("confirm pop up output should be {string}")
		public void confirm_pop_up_output_should_be(String expConfi) {
		String actConfi=   google.getconfirmAlertOutput();
		Assert.assertEquals(expConfi, actConfi);
		log.info("Output result of confirm alert box : "+actConfi);
		}




		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

