package PageObjects;

import SupportClasses.SeleniumHelper;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageobjectGithub extends SeleniumHelper{

   //Properties
	public WebDriver driver;
	public String PAGE_Title = "Humana for Insurance Brokers and Sales Agents";
	public String PAGE_URL = "https://www.humana.com/agent/";

   //Constructor
	public pageobjectGithub(WebDriver driver) throws MalformedURLException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//New text that has changed
   //Locators --------------------------------------------------------------------------------------------------------------------------------------------------
   //L_1
	@FindBy(how = How.XPATH, using = "//a[@name='https://www.humana.com/agent/products-and-services/individual-and-family/']")
	public WebElement A_Link_V__IndividualsFamilies;
	//Methods -------------------------------------------------------------------
	public void click_A_Link_V__IndividualsFamilies(String clickType){ click(A_Link_V__IndividualsFamilies, clickType); }
	public String getText_A_Link_V__IndividualsFamilies(){ return A_Link_V__IndividualsFamilies.getText();}

   //L_2
	@FindBy(how = How.XPATH, using = "//a[@name='https://www.humana.com/agent/products-and-services/individual-medicare/']")
	public WebElement A_Link_V__IndividualMedicare;
	//Methods -------------------------------------------------------------------
	public void click_A_Link_V__IndividualMedicare(String clickType){ click(A_Link_V__IndividualMedicare, clickType); }
	public String getText_A_Link_V__IndividualMedicare(){ return A_Link_V__IndividualMedicare.getText();}

   //L_3
	@FindBy(how = How.XPATH, using = "//a[@name='https://www.humana.com/agent/products-and-services/group-insurance/']")
	public WebElement A_Link_V__GroupInsurance;
	//Methods -------------------------------------------------------------------
	public void click_A_Link_V__GroupInsurance(String clickType){ click(A_Link_V__GroupInsurance, clickType); }
	public String getText_A_Link_V__GroupInsurance(){ return A_Link_V__GroupInsurance.getText();}

   //L_4
	@FindBy(how = How.XPATH, using = "//a[@title='Why Humana?']")
	public WebElement A_Link_V__WhyHumana;
	//Methods -------------------------------------------------------------------
	public void click_A_Link_V__WhyHumana(String clickType){ click(A_Link_V__WhyHumana, clickType); }
	public String getText_A_Link_V__WhyHumana(){ return A_Link_V__WhyHumana.getText();}

   //L_5
	@FindBy(how = How.XPATH, using = "//a[@name='https://www.humana.com/agent/products-and-services/individual-medicare/3']")
	public WebElement A_Link_V__LearnmoreaboutMedicareplans;
	//Methods -------------------------------------------------------------------
	public void click_A_Link_V__LearnmoreaboutMedicareplans(String clickType){ click(A_Link_V__LearnmoreaboutMedicareplans, clickType); }
	public String getText_A_Link_V__LearnmoreaboutMedicareplans(){ return A_Link_V__LearnmoreaboutMedicareplans.getText();}

   //L_6
	@FindBy(how = How.XPATH, using = "//a[@name='https://www.humana.com/agent/products-and-services/individual-and-family/2']")
	public WebElement A_Link_V__LearnmoreaboutIndividualandFamilyplans;
	//Methods -------------------------------------------------------------------
	public void click_A_Link_V__LearnmoreaboutIndividualandFamilyplans(String clickType){ click(A_Link_V__LearnmoreaboutIndividualandFamilyplans, clickType); }
	public String getText_A_Link_V__LearnmoreaboutIndividualandFamilyplans(){ return A_Link_V__LearnmoreaboutIndividualandFamilyplans.getText();}

   //L_7
	@FindBy(how = How.XPATH, using = "//a[@name='https://www.humana.com/agent/products-and-services/group-insurance/2']")
	public WebElement A_Link_V__LearnmoreaboutGroupInsurancePlans;
	//Methods -------------------------------------------------------------------
	public void click_A_Link_V__LearnmoreaboutGroupInsurancePlans(String clickType){ click(A_Link_V__LearnmoreaboutGroupInsurancePlans, clickType); }
	public String getText_A_Link_V__LearnmoreaboutGroupInsurancePlans(){ return A_Link_V__LearnmoreaboutGroupInsurancePlans.getText();}

   //L_8
	@FindBy(how = How.XPATH, using = "//div[@id='description-4']")
	public WebElement DIV_Text_V__Uniqueextrasthatwillappealtoyourclientsli;
	//Methods -------------------------------------------------------------------
	public String getText_DIV_Text_V__Uniqueextrasthatwillappealtoyourclientsli(){ return DIV_Text_V__Uniqueextrasthatwillappealtoyourclientsli.getText();}

   //L_9
	@FindBy(how = How.XPATH, using = "//div[@id='description-3']")
	public WebElement DIV_Text_V__WewantouragentstosucceedThatswhyweoffer;
	//Methods -------------------------------------------------------------------
	public String getText_DIV_Text_V__WewantouragentstosucceedThatswhyweoffer(){ return DIV_Text_V__WewantouragentstosucceedThatswhyweoffer.getText();}

   //L_10
	@FindBy(how = How.XPATH, using = "//div[@id='description-2']")
	public WebElement DIV_Text_V__Humanascomprehensivesuiteofproductsandspeci;
	//Methods -------------------------------------------------------------------
	public String getText_DIV_Text_V__Humanascomprehensivesuiteofproductsandspeci(){ return DIV_Text_V__Humanascomprehensivesuiteofproductsandspeci.getText();}

   //L_11  
	@FindBy(how = How.XPATH, using = "//div[@id='description-1']")
	public WebElement DIV_Text_V__OurfocusonMedicareissecondtononeAtHumana;
	//Methods -------------------------------------------------------------------
	public String getText_DIV_Text_V__OurfocusonMedicareissecondtononeAtHumana(){ return DIV_Text_V__OurfocusonMedicareissecondtononeAtHumana.getText();}

   //Page Methods --------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyPageTitle(){
		return getPageTitle().contains(PAGE_Title);
	}
	public boolean verifyPageURL(){
		return getPageTitle().contains(PAGE_URL);
	}
	public String getPageTitle(){
		return getPageTitle();
	}
	public String getPageUrl(){
		return getThisPageURL();
	}
}
