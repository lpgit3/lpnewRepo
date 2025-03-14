package teststeps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.SuncorpOBJ;

public class SunSteps {

	
		public  SuncorpOBJ google;
		public WebDriver driver;
		

		@Given("user launch a chrome browser")
		public void user_launch_a_chrome_browser() {
			   WebDriverManager.edgedriver().setup();
			WebDriver   driver= new ChromeDriver();
			  google = new SuncorpOBJ(driver);
			//  cmrcelogin= new CommerceObjectLogin(driver);
			 // sel = new SeleniumObject(driver);
			}

			
		@When("user enter an URL as {string}")
		public void user_enter_an_url_as(String url) {
			    driver.get(url);
			}

		@When("enter a search text as {string}")
		public void enter_a_search_text_as(String text) {
			   google.EnterSearchText(text);
			}

		@Then("click on searchButton")
		public void click_on_search_button() {
			   google.ClickOnSearchButton();
			}

		@Then("close browser")
		public void close_browser() {
		    driver.close();
		}
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

