package example2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;	
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class XPathAssissant_JunitTest {
	
	private RemoteWebDriver driver;
	public String Results = "";
	public int TotalEllymonts = 0; 
	public int TotalPassed = 0;
	public int TotalFailed = 0;
	//public DesiredCapabilities capabilities;
	//public String file;

	//Place	Generated Xpath Code between these //######.... Sets of rows
	//##################################################################################################################	


	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String PAGE_Title = "Current Job Opportunities | CoStrategix";
	public String PAGE_URL = "https://www.costrategix.com/careers";
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	//DOCKER BROWSER @BeforeTest
	//###################################################################################################################
	@BeforeTest
	public void beforeTest() throws Exception {	
 		
		//LOCAL - FIREFOX
	   DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	   capabilities.setCapability("marionette", false);
	   capabilities.setCapability("firefox_binary", new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
	   driver = new FirefoxDriver(capabilities);
		
		
/*		DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability(CapabilityType.VERSION, "");
        caps.setCapability(CapabilityType.PLATFORM, "LINUX");
        driver = new RemoteWebDriver(new URL("http://192.168.99.100:4446/wd/hub"),  caps);*/
        
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
	}	
	
	//LOCAL BROWSER @BeforeTest
	//###################################################################################################################
/*	@BeforeTest
	public void setUp() throws Exception {
	
	String SendBrowserType = "Firefox";
	
	if(SendBrowserType == "Firefox"){
		
    capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("marionette", false);
	//capabilities.setCapability("firefox_binary", new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox exe").getAbsolutePath());
	capabilities.setCapability("firefox_binary",file);
	driver = new FirefoxDriver(capabilities);
		
	}
		
	else if(SendBrowserType == "IE")
		driver = new InternetExplorerDriver();
	else if(SendBrowserType == "Chrome")
		driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.get(PAGE_URL);	
	}*/
	
	@AfterTest
	public void TeatDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test()  throws Exception {
		
		String results;	
		
		// Place the testing generated ArrayList elements and variables here
		//###############################################################################################################
		ArrayList<By> allPageByElements = new ArrayList<By>();
		


		// Created (12/23/2017 10:12:43 AM)


		// Created (12/23/2017 10:18:13 AM)
		By A_Link_NV__Home = By.xpath("//*[@id='menu-item-289']/a");
		By A_Link_NV__Company = By.xpath("//*[@id='menu-item-339']/a");
		By A_Link_NV__Solutions = By.xpath("//*[@id='menu-item-566']/a[1]");
		By A_Link_NV__Strategic_Digital_Solutions = By.xpath("//*[@id='menu-item-854']/a");
		By A_Link_NV__Product_Engineering = By.xpath("//*[@id='menu-item-851']/a");
		By A_Link_NV__IT_Renovation = By.xpath("//*[@id='menu-item-853']/a");
		By A_Link_NV__Emerging_Technology = By.xpath("//*[@id='menu-item-852']/a");
		By A_Link_NV__Work = By.xpath("//*[@id='menu-item-448']/a");
		By A_Link_NV__Thought = By.xpath("//*[@id='menu-item-483']/a");
		By A_Link_NV__Careers = By.xpath("//*[@id='menu-item-347']/a");
		By A_Link_NV__Contact = By.xpath("//*[@id='menu-item-346']/a");
		By A_Link_NV__ = By.xpath("//*[@id='wrap']/header[2]/div[2]/div/div[1]/div[3]/a");
		By A_Link_V__Home = By.xpath("//*[@id='header-menu']/li[1]/a");
		By A_Link_V__Company = By.xpath("//*[@id='header-menu']/li[2]/a");
		By A_Link_V__Solutions = By.xpath("//*[@id='header-menu']/li[3]/a[1]");
		By A_Link_NV__Strategic_Digital_Solutions_1 = By.xpath("//*[@id='header-menu']/li[3]/ul[1]/li[1]/a");
		By A_Link_NV__Product_Engineering_1 = By.xpath("//*[@id='header-menu']/li[3]/ul[1]/li[2]/a");
		By A_Link_NV__IT_Renovation_1 = By.xpath("//*[@id='header-menu']/li[3]/ul[1]/li[3]/a");
		By A_Link_NV__Emerging_Technology_1 = By.xpath("//*[@id='header-menu']/li[3]/ul[1]/li[4]/a");
		By A_Link_V__Work = By.xpath("//*[@id='header-menu']/li[4]/a");
		By A_Link_V__Thought = By.xpath("//*[@id='header-menu']/li[5]/a");
		By A_Link_V__Careers = By.xpath("//*[@id='header-menu']/li[6]/a");
		By A_Link_V__Contact = By.xpath("//*[@id='header-menu']/li[7]/a");
		By A_Link_V__RSS = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/form[1]/div[2]/a[1]");
		By A_Link_V___PHP_LeadCoStrategix_Technologies_Pvt_Lt = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[1]/a");
		By A_Link_V___Senior_PHP_DeveloperCoStrategix_Technol = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[2]/a");
		By A_Link_V___Android_LeadCoStrategix_Technologies_Pv = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[3]/a");
		By A_Link_V___iOS_DeveloperCoStrategix_Technologies_P = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[4]/a");
		By A_Link_V___Java_DeveloperCoStrategix_Technologies = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[5]/a");
		By A_Link_V___Android_DeveloperCoStrategix_Technologi = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[6]/a");
		By A_Link_V___Net_DeveloperCoStrategix_Technologies = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[7]/a");
		By A_Link_V___Senior_Android_DeveloperCoStrategix_Tec = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[8]/a");
		By A_Link_V___Senior_UI_DesignerCoStrategix_LTD_8150 = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[9]/a");
		By A_Link_V___UIUx_DesignerCoStrategix_Technologies = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[10]/a");
		By A_Link_V___CMS_LeadCoStrategix_Technologies_Pvt_Lt = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[11]/a");
		By A_Link_V___Business_AnalystCoStrategix_LTD_8150_C = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/ul[1]/li[12]/a");
		By A_Link_V__Load_more_listings = By.xpath("//*[@id='post-342']/section/div[4]/div/div/div/div/div[1]/a[1]");
		By A_Link_V__facebook = By.xpath("//*[@id='wrap']/footer[1]/div[1]/div/div[1]/a[1]");
		By A_Link_V__twitter = By.xpath("//*[@id='wrap']/footer[1]/div[1]/div/div[1]/a[2]");
		By A_Link_V__vimeo = By.xpath("//*[@id='wrap']/footer[1]/div[1]/div/div[1]/a[3]");
		By A_Link_V___Terms_of_Use = By.xpath("//*[@id='wrap']/footer[1]/div[1]/div/div[2]/a[1]");
		By A_Link_V___Privacy_Notice = By.xpath("//*[@id='wrap']/footer[1]/div[1]/div/div[2]/a[2]");
		By A_Link_V__wrap = By.xpath("//*[@class='page-template-default page page-id-342 unitheme-child wpb-js-composer js-comp-ver-4.5.3 vc_responsive']/a[1]");

		allPageByElements.add(A_Link_NV__Home);
		allPageByElements.add(A_Link_NV__Company);
		allPageByElements.add(A_Link_NV__Solutions);
		allPageByElements.add(A_Link_NV__Strategic_Digital_Solutions);
		allPageByElements.add(A_Link_NV__Product_Engineering);
		allPageByElements.add(A_Link_NV__IT_Renovation);
		allPageByElements.add(A_Link_NV__Emerging_Technology);
		allPageByElements.add(A_Link_NV__Work);
		allPageByElements.add(A_Link_NV__Thought);
		allPageByElements.add(A_Link_NV__Careers);
		allPageByElements.add(A_Link_NV__Contact);
		allPageByElements.add(A_Link_NV__);
		allPageByElements.add(A_Link_V__Home);
		allPageByElements.add(A_Link_V__Company);
		allPageByElements.add(A_Link_V__Solutions);
		allPageByElements.add(A_Link_NV__Strategic_Digital_Solutions_1);
		allPageByElements.add(A_Link_NV__Product_Engineering_1);
		allPageByElements.add(A_Link_NV__IT_Renovation_1);
		allPageByElements.add(A_Link_NV__Emerging_Technology_1);
		allPageByElements.add(A_Link_V__Work);
		allPageByElements.add(A_Link_V__Thought);
		allPageByElements.add(A_Link_V__Careers);
		allPageByElements.add(A_Link_V__Contact);
		allPageByElements.add(A_Link_V__RSS);
		allPageByElements.add(A_Link_V___PHP_LeadCoStrategix_Technologies_Pvt_Lt);
		allPageByElements.add(A_Link_V___Senior_PHP_DeveloperCoStrategix_Technol);
		allPageByElements.add(A_Link_V___Android_LeadCoStrategix_Technologies_Pv);
		allPageByElements.add(A_Link_V___iOS_DeveloperCoStrategix_Technologies_P);
		allPageByElements.add(A_Link_V___Java_DeveloperCoStrategix_Technologies);
		allPageByElements.add(A_Link_V___Android_DeveloperCoStrategix_Technologi);
		allPageByElements.add(A_Link_V___Net_DeveloperCoStrategix_Technologies);
		allPageByElements.add(A_Link_V___Senior_Android_DeveloperCoStrategix_Tec);
		allPageByElements.add(A_Link_V___Senior_UI_DesignerCoStrategix_LTD_8150);
		allPageByElements.add(A_Link_V___UIUx_DesignerCoStrategix_Technologies);
		allPageByElements.add(A_Link_V___CMS_LeadCoStrategix_Technologies_Pvt_Lt);
		allPageByElements.add(A_Link_V___Business_AnalystCoStrategix_LTD_8150_C);
		allPageByElements.add(A_Link_V__Load_more_listings);
		allPageByElements.add(A_Link_V__facebook);
		allPageByElements.add(A_Link_V__twitter);
		allPageByElements.add(A_Link_V__vimeo);
		allPageByElements.add(A_Link_V___Terms_of_Use);
		allPageByElements.add(A_Link_V___Privacy_Notice);
		allPageByElements.add(A_Link_V__wrap);

		
		//###############################################################################################################		
		
		results = ValidateAll_ByElements(allPageByElements);			
		System.out.println(results);
		System.out.println("Total Elements to be 'Validated': " + TotalEllymonts);
		System.out.println("Total Elements 'Passed' Validation: " + TotalPassed);
		System.out.println("Total Elements 'Failed' Validation: " + TotalFailed);
		System.out.println(driver.getWindowHandle());
	}

	public String ValidateAll_ByElements(ArrayList<By> InAllByList) {
		TotalEllymonts = InAllByList.size();
		
		try{
			
				for (int i=1; i<=InAllByList.size(); i++)
				{   
					int numberOfInstances = getWebElement_InstanceCount(InAllByList.get(i-1));
					WebElement EllyMont = getWebElement_BY(InAllByList.get(i-1));
					//WebElement EllyMont = driver.findElement(InAllByList.get(i-1));
				    			    	
				    if(numberOfInstances == 1)
				    {   
				    	TotalPassed++;
					   // Results += EllyMont.toString()+ "\nPassed " + i + " - element is Displayed\n--";
					   // scolling to the webelement
				    	Results += EllyMont.toString()+ "\nPassed "  + i + " - xpath returned '" + numberOfInstances + "' instance\n--";
					   // scrolltoElement(EllyMont);
					    
					   // flash(EllyMont,driver);
				    }
					else if	(numberOfInstances != 1 && EllyMont == null)
					{
						TotalFailed++;
					    Results += "  " + InAllByList.get(i-1).toString()+  "\nFailed "  + i + " - xpath returned '" + numberOfInstances + "' instances\n--";					    
					}				    
				}    	
				return Results;	
		}
		catch (Exception ex)
		{
			return Results += ex.getMessage();				
		}
	}
	
	@SuppressWarnings("finally")
	public int getWebElement_InstanceCount(By InByEllyMont) {
	    //WebElement webElement = null;
	    int numberOfWebElements = 0;
	    try {
	    	
	    	List<WebElement> asdf = driver.findElements(InByEllyMont);
	    	numberOfWebElements = asdf.size();	
	       // webElement = driver.findElement(InByEllyMont); 
	    } 	    
	    catch (NoSuchElementException ex) {
	    	Results += "WebElement at this Xpath: '" + InByEllyMont.toString() + "' does not exist. NoSuchElementException was thrown";        
	    }
	    catch (ElementNotVisibleException ex1) {
	    	Results += "WebElement at this Xpath: '" + InByEllyMont.toString() + "' is not Visible. ElementNotVisibleException was thrown";	        
	    }
	    catch (StaleElementReferenceException ex2) {
	    	Results += "WebElement at this Xpath: '" + InByEllyMont.toString() + "' is in Stale state. StaleElementReferenceException was thrown";	        
	    }
	    catch (Exception exGeneral) {
	    	Results += "General Exception caught:\n'" + exGeneral.getMessage() + "'";	        
	    }
	    
	    finally{
	    	return numberOfWebElements;
	    }
	   
	}
	
	@SuppressWarnings("finally")
	public WebElement getWebElement_BY(By InByEllyMont) {
	    WebElement webElement = null;
	    
	    try {
	    	
	    	//List<WebElement> asdf = driver.findElements(InByEllyMont);
	    	//numberOfWebElements = asdf.size();	
	        webElement = driver.findElement(InByEllyMont); 
	    } 	    
	    catch (NoSuchElementException ex) {
	    	Results += "WebElement at this Xpath: '" + InByEllyMont.toString() + "' does not exist. NoSuchElementException was thrown";        
	    }
	    catch (ElementNotVisibleException ex1) {
	    	Results += "WebElement at this Xpath: '" + InByEllyMont.toString() + "' is not Visible. ElementNotVisibleException was thrown";	        
	    }
	    catch (StaleElementReferenceException ex2) {
	    	Results += "WebElement at this Xpath: '" + InByEllyMont.toString() + "' is in Stale state. StaleElementReferenceException was thrown";	        
	    }
	    catch (Exception exGeneral) {
	    	Results += "General Exception caught:\n'" + exGeneral.getMessage() + "'";	        
	    }	    
	    
	    finally{
	    	return webElement;
	    }
	   
	}
	//method to scroll
	public static void scrolltoElement(WebElement ScrolltoThisElement) {
	Coordinates coordinate = ((Locatable) ScrolltoThisElement)
	.getCoordinates();
	coordinate.onPage();
	coordinate.inViewPort();
	}
	
    public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  2; i++) {
            changeColor("rgb(0,200,0)", element, js);
            changeColor(bgcolor, element, js);
        }
    }
    public static void changeColor(String color, WebElement element,  JavascriptExecutor js) {
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(40);
        }  catch (InterruptedException e) {
        }
     }
	
/*	private JavascriptExecutor js = (JavascriptExecutor)driver;
	private WebElement lastElem = null;
	private String lastBorder = null;

	private static final String SCRIPT_GET_ELEMENT_BORDER;
	private static final String SCRIPT_UNHIGHLIGHT_ELEMENT;*/

/*	void highlightElement(WebElement elem) {
	    unhighlightLast();

	    // remember the new element
	    lastElem = elem;
	    lastBorder = (String)(js.executeScript(SCRIPT_GET_ELEMENT_BORDER, elem));
	    
	    
	    
	}

	void unhighlightLast() {
	    if (lastElem != null) {
	        try {
	            // if there already is a highlighted element, unhighlight it
	            js.executeScript(SCRIPT_UNHIGHLIGHT_ELEMENT, lastElem, lastBorder);
	        } catch (StaleElementReferenceException ignored) {
	            // the page got reloaded, the element isn't there
	        } finally {
	            // element either restored or wasn't valid, nullify in both cases
	            lastElem = null;
	        }
	    }
	}*/
	
	
	
	
	
	
	
	
	
	
	
	public String ValidateAll_WebElements(ArrayList<WebElement> InAllWebElementList,WebDriverWait wait) {
		
		//allWebElementXpaths = InAllWebElementList;
		String Results = "";

		for (int i=1; i<=InAllWebElementList.size(); i++)
		{ 	   
		    //Waiting for the element to be visible
		    //Used (i-1) because the list's item start with 0th index, like in an array
			WebElement EllyMont = (WebElement) InAllWebElementList.get(i-1);
		    wait.until(ExpectedConditions.visibilityOf(EllyMont));

		    if(EllyMont.isDisplayed())
		    {
		    	Results += i + " element is Displayed\t--";
		    	System.out.print(EllyMont.toString());		    	
		    }
		    else	
		    {
		    	Results += i + " element is NOT Displayed\t--";
		    	System.out.print(EllyMont.toString());
		    }
		} 		
		return Results;		
	}
	
	public String ValidateAll_StringXpaths(ArrayList<String> InAllStringXpathList,WebDriverWait wait) {
		
		//allStringXpaths = InAllStringXpathList;
		String Results = "";

		for (int i=1; i<=InAllStringXpathList.size(); i++)
		{ 	   
		    //Waiting for the element to be visible
		    //Used (i-1) because the list's item start with 0th index, like in an array
			WebElement EllyMont = (WebElement) By.xpath(InAllStringXpathList.get(i-1));
		    wait.until(ExpectedConditions.visibilityOf(EllyMont));

		    if(EllyMont.isDisplayed())
		    {
		    	Results += i + " element is Displayed\t--";
		    	System.out.print(EllyMont.toString());		    	
		    }
		    else	
		    {
		    	Results += i + " element is NOT Displayed\t--";
		    	System.out.print(EllyMont.toString());
		    }
		} 		
		return Results;		
	}
	
	public String ValidateAll_PageFactoryXpaths(ArrayList<PageFactory> InAllPageFactoryXpathList,WebDriverWait wait) {
		
		//allPageFactoryXpaths = InAllPageFactoryXpathList;
		String Results = "";

		for (int i=1; i<=InAllPageFactoryXpathList.size(); i++)
		{ 	   
		    //Waiting for the element to be visible
		    //Used (i-1) because the list's item start with 0th index, like in an array
			WebElement EllyMont = (WebElement) InAllPageFactoryXpathList.get(i-1);
		    wait.until(ExpectedConditions.visibilityOf(EllyMont));

		    if(EllyMont.isDisplayed())
		    {
		    	Results += i + " element is Displayed\t--";
		    	System.out.print(EllyMont.toString());		    	
		    }
		    else	
		    {
		    	Results += i + " element is NOT Displayed\t--";
		    	System.out.print(EllyMont.toString());
		    }
		} 		
		return Results;		
	}

}
	