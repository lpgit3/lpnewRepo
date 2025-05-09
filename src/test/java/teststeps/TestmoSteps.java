package teststeps;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

//import org.testng.Assert;



import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObject.TestmoObject;



public class TestmoSteps {


	public WebDriver driver;

	public TestmoObject test;





	@Given("user launch a testmoEdge browser")

	public void user_launch_a_testmo_edge_browser() {

		WebDriverManager.chromedriver().setup();

		driver= new ChromeDriver();

		test= new TestmoObject(driver);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}





	@When("user enter Testmo login URL {string}")

	public void user_enter_testmo_login_url(String testmoURL) {

		driver.get(testmoURL);

	}





	@Then("user should land on login page title {string}")

	public void user_should_land_on_login_page_title(String expttl) {

		String aclTTL=   driver.getTitle();

		Assert.assertEquals(aclTTL, expttl);

	}





	@Then("validate Email text field available")

	public void validate_email_text_field_available() {

		System.out.println("Is email Text field Available : "+test.checkAvailabilityofEmailTextField());



	}



	@Then("enter a valid email as {string}")

	public void enter_a_valid_email_as(String testmomail) {

		test.enterTestnoEmail(testmomail);

	}





	@Then("validate Password text field available")

	public void validate_password_text_field_available() {

		test.checkAvailabilityofPasswordTextField();

	}





	@Then("enter a valid Pass as {string}")

	public void enter_a_valid_pass_as(String passwrd) {

		test.enterTestmoPassword(passwrd);

	}



	@Then("validate checkbox of {string} available")

	public void validate_checkbox_of_available(String string) {

		System.out.println("Is Remember checkbox field Available : "+test.checkAvailabilityRememberCheckbox());

	}





	@Then("select a checkbox")

	public void select_a_checkbox() {

		test.clickonRememberCheckbox();

	}





	@Then("validate testmo login button available")

	public void validate_testmo_login_button_available() {

		System.out.println("Is Login button field Available : "+test.checkAvailabilityLoginButton());

	}





	@Then("click on TestmoLogin button")

	public void click_on_testmo_login_button() {

		test.clickonLoginButton();

	}



	@Then("user should land on testmo home pahe title {string}")

	public void user_should_land_on_testmo_home_pahe_title(String ExpHomeTttl) {

		String aclTTL1=   driver.getTitle();

		Assert.assertEquals(aclTTL1, ExpHomeTttl);

	}



	@Then("click on LogoutButton")

	public void click_on_logout_button() throws InterruptedException {

		test.clickonLogOUT();

	}





	@Then("close testmo browser")

	public void close_testmo_browser() {

		driver.close();

		driver.quit();

	}



	///////// create project

	@When("click on project button")

	public void click_on_project_button() {

		test.clickonPProject();

		test.clickon_project_Button();

	}



	@Then("get Title of add project")

	public void get_title_of_add_project() {

		test.getTitleCreateProject();

	}



	@Then("project name field should available under project")

	public void project_name_field_should_available_under_project() {

		System.out.println("Is Project name text field available : "+test.projectName_available());

	}



	@Then("enter a project name as {string}")

	public void enter_a_project_name_as(String proname) {

		test.enterProjectName(proname);

	}



	@Then("project Summery text field should available under project")

	public void project_summery_text_field_should_available_under_project() {

		System.out.println("Is summery text field available : "+test.SummeryTextfield_available());

	}



	@Then("enter a summery for project as {string}")

	public void enter_a_summery_for_project_as(String summery) {

		test.enterSummery(summery);

	}



	@Then("select tester as default access")

	public void select_tester_as_default_access() throws InterruptedException {

		test.clickon_dfltAccess();

		Thread.sleep(900);

		test.clickon_dfltAccess();

	}



	@When("click on users")

	public void click_on_users() {

		test.clickon_users();

	}



	@Then("project ttitle should available under users")

	public void project_ttitle_should_available_under_users() {

		System.out.println("Existing available Project name : "+test.getProjectName());

	}



	@When("click on createProject button")

	public void click_on_create_project_button() {

		test.clickon_AddProject_Button();

	}



	////// create test cases

	@When("select a new created NewProject project")

	public void select_a_new_created_new_project_project() {

		test.clickonPProject();

	//	test.select_newProject();

	}



	@When("click on repository")

	public void click_on_repository() {

		test.clickon_Repository();

	}



	@When("click on add test case button")

	public void click_on_add_test_case_button() {

		test.clickon_AddTest();

	}



	@When("enter a test case name as {string}")

	public void enter_a_test_case_name_as(String testname) {
test.enterTestcaseName(testname);
	}



	@When("enter a test case description as {string}")

	public void enter_a_test_case_description_as(String descripn) {
test.enterDescription(descripn);
	}



	@When("enter a test case Expected result as {string}")

	public void enter_a_test_case_expected_result_as(String expResult) {
		test.enterExpectedResult(expResult);

	}



	@When("enter an Estimate as {string}")

	public void enter_an_estimate_as(String estimatiion) {
test.enterEstimation(estimatiion);
	}



	@When("select Case\\(steps) as Templete")

	public void select_case_steps_as_templete() throws InterruptedException {
test.clickonTempleteDropdown();
Thread.sleep(200);
//test.selectCaseStepsTemplete();
	}



	@When("select state as Active")

	public void select_state_as_active() {
test.clickon_AddProject_Button();
	test.selectState();

	}



	@When("select High priority")

	public void select_high_priority() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}



	@When("click on addCase")

	public void click_on_add_case() {

		// Write code here that turns the phrase above into concrete actions

		throw new io.cucumber.java.PendingException();

	}














































}
