

package PageObjects;

import SupportClasses.SeleniumHelper;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShopAffordableDentalInsurancePlansAnthemcom extends SeleniumHelper{

   //Properties
	public WebDriver driver;
	public String PAGE_Title = "Shop Affordable Dental Insurance Plans | Anthem.com";
	public String PAGE_URL = "https://www.anthem.com/individual-and-family/dental-insurance/";

   //Constructor
	public ShopAffordableDentalInsurancePlansAnthemcom(WebDriver driver) throws MalformedURLException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

   //Locators --------------------------------------------------------------------------------------------------------------------------------------------------
   //L_1
	   //L_1
		@FindBy(how = How.XPATH, using = "//a[text()[contains(.,'Without insurance')]]")
		public WebElement A_Link_V__Withoutinsurance;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Withoutinsurance(String clickType){ click(A_Link_V__Withoutinsurance, clickType); }
		public String getText_A_Link_V__Withoutinsurance(){ return A_Link_V__Withoutinsurance.getText();}

	   //L_2
		@FindBy(how = How.XPATH, using = "//a[text()[contains(.,'With insurance')]]")
		public WebElement A_Link_V__Withinsurance;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Withinsurance(String clickType){ click(A_Link_V__Withinsurance, clickType); }
		public String getText_A_Link_V__Withinsurance(){ return A_Link_V__Withinsurance.getText();}

	   //L_3
		@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439335890593']")
		public WebElement A_Link_V__VisionInsurance;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__VisionInsurance(String clickType){ click(A_Link_V__VisionInsurance, clickType); }
		public String getText_A_Link_V__VisionInsurance(){wait.until(ExpectedConditions.visibilityOf(A_Link_V__VisionInsurance)); return A_Link_V__VisionInsurance.getText();}
		public boolean A_Link_V__VisionInsurance_isDisplayed(){wait.until(ExpectedConditions.visibilityOf(A_Link_V__VisionInsurance)); return A_Link_V__VisionInsurance.isDisplayed();}
	   //L_4
		@FindBy(how = How.XPATH, using = "//*[@id='tab-without']/div/div[5]")
		public WebElement DIV_Text_V__PartialDentures$1402;
		//Methods -------------------------------------------------------------------
		public String getText_DIV_Text_V__PartialDentures$1402(){ return DIV_Text_V__PartialDentures$1402.getText();}

	   //L_5
		@FindBy(how = How.XPATH, using = "//*[@id='tab-without']/div/div[4]")
		public WebElement DIV_Text_V__Dentures$1180;
		//Methods -------------------------------------------------------------------
		public String getText_DIV_Text_V__Dentures$1180(){ return DIV_Text_V__Dentures$1180.getText();}

	   //L_6
		@FindBy(how = How.XPATH, using = "//*[@id='tab-without']/div/div[2]")
		public WebElement DIV_Text_V__RootCanal$1270;
		//Methods -------------------------------------------------------------------
		public String getText_DIV_Text_V__RootCanal$1270(){ return DIV_Text_V__RootCanal$1270.getText();}

	   //L_7
		@FindBy(how = How.XPATH, using = "//*[@id='tab-without']/div/div[1]")
		public WebElement DIV_Text_V__RoutineAdultCleaning$124;
		//Methods -------------------------------------------------------------------
		public String getText_DIV_Text_V__RoutineAdultCleaning$124(){ return DIV_Text_V__RoutineAdultCleaning$124.getText();}

	   //L_8
		@FindBy(how = How.XPATH, using = "//h1[@class='headline-underline animate']")
		public WebElement H1_Text_V__DentalInsurancePlans;
		//Methods -------------------------------------------------------------------
		public String getText_H1_Text_V__DentalInsurancePlans(){wait.until(ExpectedConditions.visibilityOf(H1_Text_V__DentalInsurancePlans)); return H1_Text_V__DentalInsurancePlans.getText();}
		public boolean H1_Text_V__DentalInsurancePlans_isDisplayed(){wait.until(ExpectedConditions.visibilityOf(H1_Text_V__DentalInsurancePlans)); return H1_Text_V__DentalInsurancePlans.isDisplayed();}
		
	   //L_9
		@FindBy(how = How.XPATH, using = "//*[@id='tab-without']/div/div[1]/h4[1]")
		public WebElement H4_Text_V__$124;
		//Methods -------------------------------------------------------------------
		public String getText_H4_Text_V__$124(){ return H4_Text_V__$124.getText();}

	   //L_10
		@FindBy(how = How.XPATH, using = "//*[@id='tab-without']/div/div[2]/h4[1]")
		public WebElement H4_Text_V__$1270;
		//Methods -------------------------------------------------------------------
		public String getText_H4_Text_V__$1270(){ return H4_Text_V__$1270.getText();}

	   //L_11
		@FindBy(how = How.XPATH, using = "//*[@id='tab-without']/div/div[4]/h4[1]")
		public WebElement H4_Text_V__$1180;
		//Methods -------------------------------------------------------------------
		public String getText_H4_Text_V__$1180(){ return H4_Text_V__$1180.getText();}

	   //L_12
		@FindBy(how = How.XPATH, using = "//*[@id='tab-without']/div/div[5]/h4[1]")
		public WebElement H4_Text_V__$1402;
		//Methods -------------------------------------------------------------------
		public String getText_H4_Text_V__$1402(){ return H4_Text_V__$1402.getText();}

	   //L_13
		@FindBy(how = How.XPATH, using = "//*[@id='tab-with']/div/div[1]/h4[1]")
		public WebElement H4_Text_V__$69;
		//Methods -------------------------------------------------------------------
		public String getText_H4_Text_V__$69(){ return H4_Text_V__$69.getText();}

	   //L_14
		@FindBy(how = How.XPATH, using = "//*[@id='tab-with']/div/div[2]/h4[1]")
		public WebElement H4_Text_V__$765;
		//Methods -------------------------------------------------------------------
		public String getText_H4_Text_V__$765(){ return H4_Text_V__$765.getText();}

	   //L_15
		@FindBy(how = How.XPATH, using = "//*[@id='tab-with']/div/div[4]/h4[1]")
		public WebElement H4_Text_V__$808;
		//Methods -------------------------------------------------------------------
		public String getText_H4_Text_V__$808(){ return H4_Text_V__$808.getText();}

	   //L_16
		@FindBy(how = How.XPATH, using = "//*[@id='tab-with']/div/div[5]/h4[1]")
		public WebElement H4_Text_V__$902;
		//Methods -------------------------------------------------------------------
		public String getText_H4_Text_V__$902(){ return H4_Text_V__$902.getText();}


   //Page Methods --------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyPageTitle(){
		return getThisPageTitle().contains(PAGE_Title);
	}
	public boolean verifyPageURL(){
		return getThisPageTitle().contains(PAGE_URL);
	}
	public String getPageTitle(){
		return getThisPageTitle();
	}
	public String getPageUrl(){
		return getThisPageURL();
	}
}