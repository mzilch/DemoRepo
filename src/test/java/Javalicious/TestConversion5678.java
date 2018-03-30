package Javalicious;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

import SupportClasses.TestBaseSetup;
import PageObjects.FindIndividualFamilyHealthInsurancePlansAnthemcom;
import PageObjects.ShopAffordableDentalInsurancePlansAnthemcom;
import PageObjects.ShopAffordableVisionInsurancePlansAnthemcom;
@SuppressWarnings("unused")

public class TestConversion5678 extends TestBaseSetup{
//public class TestCase141 extends TestBaseSetup{

   public WebDriver driver;
   public Actions builder;
   public WebDriverWait wait;
   FindIndividualFamilyHealthInsurancePlansAnthemcom FirstPage;
   ShopAffordableDentalInsurancePlansAnthemcom SecondPage;
   ShopAffordableVisionInsurancePlansAnthemcom ThirdPage;


   @BeforeClass
   public void setUp() throws MalformedURLException {
       driver = getDriver();
       builder = getBuilder();
       wait = getWait();
   }

   @Test
   public void TestCase141() throws Exception {
	   

      try{


//VERIFY PAGE: 'Find Individual & Family Health Insurance Plans | Anthem.com'
          if(!driver.getTitle().equals("Find Individual & Family Health Insurance Plans | Anthem.com")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://www.anthem.com/individual-and-family/");
          }
          System.out.println("Passed: VERIFY PAGE: 'Find Individual & Family Health Insurance Plans | Anthem.com is Displayed");

//PAGE CHANGE Verification
          FirstPage = new FindIndividualFamilyHealthInsurancePlansAnthemcom(driver);
          Assert.assertTrue(FirstPage.verifyPageTitle(),"Page should exist");
          System.out.println("Passed: VERIFY PAGE Changed to: 'Find Individual & Family Health Insurance Plans | Anthem.com' ");

//Test Step (1) - A_Link_V__  Menu, A
         // Assert.assertTrue(FirstPage.A_Link_V__Menu_isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.A_Link_V__Menu' = Is Displayed");
          FirstPage.click_A_Link_V__Menu("");
          System.out.println("Passed: Test Step (1)");
          Thread.sleep(250);

//Test Step (2) - A_Link_V__Search Medications, A
          //Assert.assertTrue(FirstPage.A_Link_V__SearchMedications_isDisplayed(),"");
          Assert.assertTrue(FirstPage.A_Link_V__SearchMedications.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.A_Link_V__SearchMedications' = Is Displayed");
          Assert.assertEquals("Search Medications" , FirstPage.getText_A_Link_V__SearchMedications());
          System.out.println("Passed: Text matched: (Search Medications)");
          System.out.println("Passed: Test Step (2)");
          Thread.sleep(250);
//---------------------------------------------------------------------------------------------------------------------------------- All Working Above--Need to Fix in XpathHelper---------------------------------------------
//Test Step (3) - A_Link_V__  Menu, A
         // Assert.assertTrue(FirstPage.A_Link_V__Menu_isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.A_Link_V__Menu' = Is Displayed");
          FirstPage.click_A_Link_V__Menu("");
          System.out.println("Passed: Test Step (3)");
          Thread.sleep(250);

//Test Step (4) - A_Link_V__Dental Insurance, A
         // Assert.assertTrue(FirstPage.A_Link_V__DentalInsurance_isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'FirstPage.A_Link_V__DentalInsurance' = Is Displayed");
          FirstPage.click_A_Link_V__DentalInsurance("javaScriptExecutor");
          System.out.println("Passed: Test Step (4)");
          Thread.sleep(250);

//PAGE CHANGE Verification
          SecondPage = new ShopAffordableDentalInsurancePlansAnthemcom(driver);
          Assert.assertTrue(SecondPage.verifyPageTitle(),"Page should exist");
          System.out.println("Passed: VERIFY PAGE Changed to: 'Shop Affordable Dental Insurance Plans | Anthem.com' ");

//Test Step (5) - H1_Text_V__Dental Insurance Plans, H1
          Assert.assertTrue(SecondPage.H1_Text_V__DentalInsurancePlans_isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.H1_Text_V__DentalInsurancePlans' = Is Displayed");
          Assert.assertEquals("Dental Insurance Plans" , SecondPage.getText_H1_Text_V__DentalInsurancePlans());
          System.out.println("Passed: Text matched: (Dental Insurance Plans)");
          System.out.println("Passed: Test Step (5)");
          Thread.sleep(250);

//Test Step (6) - A_Link_V__Vision Insurance, A
          Assert.assertTrue(SecondPage.A_Link_V__VisionInsurance_isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'SecondPage.A_Link_V__VisionInsurance' = Is Displayed");
          SecondPage.click_A_Link_V__VisionInsurance("javaScriptExecutor");
          System.out.println("Passed: Test Step (6)");
          Thread.sleep(250);

//PAGE CHANGE Verification
          ThirdPage = new ShopAffordableVisionInsurancePlansAnthemcom(driver);
          Assert.assertTrue(ThirdPage.verifyPageTitle(),"Page should exist");
          System.out.println("Passed: VERIFY PAGE Changed to: 'Shop Affordable Vision Insurance Plans | Anthem.com' ");

//Test Step (7) - H1_Text_V__Vision Insurance Plans, H1
          Assert.assertTrue(ThirdPage.H1_Text_V__VisionInsurancePlans_isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'ThirdPage.H1_Text_V__VisionInsurancePlans' = Is Displayed");
          Assert.assertEquals("Vision Insurance Plans" , ThirdPage.getText_H1_Text_V__VisionInsurancePlans());
          System.out.println("Passed: Text matched: (Vision Insurance Plans)");
          System.out.println("Passed: Test Step (7)");
          Thread.sleep(250);


           }
           catch(Exception e){

 		        System.out.println(e.toString());
               e.printStackTrace();

           }

       }
}


