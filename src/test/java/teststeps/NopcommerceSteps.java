package teststeps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NopcommerceSteps {
	@FindBy(linkText="Register") WebElement register;
	
	@Given("user launch a browser")
	public void user_launch_a_browser() {
	    
	}

	@Then("user should land on nopcommerce login\"nopCommerce demo store. Home page title\"")
	public void user_should_land_on_nopcommerce_login_nop_commerce_demo_store_home_page_title() {
	  
	}

	@Then("click on Register")
	public void click_on_register() {
	   
	}

	@Then("register title should available")
	public void register_title_should_available() {
	  
	}

	@Then("select male as gender")
	public void select_male_as_gender() {
	   
	}

	@Then("enter a personal details {string}")
	public void enter_a_personal_details(String string) {
	   
	}

	@Then("enter a company details like {string}")
	public void enter_a_company_details_like(String string) {
	   
	}

	@Then("under options under select newsletter checkbox")
	public void under_options_under_select_newsletter_checkbox() {
	   
	}

	@Then("enter a password like {string}")
	public void enter_a_password_like(String string) {
	 
	}

	@Then("Reenter a password like {string}")
	public void reenter_a_password_like(String string) {
	    
	}

	@Then("click on register button")
	public void click_on_register_button() {
	    
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
