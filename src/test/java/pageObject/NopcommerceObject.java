package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NopcommerceObject {

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
	
	public void clickon_register() {
		register.click();
	}
	
	public String getregisterTittle() {
		return regttl.getText();
	}
	
	public void selectMaleGender() {
		male.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
