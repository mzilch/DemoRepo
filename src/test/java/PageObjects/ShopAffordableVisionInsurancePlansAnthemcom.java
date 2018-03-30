package PageObjects;

import SupportClasses.SeleniumHelper;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShopAffordableVisionInsurancePlansAnthemcom extends SeleniumHelper{

   //Properties
	public WebDriver driver;
	public String PAGE_Title = "Shop Affordable Vision Insurance Plans | Anthem.com";
	public String PAGE_URL = "https://www.anthem.com/individual-and-family/vision-insurance/";

   //Constructor
	public ShopAffordableVisionInsurancePlansAnthemcom(WebDriver driver) throws MalformedURLException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

   //Locators --------------------------------------------------------------------------------------------------------------------------------------------------
	   //L_1
		@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439337149808']")
		public WebElement A_Link_V__IndividualFamilyPlans;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__IndividualFamilyPlans(String clickType){ click(A_Link_V__IndividualFamilyPlans, clickType); }
		public String getText_A_Link_V__IndividualFamilyPlans(){ return A_Link_V__IndividualFamilyPlans.getText();}

	   //L_2
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/about/')]")
		public WebElement A_Link_V__About;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__About(String clickType){ click(A_Link_V__About, clickType); }
		public String getText_A_Link_V__About(){ return A_Link_V__About.getText();}

	   //L_3
		@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439335886287']")
		public WebElement A_Link_V__MinorCreditProtectionProgram;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__MinorCreditProtectionProgram(String clickType){ click(A_Link_V__MinorCreditProtectionProgram, clickType); }
		public String getText_A_Link_V__MinorCreditProtectionProgram(){ return A_Link_V__MinorCreditProtectionProgram.getText();}

	   //L_4
		@FindBy(how = How.XPATH, using = "//h1[@class='headline-underline animate']")
		public WebElement H1_Text_V__VisionInsurancePlans;
		//Methods -------------------------------------------------------------------
		public String getText_H1_Text_V__VisionInsurancePlans(){wait.until(ExpectedConditions.visibilityOf(H1_Text_V__VisionInsurancePlans)); return H1_Text_V__VisionInsurancePlans.getText();}
		public boolean H1_Text_V__VisionInsurancePlans_isDisplayed(){wait.until(ExpectedConditions.visibilityOf(H1_Text_V__VisionInsurancePlans));return H1_Text_V__VisionInsurancePlans.isDisplayed();}
	   //L_5
		@FindBy(how = How.XPATH, using = "//h3[text()[contains(.,'40% OFF')]]")
		public WebElement H3_Text_V__40OFF;
		//Methods -------------------------------------------------------------------
		public String getText_H3_Text_V__40OFF(){ return H3_Text_V__40OFF.getText();}

	   //L_6
		@FindBy(how = How.XPATH, using = "//h3[text()[contains(.,'20% OFF')]]")
		public WebElement H3_Text_V__20OFF;
		//Methods -------------------------------------------------------------------
		public String getText_H3_Text_V__20OFF(){ return H3_Text_V__20OFF.getText();}

	   //L_7
		@FindBy(how = How.XPATH, using = "//*[@id='mbr-page-wrapper']/div[2]/div[2]/main[1]/div[4]/div/div/div/div/div[1]/div[1]/div/img[1]")
		public WebElement IMG_V____Image_is_AFTER_EyeExamsEyeexamsevery12monthswith;
		//Methods -------------------------------------------------------------------
		public void click_IMG_V____Image_is_AFTER_EyeExamsEyeexamsevery12monthswith(){ IMG_V____Image_is_AFTER_EyeExamsEyeexamsevery12monthswith.click();}

	   //L_8
		@FindBy(how = How.XPATH, using = "//*[@id='mbr-page-wrapper']/div[2]/div[2]/main[1]/div[4]/div/div/div/div/div[1]/div[2]/div/img[1]")
		public WebElement IMG_V____Image_is_AFTER_NewFramesNewframesevery24monthswi;
		//Methods -------------------------------------------------------------------
		public void click_IMG_V____Image_is_AFTER_NewFramesNewframesevery24monthswi(){ IMG_V____Image_is_AFTER_NewFramesNewframesevery24monthswi.click();}

	   //L_9
		@FindBy(how = How.XPATH, using = "//*[@id='mbr-page-wrapper']/div[2]/div[2]/main[1]/div[4]/div/div/div/div/div[1]/div[3]/div/img[1]")
		public WebElement IMG_V____Image_is_AFTER_StandardLensesStandardlensesevery;
		//Methods -------------------------------------------------------------------
		public void click_IMG_V____Image_is_AFTER_StandardLensesStandardlensesevery(){ IMG_V____Image_is_AFTER_StandardLensesStandardlensesevery.click();}

	   //L_10
		@FindBy(how = How.XPATH, using = "//*[@id='mbr-page-wrapper']/div[2]/div[2]/main[1]/div[4]/div/div/div/div/div[1]/div[4]/div/img[1]")
		public WebElement IMG_V____Image_is_AFTER_ContactLensesContactlensesevery24;
		//Methods -------------------------------------------------------------------
		public void click_IMG_V____Image_is_AFTER_ContactLensesContactlensesevery24(){ IMG_V____Image_is_AFTER_ContactLensesContactlensesevery24.click();}

	   //L_11
		@FindBy(how = How.XPATH, using = "//strong[text()[contains(.,'Eye Exams')]]")
		public WebElement STRONG_Text_V__EyeExams;
		//Methods -------------------------------------------------------------------
		public String getText_STRONG_Text_V__EyeExams(){ return STRONG_Text_V__EyeExams.getText();}

	   //L_12
		@FindBy(how = How.XPATH, using = "//strong[text()[contains(.,'New Frames')]]")
		public WebElement STRONG_Text_V__NewFrames;
		//Methods -------------------------------------------------------------------
		public String getText_STRONG_Text_V__NewFrames(){ return STRONG_Text_V__NewFrames.getText();}

	   //L_13
		@FindBy(how = How.XPATH, using = "//strong[text()[contains(.,'Standard Lenses')]]")
		public WebElement STRONG_Text_V__StandardLenses;
		//Methods -------------------------------------------------------------------
		public String getText_STRONG_Text_V__StandardLenses(){ return STRONG_Text_V__StandardLenses.getText();}

	   //L_14
		@FindBy(how = How.XPATH, using = "//strong[text()[contains(.,'Contact Lenses')]]")
		public WebElement STRONG_Text_V__ContactLenses;
		//Methods -------------------------------------------------------------------
		public String getText_STRONG_Text_V__ContactLenses(){ return STRONG_Text_V__ContactLenses.getText();}

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