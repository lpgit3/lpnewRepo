package teststeps;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
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



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
