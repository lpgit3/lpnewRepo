package pageObject;

import java.io.File;
import java.io.IOException;

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



	
	}


