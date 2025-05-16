package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnzObject {
public WebDriver gdriver;

	public AnzObject(WebDriver ldriver){
		gdriver=gdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(linkText="Home loans") WebElement homloan;
	@FindBy(linkText="Apply for pre-approval") WebElement afpp;
	
	
	public void clickon_homeloan() {
		homloan.click();
	}
	
	public void clickonApplyforpreApproval(){
		afpp.click();
	}
	 
	
	
	//then fill the all form
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
