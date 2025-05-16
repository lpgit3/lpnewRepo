package teststeps;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObject.AnzObject;

public class AnzTest {
public WebDriver driver;
public AnzObject anz;	

@Given("user launch anz chrome browser")
public void user_launch_anz_chrome_browser() {
   WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   anz=new AnzObject(driver);
}

@When("user enter anz url {string}")
public void user_enter_anz_url(String anzurl) {
	driver.get(anzurl);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@When("capture a anz header screenshot")
public void capture_a_anz_header_screenshot() throws IOException {
 File source  = driver.findElement(By.cssSelector("div.hero--control")).getScreenshotAs(OutputType.FILE);
 File dest = new File("C:\\Users\\lppaw\\Desktop\\cucumber 2\\cucumbber\\Screenshot/anzheader.png");
 FileHandler.copy(source, dest);
}

@When("clickon homeloan")
public void clickon_homeloan() {
    anz.clickon_homeloan();
}

@Then("user should land on homeloan page title {string}")
public void user_should_land_on_homeloan_page_title(String Exphomettl) {
 String actualttl=  driver.getTitle();
 Assert.assertEquals(Exphomettl, actualttl);
}

@Then("click on ApplyforpreAproval button")
public void click_on_applyforpre_aproval_button() {
   anz.clickonApplyforpreApproval();
}

@Then("click on ApllyOnline")
public void click_on_aplly_online() {
	try {
   anz.clickonapplyonline();
	}
	catch(StaleElementReferenceException sere) {
		System.out.println("Exception occured : "+sere.getMessage());
	}
}

@Then("select Apply for pre approval for I want to..")
public void select_apply_for_pre_approval_for_i_want_to() {
   anz.selectPreApprovalforIwantto(1);
}

@Then("select {int} for What do you owe on your current home loan\\(s) \\(if any)?")
public void select_for_what_do_you_owe_on_your_current_home_loan_s_if_any(CharSequence[] int1) {
  anz.enteroweCurrently("1");
}

@Then("select {int} for How much do you want to borrow?")
public void select_for_how_much_do_you_want_to_borrow(int int22) {
   anz.enteramountBorrow("2");
}

@Then("select {int} to {int} month for My buying timeframe is…")
public void select_to_month_for_my_buying_timeframe_is(Integer tt, Integer int2) {
   anz.selecttimeframe(tt);
}

@Then("enter a firstname as {string}")
public void enter_a_firstname_as(String fnmae) {
    anz.enterFirstname(fnmae);
}

@Then("enter a lastname as {string}")
public void enter_a_lastname_as(String lname) {
  anz.enterLastName(lname);
}

@Then("enter a email as {string}")
public void enter_a_email_as(String mail) {
  anz.enterEmail(mail);
}

@Then("enter a postcode as {string}")
public void enter_a_postcode_as(String postal) {
  anz.enterpostcode(postal);
}

@Then("enter a phone number as {string}")
public void enter_a_phone_number_as(String number) {
   anz.entermobileNuber(number);
}

@Then("select anytime for Best time for us to call \\(optional)")
public void select_anytime_for_best_time_for_us_to_call_optional() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("select {int} for Number of dependants")
public void select_for_number_of_dependants(Integer int1) {
   anz.selectnumberDependants(int1);
}

@Then("select No for Are you an existing ANZ customer?")
public void select_no_for_are_you_an_existing_anz_customer() {
	anz.selectAreYouExistingCustomer();
}

@Then("select {int} for Number of borrowers")
public void select_for_number_of_borrowers(Integer int1) {
  anz.selectnumberBorrowers(int1);
}

@Then("select full-time for Applicant {int} employment status")
public void select_full_time_for_applicant_employment_status(Integer int1) {
    anz.SelectemploymentStatus1(int1);
}

@Then("select casual for Applicant {int} employment status")
public void select_casual_for_applicant_employment_status(Integer int1) {
    anz.SelectemploymentStatus2(int1);
}

@Then("select {int} for Time in current employment applicant {int}")
public void select_for_time_in_current_employment_applicant(Integer int1, Integer int2) {
   anz.SelectemploymentStatus1(int1);
   anz.SelectemploymentStatus2(int2);
   
}

@Then("click on submit button")
public void click_on_submit_button() {
   anz.clickonSubmitButton();
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
