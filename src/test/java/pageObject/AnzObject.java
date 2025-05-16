package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AnzObject {
public WebDriver gdriver;

	public AnzObject(WebDriver ldriver){
		gdriver=gdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(linkText="Home loans") WebElement homloan;
	@FindBy(linkText="Apply for pre-approval") WebElement afpp;
	@FindBy(xpath="//a[@aria-label=\"Apply online\"]") WebElement online;
	@FindBy(xpath="//select[@id=\"reason\"]") WebElement reason;
	@FindBy(xpath="//input[@name=\"oweCurrently\"]") WebElement owecrncy;
	@FindBy(xpath="//input[@name=\"amountBorrow\"]") WebElement amntbrow;
	@FindBy(xpath="//select[@id=\"timeframe\"]") WebElement tmframe;
	@FindBy(id="firstName") WebElement fname;
	@FindBy(id="lastName") WebElement lname;
	@FindBy(id="email") WebElement mail;
	@FindBy(id="postcode") WebElement pcode;
	@FindBy(id="contactNumber") WebElement mnumber;
	@FindBy(id="timeCall") WebElement tmcall;
	@FindBy(xpath="//label[text()=\"No\"]") WebElement exianz;
	@FindBy(id="numberDependants") WebElement ndependent;
	@FindBy(id="numberBorrowers") WebElement numberBorrowers;
	@FindBy(id="employmentStatus1") WebElement employmentStatus1;
	@FindBy(id="employmentStatus2") WebElement employmentStatus2;
	@FindBy(id="employmentTime1") WebElement employmentTime1;
	@FindBy(id="employmentTime2") WebElement employmentTime2;
	@FindBy(id="anzforms-quick-start-application-2-submit") WebElement submit;
	
	public void selectAreYouExistingCustomer() {
		exianz.click();
	}
	
	public void selecttimeCall(int time) {
		Select sl=new Select(tmcall);
		sl.selectByIndex(time);
	}
	
	
	public void enterFirstname(String first) {
		fname.sendKeys(first);
	}
	public void enterLastName(String last) {
		lname.sendKeys(last);
	}
	public void enterEmail(String email) {
		mail.sendKeys(email);
	}
	
	public void enterpostcode(String code) {
		pcode.sendKeys(code);
	}
	
	public void entermobileNuber(String mbile) {
		mnumber.sendKeys(mbile);
	}
	
	
	
	public void selecttimeframe(int timefra) {
		Select sl=new Select(tmframe);
		sl.selectByIndex(timefra);
	}
	
	public void enteramountBorrow(String string) {
		amntbrow.sendKeys(string);
	}
	
	public void enteroweCurrently(String i) {
		owecrncy.sendKeys(i);
	}
	
	public void selectnumberDependants(int numberDepend) {
		Select sl=new Select(numberBorrowers);
		sl.selectByIndex(numberDepend);
	}
	
	
	public void selectnumberBorrowers(int nmbrborrow) {
		Select sl=new Select(numberBorrowers);
		sl.selectByIndex(nmbrborrow);
	}
	
	public void SelectemploymentStatus1(int status1) {
		Select sl=new Select(employmentStatus1);
		sl.selectByIndex(status1);
	}
	
	public void SelectemploymentStatus2(int status2) {
		Select sl=new Select(employmentStatus2);
		sl.selectByIndex(status2);
	}
	
	public void selectemploymentTime1(CharSequence[] int1) {
		employmentTime1.sendKeys(int1);
	}
	
	
	public void selectemploymentTime2(CharSequence etime2) {
		employmentTime2.sendKeys(etime2);
	}
	
	
	public void clickonSubmitButton() {
		submit.click();
	}
	
	public void clickon_homeloan() {
		homloan.click();
	}
	
	public void clickonApplyforpreApproval(){
		afpp.click();
	}
	 
	public void clickonapplyonline() {
		online.click();
	}
	
	public void selectPreApprovalforIwantto(int aa){
		Select sel=new Select(reason);
		sel.selectByIndex(aa);
	}

	
	//then fill the all form
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
