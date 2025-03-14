package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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








	
	}


