package pageObject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuncorpOBJ {
public WebDriver sdriver;

public SuncorpOBJ(WebDriver ldriver) {
	sdriver=ldriver;
	PageFactory.initElements(ldriver, this);
	
}

@FindBy(xpath="//textarea[@title=\"Search\"]")
WebElement searchtab;

@FindBy(xpath="//input[@value=\"Google Search\"]")
WebElement searchbutton;


public void EnterSearchText(String search) {
	searchtab.sendKeys(search);
}

public void ClickOnSearchButton() {
	searchbutton.click();
}


public String getscreenshot(String name) throws IOException {
	TakesScreenshot scr=((TakesScreenshot)sdriver);
	File source=scr.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\lppaw\\Desktop\\cucumber 2\\cucumbber\\Screenshot\\"+name+".png");
	FileHandler.copy(source, dest);
	String a=dest.toString();
//	System.out.println(a.length());
System.out.println("captured acsreenshot at : "+	a.substring(55));
	return a;
}	

///////////////alert handling
@FindBy(id="alertButton") WebElement alert;



public void clickonalertButton() {
	alert.click();
}


///////////orangeHRM login
@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]") WebElement username;
@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
@FindBy(xpath="//button[@type='submit']") WebElement loginbutton;

public void enterUsername(String user) {
	
	username.sendKeys(user);
}

public void enterpassword(String pass) {
	password.sendKeys(pass);
}

public void clickonLoginButton() {
	loginbutton.click();
}

////////////////  alert popup
@FindBy(xpath="//button[@onclick=\"alertFunction()\"]") WebElement AclickmeButton;
@FindBy(id="output") WebElement outpt;

public void clickon_Clickme_Button() {
	AclickmeButton.click();
	}





public String alertText() {
	Alert aa=	sdriver.switchTo().alert();
String data=aa.getText();
//System.out.println(data);
return data;
}

public void clickon_Alert_OKButton() {
	Alert aa=	sdriver.switchTo().alert();
	aa.accept();
}

public String getAlerrOutPut() {
	return outpt.getText();
}


///////////////////////confirm alert
@FindBy(xpath="//button[@onclick=\"confirmFunction()\"]") WebElement clickmeConfirm;
@FindBy(id="output") WebElement confioutput;

public void clickon_confirmClickMe() {
	clickmeConfirm.click();
}


public String confirmAlertText() {
Alert alert=	sdriver.switchTo().alert();
String confitext=alert.getText();
return confitext;

}

public void clickok_ConfirmBoxOKButton() {
	Alert alert=	sdriver.switchTo().alert();
	alert.accept();
}


public String getconfirmAlertOutput() {
	return confioutput.getText();
} 
























	
	}


