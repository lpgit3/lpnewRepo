package teststeps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.NopcommerceObject;

public class NopcommerceSteps {
	public WebDriver driver;
	public NopcommerceObject nop;
	public Baseclass base;
	
	@Given("user launch a browser")
	public void user_launch_a_browser()  {
	//base=new Baseclass();
//	base.launchBrowser(driver);
		//driver=new FirefoxDriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	 nop = new NopcommerceObject(driver);  
	}

	@When("user enter an nopcommerceURL {string}")
	public void user_enter_an_nopcommerce_url(String urlnop) {
	   driver.get(urlnop);
	 
	}

	
	@Then("user should land on nopcommerce login pagettl {string}")
	public void user_should_land_on_nopcommerce_login_pagettl(String Expttl) {
	String actulattl=  driver.getTitle();
	Assert.assertEquals(Expttl, actulattl);
	
	}

	@Then("click on Register")
	public void click_on_register() {
	   nop.clickon_register();
	//   nop.clickonhuman();
	}

	@Then("register title should available")
	public void register_title_should_available(String exp) {
	String actual=  nop.getregisterTittle();
	Assert.assertEquals(exp, actual);
	}

	@Then("select male as gender")
	public void select_male_as_gender() {
	   nop.selectMaleGender();
	}

	@Then("enter a personal details {string}")
	public void enter_a_personal_details(String name) {
	   nop.enterFirstName(name);
	   nop.enterlastName(name);
	   nop.enterEmail(name);
	}

	@Then("enter a company details like {string}")
	public void enter_a_company_details_like(String company) {
	   nop.enterCompanyName(company);
	}

	@Then("under options under select newsletter checkbox")
	public void under_options_under_select_newsletter_checkbox() {
	   nop.select_newsSelect_checkbox();
	}

	@Then("enter a password like {string}")
	public void enter_a_password_like(String pass) {
	 nop.enterPassword(pass);
	}

	@Then("Reenter a password like {string}")
	public void reenter_a_password_like(String repass) {
	    nop.reEnterPassword(repass);
	}

	@Then("click on register button")
	public void click_on_register_button() {
		
	    nop.clickon_RegisterButton();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
