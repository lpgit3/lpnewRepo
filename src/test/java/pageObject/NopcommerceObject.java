package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopcommerceObject {

	public WebDriver gdriver;
	
	
	public NopcommerceObject(WebDriver ldriver) {
		gdriver=ldriver;
		PageFactory.initElements(ldriver,this );
	}

	
	@FindBy(linkText="Register") WebElement register;
	@FindBy(xpath="//div[@class=\"page-title\"][2]") WebElement regttl;
	@FindBy(xpath="//label[text()=\"Male\"]") WebElement male;
	@FindBy(id="FirstName") WebElement fname;
	@FindBy(id="LastName") WebElement lname;
	@FindBy(id="Email") WebElement mail;
	@FindBy(id="Company") WebElement cname;
	@FindBy(id="Newsletter") WebElement nletter;
	@FindBy(id="Password") WebElement pass;
	@FindBy(id="ConfirmPassword") WebElement confipass;
	@FindBy(id="register-button") WebElement rbutton;
	@FindBy(xpath="//label[@class=\"cb-lb\"]") WebElement chrck;
	
	public void clickonhuman() {
		chrck.click();
	}
	public void clickon_register() {
		register.click();
	}
	
	public String getregisterTittle() {
		return regttl.getText();
	}
	
	public void selectMaleGender() {
		male.click();
	}
	
	public void enterFirstName(String name) {
		fname.sendKeys(name);
	}
	
	public void enterlastName(String lastname) {
		lname.sendKeys(lastname);
	}
	
	public void enterEmail(String email) {
		mail.sendKeys(email);
	}
	
	public void enterCompanyName(String cmpny) {
		cname.sendKeys(cmpny);
	}
	
	public void select_newsSelect_checkbox() {
		nletter.click();
	}
	
	public void enterPassword(String passwrd) {
		pass.sendKeys(passwrd);
	}
	
	public void reEnterPassword(String cpcpass) {
		confipass.sendKeys(cpcpass);
	}
	
	public void clickon_RegisterButton() {
		rbutton.click();
	}
	
	
	
	
	
}
