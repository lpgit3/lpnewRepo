package pageObject;

import org.openqa.selenium.Alert;

import org.openqa.selenium.SearchContext;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class TestmoObject {



	public WebDriver gdriver;



	public TestmoObject(WebDriver ldriver) {

		gdriver=ldriver;

		PageFactory.initElements( ldriver, this);

	}



	@FindBy(xpath="//input[@name=\"email\"]") WebElement email;

	@FindBy(xpath="//input[@name=\"password\"]") WebElement pass;

	@FindBy(xpath="//button[text()=\"Log in\"]") WebElement login;

	@FindBy(xpath="//div[@class=\"ui checkbox checked\"]") WebElement remembr;

	@FindBy(xpath="//div[@class=\"avatar__text avatar__text--color2\"]") WebElement userlogo;

	@FindBy(xpath="//div[text()=\"Log out\"]") WebElement logout;



	public Boolean checkAvailabilityofEmailTextField() {

		Boolean mail=	email.isDisplayed();

		return mail;



	}



	public void enterTestnoEmail(String mmail) {

		email.sendKeys(mmail);

	}



	public void checkAvailabilityofPasswordTextField() {

		Boolean pss=pass.isDisplayed();

		System.out.println("Is Password text field available : "+pss);

	}

	public void enterTestmoPassword(String passwrd) {

		pass.sendKeys(passwrd);

	}



	public Boolean checkAvailabilityRememberCheckbox() {

		return remembr.isDisplayed();

	}



	public void clickonRememberCheckbox() {

		remembr.click();

	}



	public Boolean checkAvailabilityLoginButton() {

		return login.isDisplayed();

	}





	public void clickonLoginButton() {

		login.click();

	}



	public void clickonLogOUT() throws InterruptedException {

		userlogo.click();

		Thread.sleep(400);

		logout.click();

	}



	///////////// add project

	@FindBy(xpath="//button[@class=\"ui basic compact button\"]")WebElement project;

	@FindBy(xpath="//div[@class=\"dialog__header__content__title\"]")	WebElement addproTTL;

	@FindBy(xpath="//input[@placeholder=\"Project name\"]")	WebElement proname;

	@FindBy(xpath="//textarea[@data-target=\"note behavior--maxlength-counter.control\"]")	WebElement summery;

	@FindBy(xpath="//i[@class=\"fas fa-caret-down icon-dropdown\"]") WebElement dfltAccess;

	@FindBy(xpath="//div[text()=\"                Tester          \"]") WebElement tester;

	@FindBy(xpath="//a[@data-index=\"1\"]") WebElement user;

	@FindBy(xpath="//table//tbody//tr[2]//td[1]") WebElement userName;

	@FindBy(xpath="//button[@data-action=\"click->doSubmit\"]") WebElement addprojct;



	public void clickon_project_Button() {

		project.click();

	}	



	public String getTitleCreateProject() {

		return addproTTL.getText();

	}	





	public Boolean projectName_available() {

		return proname.isDisplayed();

	}





	public void enterProjectName(String pname) {

		proname.sendKeys(pname);

	}





	public Boolean SummeryTextfield_available() {

		return summery.isDisplayed();

	}





	public void enterSummery(String smmry) {

		summery.sendKeys(smmry);

	}



	public void clickon_dfltAccess() {

		dfltAccess.click();

	}



	public void selectTesterAs_DefaultAccess() {

		tester.click();

	}



	public void clickon_users() {

		user.click();

	}



	public String getProjectName() {

		return userName.getText();

	}





	public void clickon_AddProject_Button() {

		addprojct.click();

	}





	// create test cases

	@FindBy(linkText="Projects") WebElement pro;

	@FindBy(xpath="//img[@draggable=\"false\"]") WebElement selectpro;

	@FindBy(xpath="//div[@class=\"avatar avatar--project  avatar--menu\"][1]") WebElement newpro;

	@FindBy(linkText="Repository") WebElement repostry;

	@FindBy(xpath="//button[@data-target=\"repositories--index.nodataAddCaseButton\"]") WebElement addtest;
	@FindBy(linkText="NewProject") WebElement npro;
@FindBy(xpath="//input[@placeholder=\"Case name\"]") WebElement testnm;
@FindBy(xpath="//br[@data-cke-filler=\"true\"]") WebElement descr;
@FindBy(xpath="//br[@data-cke-filler=\"true\"][1]") WebElement exp;
@FindBy(xpath="//input[@data-target=\"estimate\"]") WebElement esti;
@FindBy(xpath="//div[@class=\"dropdown__content__dropdown-icon\"]") WebElement temtdrop;
@FindBy(xpath="//div[@data-label=\"Case (steps)\"]") WebElement steps;
@FindBy(xpath="//div[@data-label=\"Under review\"]") WebElement state;
@FindBy(xpath="//div[@class=\"dropdown__content__dropdown-icon\"][2]") WebElement statedrop;



public void clickonStateDropdown() {
	statedrop.click();
}
public void selectState() {
	state.click();
}
	public void clickonPProject() {

		npro.click();

	}
public void enterTestcaseName(String name) {
	testnm.sendKeys(name);
}

public void enterDescription(String descri) {
	descr.sendKeys(descri);
}

public void enterExpectedResult(String expcted) {
	exp.sendKeys(expcted);
}

public void clickonTempleteDropdown() {
	temtdrop.click();
}

public void selectCaseStepsTemplete() {
	steps.click();
}

public void enterEstimation(String estimtn) {
	esti.sendKeys(estimtn);
}

	public void selectProject() {

		selectpro.click();



	}



	public void select_newProject() {

		newpro.click();

	}



	public void clickon_Repository() {

		repostry.click();

	}





	public void clickon_AddTest() {

		addtest.click();

	}















}





















