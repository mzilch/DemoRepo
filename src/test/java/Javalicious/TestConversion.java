package Javalicious;

import org. junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
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

@SuppressWarnings("unused")

public class TestConversion{
//public class TestCase311{

   public WebDriver driver;
   public Actions builder;
   public WebDriverWait wait;


   @Before
   public void Before() throws Exception{

       driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
       builder = new Actions(driver);
       wait = new WebDriverWait(driver, 10);

   }
   @Test
   public void TestCase311() throws Exception {

      try{


 	//VERIFY PAGE: 'Anthem Individual and Family'
          if(!driver.getTitle().equals("Anthem Individual and Family")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://www.masonite.com/");
          }
          System.out.println("Passed: VERIFY PAGE: 'Anthem Individual and Family is Displayed");

 	//VERIFY PAGE Once test has started: 'Home | Masonite'
          if(!driver.getTitle().equals("Home | Masonite")); {
          System.out.println("Passed: VERIFY PAGE: 'Home | Masonite' = is Displayed");
          }

 	//Test Step (1) - LI_Text_V__ResidentialDoor designs for your home, LI
          WebElement LI_Text_V__ResidentialDoordesignsforyourhome = driver.findElement(By.xpath("xpath_text_starts_with|//*[contains(text(),'Resid')]"));
          wait.until(ExpectedConditions.visibilityOf(LI_Text_V__ResidentialDoordesignsforyourhome));
          Assert.assertTrue("Element should exist", LI_Text_V__ResidentialDoordesignsforyourhome.isDisplayed());
          System.out.println("Passed: Element should exist: 'LI_Text_V__ResidentialDoordesignsforyourhome' = Is Displayed");
          builder.moveToElement(LI_Text_V__ResidentialDoordesignsforyourhome).perform();
          Thread.sleep(1000);
          System.out.println("Passed: Test Step (1)");

 	//Test Step (2) - A_Link_V__ Homeowner, A
          WebElement A_Link_V__Homeowner = driver.findElement(By.xpath("xpath_text_contains_all|//*[contains(text(),'Homeowner')]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Homeowner));
          Assert.assertTrue("Element should exist", A_Link_V__Homeowner.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__Homeowner' = Is Displayed");
          String stringValue_2 = A_Link_V__Homeowner.getText().trim();
          Assert.assertEquals("Homeowner" , stringValue_2);
          System.out.println("Passed: Text matched: ('Homeowner')");
          System.out.println("Passed: Test Step (2)");

 	//Test Step (3) - A_Link_V__ Professional, A
          WebElement A_Link_V__Professional = driver.findElement(By.xpath("xpath_attr_href2|//a[contains(@href,'/residential/professional')]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Professional));
          Assert.assertTrue("Element should exist", A_Link_V__Professional.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__Professional' = Is Displayed");
          String stringValue_3 = A_Link_V__Professional.getText().trim();
          Assert.assertEquals("Professional" , stringValue_3);
          System.out.println("Passed: Text matched: ('Professional')");
          System.out.println("Passed: Test Step (3)");

 	//Test Step (4) - H4_Text_V__Residential, H4
          WebElement H4_Text_V__Residential = driver.findElement(By.xpath("xpath_text_first_1_word|//h4[text()[contains(.,'Residential')]]"));
          wait.until(ExpectedConditions.visibilityOf(H4_Text_V__Residential));
          Assert.assertTrue("Element should exist", H4_Text_V__Residential.isDisplayed());
          System.out.println("Passed: Element should exist: 'H4_Text_V__Residential' = Is Displayed");
          String stringValue_4 = H4_Text_V__Residential.getText().trim();
          Assert.assertEquals("Residential" , stringValue_4);
          System.out.println("Passed: Text matched: ('Residential')");
          System.out.println("Passed: Test Step (4)");

 	//Test Step (5) - H6_Text_V__Door designs for your home, H6
          WebElement H6_Text_V__Doordesignsforyourhome = driver.findElement(By.xpath("xpath_text_first_3_words|//h6[text()[contains(.,'Door designs for')]]"));
          wait.until(ExpectedConditions.visibilityOf(H6_Text_V__Doordesignsforyourhome));
          Assert.assertTrue("Element should exist", H6_Text_V__Doordesignsforyourhome.isDisplayed());
          System.out.println("Passed: Element should exist: 'H6_Text_V__Doordesignsforyourhome' = Is Displayed");
          String stringValue_5 = H6_Text_V__Doordesignsforyourhome.getText().trim();
          Assert.assertEquals("Door designs for your home" , stringValue_5);
          System.out.println("Passed: Text matched: ('Door designs for your home')");
          System.out.println("Passed: Test Step (5)");

 	//Test Step (6) - A_Link_V__Corporate, A
          WebElement A_Link_V__Corporate = driver.findElement(By.xpath("xpath_text_first_1_word|//a[text()[contains(.,'Corporate')]]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Corporate));
          Assert.assertTrue("Element should exist", A_Link_V__Corporate.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__Corporate' = Is Displayed");
          String stringValue_6 = A_Link_V__Corporate.getText().trim();
          Assert.assertEquals("Corporate" , stringValue_6);
          System.out.println("Passed: Text matched: ('Corporate')");
          System.out.println("Passed: Test Step (6)");

 	//Test Step (7) - A_Link_V__Careers, A
          WebElement A_Link_V__Careers = driver.findElement(By.xpath("xpath_attr_href2|//a[contains(@href,'/corporate/inside-our-culture')]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Careers));
          Assert.assertTrue("Element should exist", A_Link_V__Careers.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__Careers' = Is Displayed");
          String stringValue_7 = A_Link_V__Careers.getText().trim();
          Assert.assertEquals("Careers" , stringValue_7);
          System.out.println("Passed: Text matched: ('Careers')");
          System.out.println("Passed: Test Step (7)");

 	//Test Step (8) - A_Link_V__Privacy Policy, A
          WebElement A_Link_V__PrivacyPolicy = driver.findElement(By.xpath("xpath_attr_href2|//a[contains(@href,'/corporate/about-us/privacy-and-legal/')]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__PrivacyPolicy));
          Assert.assertTrue("Element should exist", A_Link_V__PrivacyPolicy.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__PrivacyPolicy' = Is Displayed");
          String stringValue_8 = A_Link_V__PrivacyPolicy.getText().trim();
          Assert.assertEquals("Privacy Policy" , stringValue_8);
          System.out.println("Passed: Text matched: ('Privacy Policy')");
          System.out.println("Passed: Test Step (8)");

 	//Test Step (9) - A_Link_V__Privacy Policy, A
          WebElement A_Link_V__PrivacyPolicy1 = driver.findElement(By.xpath("xpath_attr_href2|//a[contains(@href,'/corporate/about-us/privacy-and-legal/')]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__PrivacyPolicy1));
          Assert.assertTrue("Element should exist", A_Link_V__PrivacyPolicy1.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__PrivacyPolicy' = Is Displayed");
          builder.moveToElement(A_Link_V__PrivacyPolicy1).perform();
          Thread.sleep(1000);
          System.out.println("Passed: Test Step (9)");

 	//Test Step (10) - A_Link_V__Premdor, A
          WebElement A_Link_V__Premdor = driver.findElement(By.xpath("xpath_text_first_1_word|//a[text()[contains(.,'Premdor')]]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Premdor));
          Assert.assertTrue("Element should exist", A_Link_V__Premdor.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__Premdor' = Is Displayed");
          String stringValue_10 = A_Link_V__Premdor.getText().trim();
          Assert.assertEquals("Premdor" , stringValue_10);
          System.out.println("Passed: Text matched: ('Premdor')");
          System.out.println("Passed: Test Step (10)");

 	//Test Step (11) - A_Link_V__Masonite Czech Republic, A
          WebElement A_Link_V__MasoniteCzechRepublic = driver.findElement(By.xpath("xpath_attr_href1|//a[@href='http://www.masonite.cz/']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__MasoniteCzechRepublic));
          Assert.assertTrue("Element should exist", A_Link_V__MasoniteCzechRepublic.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__MasoniteCzechRepublic' = Is Displayed");
          String stringValue_11 = A_Link_V__MasoniteCzechRepublic.getText().trim();
          Assert.assertEquals("Masonite Czech Republic" , stringValue_11);
          System.out.println("Passed: Text matched: ('Masonite Czech Republic')");
          System.out.println("Passed: Test Step (11)");

 	//Test Step (12) - A_Link_V__Masonite Mexico, A
          WebElement A_Link_V__MasoniteMexico = driver.findElement(By.xpath("xpath_text_first_2_words|//a[text()[contains(.,'Masonite Mexico')]]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__MasoniteMexico));
          Assert.assertTrue("Element should exist", A_Link_V__MasoniteMexico.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__MasoniteMexico' = Is Displayed");
          String stringValue_12 = A_Link_V__MasoniteMexico.getText().trim();
          Assert.assertEquals("Masonite Mexico" , stringValue_12);
          System.out.println("Passed: Text matched: ('Masonite Mexico')");
          System.out.println("Passed: Test Step (12)");


           }
           catch(Exception e){

 		        System.out.println(e.toString());
               e.printStackTrace();

           }

       }


   @After
       public void After(){

           try{
               driver.quit();
           }
           catch (Exception e) {

               e.toString();
               e.printStackTrace();

           }

       }

}


