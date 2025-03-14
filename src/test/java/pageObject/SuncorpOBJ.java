package pageObject;

public class SuncorpOBJ {
public WebDriver sdriver;

	
	public SuncorpBank_object(WebDriver cdriver) {
		sdriver=cdriver;
		PageFactory.initElements(cdriver, this);
	}
	
	@FindBy(id="img_all_views_965230624790135061") WebElement suncrpLogo;
	@FindBy(linkText="Bank & Save") WebElement bank_text;
	@FindBy(linkText="Home Loans") WebElement Hloan;
	@FindBy(linkText="Business Banking") WebElement Bbanking;
	@FindBy(linkText="About Us") WebElement abouUs;
	@FindBy(linkText="Help & Support") WebElement helpandSupport;
	@FindBy(xpath="//a[@data-event-details=\"Log in\"]") WebElement loginbutton;
	@FindBy(xpath="//a[@class=\"SearchIcon\"]") WebElement search;
	@FindBy(xpath="//li[@class=\"BrandShared-navigation Header-desktop-element\"]") WebElement header;
	
	public void validateContentAvailability() {
	Boolean logo=	suncrpLogo.isDisplayed();
	System.out.println("is it Suncorp logo available : "+logo);
	Boolean bank=bank_text.isDisplayed();
	System.out.println("is it Bank & save LinkedText available : "+bank);
	Boolean loan=Hloan.isDisplayed();
	System.out.println("is it Home loan LinkedText available : "+loan);
	Boolean BsBanking=Bbanking.isDisplayed();
	System.out.println("is it Business Banking LinkedText available : "+BsBanking);
	Boolean auc=abouUs.isDisplayed();
	System.out.println("is it About us LinkedText available : "+auc);
	Boolean hsupport=helpandSupport.isDisplayed();
	System.out.println("is it Help and Support LinkedText available : "+hsupport);
	Boolean lgn=loginbutton.isDisplayed();
	System.out.println("is it Login Button LinkedText available : "+lgn);	
	Boolean srch=search.isDisplayed();
	System.out.println("is it Help and Support LinkedText available : "+srch);	
	
	}
	
	public void getHeaderScreenshot() throws IOException {
	File source=	header.getScreenshotAs(OutputType.FILE);
	File sdest=new File("C:\\Users\\lppaw\\eclipse-workspace\\cucumber\\screenshot\\"+BaseClass.generateRandomnumber()+"SunHeader.png");
	FileHandler.copy(source, sdest);
	System.out.println(sdest);
	}

}
