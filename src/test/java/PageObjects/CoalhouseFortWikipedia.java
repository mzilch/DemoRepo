package PageObjects;

import SupportClasses.SeleniumHelper;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CoalhouseFortWikipedia extends SeleniumHelper{

   //Properties
	public WebDriver driver;
	public String PAGE_Title = "Coalhouse Fort - Wikipedia";
	public String PAGE_URL = "https://en.wikipedia.org/wiki/Coalhouse_Fort";

   //Constructor
	public CoalhouseFortWikipedia(WebDriver driver) throws MalformedURLException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

   //Locators --------------------------------------------------------------------------------------------------------------------------------------------------
   //L_1
	@FindBy(how = How.XPATH, using = "//a[@title='Thames']")
	private WebElement Thames;
	//Methods -------------------------------------------------------------------
	public void click_Thames(String clickType){ click(Thames, clickType); }
	public String getText_Thames(){ return Thames.getText();}

   //L_2
	@FindBy(how = How.XPATH, using = "//*[@id='mw-content-text']/div[1]/p[1]/a[2]")
	private WebElement Essex;
	//Methods -------------------------------------------------------------------
	public void click_Essex(String clickType){ click(Essex, clickType); }
	public String getText_Essex(){ return Essex.getText();}

   //L_3
	@FindBy(how = How.XPATH, using = "//*[@id='mw-content-text']/div[1]/p[1]/a[3]")
	private WebElement East_Tilbury;
	//Methods -------------------------------------------------------------------
	public void click_East_Tilbury(String clickType){ click(East_Tilbury, clickType); }
	public String getText_East_Tilbury(){ return East_Tilbury.getText();}

   //L_4
	@FindBy(how = How.XPATH, using = "//a[@title='Casemate']")
	private WebElement casemates;
	//Methods -------------------------------------------------------------------
	public void click_casemates(String clickType){ click(casemates, clickType); }
	public String getText_casemates(){ return casemates.getText();}

   //L_5
	@FindBy(how = How.XPATH, using = "//h1[@id='firstHeading']")
	private WebElement Coalhouse_Fort;
	//Methods -------------------------------------------------------------------
	public String getText_Coalhouse_Fort(){ return Coalhouse_Fort.getText();}

   //L_6
	@FindBy(how = How.XPATH, using = "//img[@alt='View of the front exterior of the fort showing an arc of casemates, with a structure on the roof']")
	private WebElement Viewofthefrontexteriorofthefortshowinganarcofcasem;
	//Methods -------------------------------------------------------------------
	public void click_Viewofthefrontexteriorofthefortshowinganarcofcasem(){ Viewofthefrontexteriorofthefortshowinganarcofcasem.click();}

   //Page Methods --------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyPageTitle(){
		return getPageTitle().contains(PAGE_Title);
	}
	public boolean verifyPageURL(){
		return getPageTitle().contains(PAGE_URL);
	}
	public String getPageTitle(){
		return getThisPageTitle();
	}
	public String getPageUrl(){
		return getThisPageURL();
	}
}