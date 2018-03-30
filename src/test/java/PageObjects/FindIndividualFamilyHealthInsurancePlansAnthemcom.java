

package PageObjects;

import SupportClasses.SeleniumHelper;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindIndividualFamilyHealthInsurancePlansAnthemcom extends SeleniumHelper{

   //Properties
	public WebDriver driver;
	public String PAGE_Title = "Find Individual & Family Health Insurance Plans | Anthem.com";
	public String PAGE_URL = "https://www.anthem.com/individual-and-family/";

   //Constructor
	public FindIndividualFamilyHealthInsurancePlansAnthemcom(WebDriver driver) throws MalformedURLException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	   //Locators --------------------------------------------------------------------------------------------------------------------------------------------------
	   //L_1
		@FindBy(how = How.XPATH, using = "//*[@id='bottomofpage-1439335901455']")
		public WebElement A_Link_V__HealthInsurance;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__HealthInsurance(String clickType){ click(A_Link_V__HealthInsurance, clickType); }
		public String getText_A_Link_V__HealthInsurance(){ return A_Link_V__HealthInsurance.getText();}

	   //L_2
		@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439335451457']")
		public WebElement A_Link_V__DentalInsurance;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__DentalInsurance(String clickType){ click(A_Link_V__DentalInsurance, clickType); }
		public String getText_A_Link_V__DentalInsurance(){ return A_Link_V__DentalInsurance.getText();}

	   //L_3
		@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439335890593']")
		public WebElement A_Link_V__VisionInsurance;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__VisionInsurance(String clickType){ click(A_Link_V__VisionInsurance, clickType); }
		public String getText_A_Link_V__VisionInsurance(){ return A_Link_V__VisionInsurance.getText();}

	   //L_4
		@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439333241163']")
		public WebElement A_Link_V__OurMedicarePlans;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__OurMedicarePlans(String clickType){ click(A_Link_V__OurMedicarePlans, clickType); }
		public String getText_A_Link_V__OurMedicarePlans(){ return A_Link_V__OurMedicarePlans.getText();}

	   //L_5
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/about/')]")
		public WebElement A_Link_V__About;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__About(String clickType){ click(A_Link_V__About, clickType); }
		public String getText_A_Link_V__About(){ return A_Link_V__About.getText();}

	   //L_6
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/blog/')]")
		public WebElement A_Link_V__Blog;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Blog(String clickType){ click(A_Link_V__Blog, clickType); }
		public String getText_A_Link_V__Blog(){ return A_Link_V__Blog.getText();}

	   //L_7
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/privacy/')]")
		public WebElement A_Link_V__Privacy;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Privacy(String clickType){ click(A_Link_V__Privacy, clickType); }
		public String getText_A_Link_V__Privacy(){ return A_Link_V__Privacy.getText();}

	   //L_8
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/legal/')]")
		public WebElement A_Link_V__Legal;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Legal(String clickType){ click(A_Link_V__Legal, clickType); }
		public String getText_A_Link_V__Legal(){ return A_Link_V__Legal.getText();}

	   //L_9
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/sitemap/')]")
		public WebElement A_Link_V__Sitemap;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Sitemap(String clickType){ click(A_Link_V__Sitemap, clickType); }
		public String getText_A_Link_V__Sitemap(){ return A_Link_V__Sitemap.getText();}

	   //L_10
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/accessibility/')]")
		public WebElement A_Link_V__Accessibility;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Accessibility(String clickType){ click(A_Link_V__Accessibility, clickType); }
		public String getText_A_Link_V__Accessibility(){ return A_Link_V__Accessibility.getText();}

	   //L_11
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/nondiscrimination/')]")
		public WebElement A_Link_V__NondiscriminationNotice;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__NondiscriminationNotice(String clickType){ click(A_Link_V__NondiscriminationNotice, clickType); }
		public String getText_A_Link_V__NondiscriminationNotice(){ return A_Link_V__NondiscriminationNotice.getText();}

	   //L_12
		@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439430180745']")
		public WebElement A_Link_V__HealthcareFraudPrevention;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__HealthcareFraudPrevention(String clickType){ click(A_Link_V__HealthcareFraudPrevention, clickType); }
		public String getText_A_Link_V__HealthcareFraudPrevention(){ return A_Link_V__HealthcareFraudPrevention.getText();}

	   //L_13
		@FindBy(how = How.XPATH, using = "//a[@id='bottomofpage-1439335886287']")
		public WebElement A_Link_V__MinorCreditProtectionProgram;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__MinorCreditProtectionProgram(String clickType){ click(A_Link_V__MinorCreditProtectionProgram, clickType); }
		public String getText_A_Link_V__MinorCreditProtectionProgram(){ return A_Link_V__MinorCreditProtectionProgram.getText();}

	   //L_14
		@FindBy(how = How.XPATH, using = "//a[@class='ant-menu-toggle']")
		public WebElement A_Link_V__Menu;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Menu(String clickType){ click(A_Link_V__Menu, clickType); }
		public String getText_A_Link_V__Menu(){ return A_Link_V__Menu.getText();}

	   //L_15
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439337081345']")
		public WebElement A_Link_V__WhattoKnow;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__WhattoKnow(String clickType){ click(A_Link_V__WhattoKnow, clickType); }
		public String getText_A_Link_V__WhattoKnow(){ return A_Link_V__WhattoKnow.getText();}

	   //L_16
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439337955628']")
		public WebElement A_Link_V__GettingBetterCare;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__GettingBetterCare(String clickType){ click(A_Link_V__GettingBetterCare, clickType); }
		public String getText_A_Link_V__GettingBetterCare(){ return A_Link_V__GettingBetterCare.getText();}

	   //L_17
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439337496407']")
		public WebElement A_Link_V__PreventiveHealth;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__PreventiveHealth(String clickType){ click(A_Link_V__PreventiveHealth, clickType); }
		public String getText_A_Link_V__PreventiveHealth(){ return A_Link_V__PreventiveHealth.getText();}

	   //L_18
		@FindBy(how = How.XPATH, using = "//*[@id='mbr-page-wrapper']/div[1]/div/div[2]/div[1]/div/div/div/ul/li[2]/ul[1]/li[4]/a")
		public WebElement A_Link_V__FindaDoctor;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__FindaDoctor(String clickType){ click(A_Link_V__FindaDoctor, clickType); }
		public String getText_A_Link_V__FindaDoctor(){ return A_Link_V__FindaDoctor.getText();}

	   //L_19
		@FindBy(how = How.XPATH, using = "//a[@href='https://www11.anthem.com/pharmacyinformation']")
		public WebElement A_Link_V__SearchMedications;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__SearchMedications(String clickType){ click(A_Link_V__SearchMedications, clickType); }
		public String getText_A_Link_V__SearchMedications(){ return A_Link_V__SearchMedications.getText();}

	   //L_20
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439333241163']")
		public WebElement A_Link_V__MedicarePlans;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__MedicarePlans(String clickType){ click(A_Link_V__MedicarePlans, clickType); }
		public String getText_A_Link_V__MedicarePlans(){ return A_Link_V__MedicarePlans.getText();}

	   //L_21
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/medicare/coverage-and-enrollment/')]")
		public WebElement A_Link_V__MedicareCoverageandEnrollment;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__MedicareCoverageandEnrollment(String clickType){ click(A_Link_V__MedicareCoverageandEnrollment, clickType); }
		public String getText_A_Link_V__MedicareCoverageandEnrollment(){ return A_Link_V__MedicareCoverageandEnrollment.getText();}

	   //L_22
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/medicare/turning-age-65/')]")
		public WebElement A_Link_V__Turning65;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Turning65(String clickType){ click(A_Link_V__Turning65, clickType); }
		public String getText_A_Link_V__Turning65(){ return A_Link_V__Turning65.getText();}

	   //L_23
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/medicare/medicare-advantage-plans/')]")
		public WebElement A_Link_V__MedicareAdvantagePlansPartC;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__MedicareAdvantagePlansPartC(String clickType){ click(A_Link_V__MedicareAdvantagePlansPartC, clickType); }
		public String getText_A_Link_V__MedicareAdvantagePlansPartC(){ return A_Link_V__MedicareAdvantagePlansPartC.getText();}

	   //L_24
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/medicare/medicare-part-d/')]")
		public WebElement A_Link_V__MedicarePartDPlans;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__MedicarePartDPlans(String clickType){ click(A_Link_V__MedicarePartDPlans, clickType); }
		public String getText_A_Link_V__MedicarePartDPlans(){ return A_Link_V__MedicarePartDPlans.getText();}

	   //L_25
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/medicare/medicare-supplement-plans/')]")
		public WebElement A_Link_V__MedicareSupplementPlansMedigap;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__MedicareSupplementPlansMedigap(String clickType){ click(A_Link_V__MedicareSupplementPlansMedigap, clickType); }
		public String getText_A_Link_V__MedicareSupplementPlansMedigap(){ return A_Link_V__MedicareSupplementPlansMedigap.getText();}

	   //L_26
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439419992371']")
		public WebElement A_Link_V__EmployerGroupPlans;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__EmployerGroupPlans(String clickType){ click(A_Link_V__EmployerGroupPlans, clickType); }
		public String getText_A_Link_V__EmployerGroupPlans(){ return A_Link_V__EmployerGroupPlans.getText();}

	   //L_27
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/group-insurance/medical/')]")
		public WebElement A_Link_V__Medical;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Medical(String clickType){ click(A_Link_V__Medical, clickType); }
		public String getText_A_Link_V__Medical(){ return A_Link_V__Medical.getText();}

	   //L_28
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/group-insurance/dental-vision-plans/')]")
		public WebElement A_Link_V__Ancillary;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Ancillary(String clickType){ click(A_Link_V__Ancillary, clickType); }
		public String getText_A_Link_V__Ancillary(){ return A_Link_V__Ancillary.getText();}

	   //L_29
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439337149808']")
		public WebElement A_Link_V__IndividualFamilyPlans;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__IndividualFamilyPlans(String clickType){ click(A_Link_V__IndividualFamilyPlans, clickType); }
		public String getText_A_Link_V__IndividualFamilyPlans(){ return A_Link_V__IndividualFamilyPlans.getText();}

	   //L_30
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439335901455']")
		public WebElement A_Link_V__HealthInsurance_1;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__HealthInsurance_1(String clickType){ click(A_Link_V__HealthInsurance_1, clickType); }
		public String getText_A_Link_V__HealthInsurance_1(){ return A_Link_V__HealthInsurance_1.getText();}

	   //L_31
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439335890593']")
		public WebElement A_Link_V__VisionInsurance_1;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__VisionInsurance_1(String clickType){ click(A_Link_V__VisionInsurance_1, clickType); }
		public String getText_A_Link_V__VisionInsurance_1(){ return A_Link_V__VisionInsurance_1.getText();}

	   //L_32
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439335451457']")
		public WebElement A_Link_V__DentalInsurance_1;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__DentalInsurance_1(String clickType){ click(A_Link_V__DentalInsurance_1, clickType); }
		public String getText_A_Link_V__DentalInsurance_1(){ return A_Link_V__DentalInsurance_1.getText();}

	   //L_33
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439342381066']")
		public WebElement A_Link_V__Medicaid;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Medicaid(String clickType){ click(A_Link_V__Medicaid, clickType); }
		public String getText_A_Link_V__Medicaid(){ return A_Link_V__Medicaid.getText();}

	   //L_34
		@FindBy(how = How.XPATH, using = "//*[@id='mbr-page-wrapper']/div[1]/div/div[2]/div[1]/div/div/div/ul/li[3]/ul[1]/li[9]/ul[1]/li[3]/a")
		public WebElement A_Link_V__Employers;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Employers(String clickType){ click(A_Link_V__Employers, clickType); }
		public String getText_A_Link_V__Employers(){ return A_Link_V__Employers.getText();}

	   //L_35
		@FindBy(how = How.XPATH, using = "//a[contains(@href,'/forms/')]")
		public WebElement A_Link_V__Forms;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Forms(String clickType){ click(A_Link_V__Forms, clickType); }
		public String getText_A_Link_V__Forms(){ return A_Link_V__Forms.getText();}

	   //L_36
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439339360142']")
		public WebElement A_Link_V__ForgotUsernameorPassword;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__ForgotUsernameorPassword(String clickType){ click(A_Link_V__ForgotUsernameorPassword, clickType); }
		public String getText_A_Link_V__ForgotUsernameorPassword(){ return A_Link_V__ForgotUsernameorPassword.getText();}

	   //L_37
		@FindBy(how = How.XPATH, using = "//*[@id='mbr-page-wrapper']/div[1]/div/div[2]/div[1]/div/div/div/ul/li[3]/ul[1]/li[9]/ul[1]/li[1]/a")
		public WebElement A_Link_V__Producers;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Producers(String clickType){ click(A_Link_V__Producers, clickType); }
		public String getText_A_Link_V__Producers(){ return A_Link_V__Producers.getText();}

	   //L_38
		@FindBy(how = How.XPATH, using = "//*[@id='mbr-page-wrapper']/div[1]/div/div[2]/div[1]/div/div/div/ul/li[3]/ul[1]/li[9]/ul[1]/li[2]/a")
		public WebElement A_Link_V__Providers;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__Providers(String clickType){ click(A_Link_V__Providers, clickType); }
		public String getText_A_Link_V__Providers(){ return A_Link_V__Providers.getText();}

	   //L_39
		@FindBy(how = How.XPATH, using = "//a[@id='null-topmenu-1439337682265']")
		public WebElement A_Link_V__ContactUs;
		//Methods -------------------------------------------------------------------
		public void click_A_Link_V__ContactUs(String clickType){ click(A_Link_V__ContactUs, clickType); }
		public String getText_A_Link_V__ContactUs(){ return A_Link_V__ContactUs.getText();}

	   //L_40
		@FindBy(how = How.XPATH, using = "//h1[@class='headline-underline animate']")
		public WebElement H1_Text_V__IndividualFamilyPlans;
		//Methods -------------------------------------------------------------------
		public String getText_H1_Text_V__IndividualFamilyPlans(){ return H1_Text_V__IndividualFamilyPlans.getText();}

	   //L_41
		@FindBy(how = How.XPATH, using = "//html/body[1]/div[2]/div[2]/div[2]/div[3]/div/div/div[1]/ul[1]/li[1]")
		public WebElement LI_Text_V__HealthInsurance;
		//Methods -------------------------------------------------------------------
		public String getText_LI_Text_V__HealthInsurance(){ return LI_Text_V__HealthInsurance.getText();}

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