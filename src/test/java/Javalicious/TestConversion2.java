package Javalicious;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SupportClasses.TestBaseSetup;
import PageObjects.HomeMasonitePage;

import org.testng.Assert;
import org.testng.SkipException;
import java.io.File;
import java.net.MalformedURLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
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

import PageObjects.Wikipediathefreeencyclopedia;
@SuppressWarnings("unused")

public class TestConversion2 extends TestBaseSetup{
//public class TestCase419 extends TestBaseSetup{

   public WebDriver driver;
   public Actions builder;
   public WebDriverWait wait;
   Wikipediathefreeencyclopedia thisWikipediathefreeencyclopedia;// = new Wikipediathefreeencyclopedia();
  // PortalScienceWikipedia thisPortalScienceWikipedia;// = new PortalScienceWikipedia();
  // PortalContentsPortalsWikipedia thisPortalContentsPortalsWikipedia;// = new PortalContentsPortalsWikipedia();


   @BeforeClass
   public void setUp() throws MalformedURLException {
       driver = getDriver();
       builder = getBuilder();
       wait = getWait();
   }

   @Test
   public void TestCase419() throws Exception {

          try{

 	//VERIFY PAGE: 'Wikipedia, the free encyclopedia'
          if(!driver.getTitle().equals("Wikipedia, the free encyclopedia")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://en.wikipedia.org/wiki/Main_Page");
          }
          System.out.println("Passed: VERIFY PAGE: 'Wikipedia, the free encyclopedia is Displayed");

 	//Test Step (1) - A_Link_V__All portals, A
          WebElement A_Link_V__Allportals = driver.findElement(By.xpath("xpath_attr_title|//a[@title='Portal:Contents/Portals']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Allportals));
          Assert.assertTrue(A_Link_V__Allportals.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__Allportals' = Is Displayed");
          String stringValue_1 = A_Link_V__Allportals.getText().trim();
          Assert.assertEquals("All portals" , stringValue_1);
          System.out.println("Passed: Text matched: (All portals)");
          System.out.println("Passed: Test Step (1)");
          Thread.sleep(250);

 	//Test Step (2) - A_Link_V__Technology, A
          WebElement A_Link_V__Technology = driver.findElement(By.xpath("xpath_attr_title|//a[@title='Portal:Technology']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Technology));
          Assert.assertTrue(A_Link_V__Technology.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__Technology' = Is Displayed");
          String stringValue_2 = A_Link_V__Technology.getText().trim();
          Assert.assertEquals("Technology" , stringValue_2);
          System.out.println("Passed: Text matched: (Technology)");
          System.out.println("Passed: Test Step (2)");
          Thread.sleep(250);

 	//Test Step (3) - A_Link_V__Society, A
          WebElement A_Link_V__Society = driver.findElement(By.xpath("xpath_attr_title|//a[@title='Portal:Society']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Society));
          Assert.assertTrue(A_Link_V__Society.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__Society' = Is Displayed");
          String stringValue_3 = A_Link_V__Society.getText().trim();
          Assert.assertEquals("Society" , stringValue_3);
          System.out.println("Passed: Text matched: (Society)");
          System.out.println("Passed: Test Step (3)");
          Thread.sleep(250);

 	//Test Step (4) - A_Link_V__Science, A
          WebElement A_Link_V__Science = driver.findElement(By.xpath("xpath_attr_title|//a[@title='Portal:Science']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Science));
          Assert.assertTrue(A_Link_V__Science.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__Science' = Is Displayed");
          String stringValue_4 = A_Link_V__Science.getText().trim();
          Assert.assertEquals("Science" , stringValue_4);
          System.out.println("Passed: Text matched: (Science)");
          System.out.println("Passed: Test Step (4)");
          Thread.sleep(250);

 	//Test Step (5) - A_Link_V__Science, A
          WebElement A_Link_V__Science1 = driver.findElement(By.xpath("xpath_attr_title|//a[@title='Portal:Science']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Science1));
          Assert.assertTrue(A_Link_V__Science1.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__Science' = Is Displayed");
          A_Link_V__Science1.click();
          System.out.println("Passed: Test Step (5)");
          Thread.sleep(250);

 	//VERIFY PAGE: 'Portal:Science - Wikipedia'
          if(!driver.getTitle().equals("Portal:Science - Wikipedia")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://en.wikipedia.org/wiki/Portal:Science");
          }
          System.out.println("Passed: VERIFY PAGE: 'Portal:Science - Wikipedia is Displayed");

 	//Test Step (6) - H1_Text_V__Portal:Science, H1
          WebElement H1_Text_V__PortalScience = driver.findElement(By.xpath("xpath_attr_id|//h1[@id='firstHeading']"));
          wait.until(ExpectedConditions.visibilityOf(H1_Text_V__PortalScience));
          Assert.assertTrue(H1_Text_V__PortalScience.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'H1_Text_V__PortalScience' = Is Displayed");
          String stringValue_6 = H1_Text_V__PortalScience.getText().trim();
          Assert.assertEquals("Portal:Science" , stringValue_6);
          System.out.println("Passed: Text matched: (Portal:Science)");
          System.out.println("Passed: Test Step (6)");
          Thread.sleep(250);

 	//Test Step (7) - A_Link_V__Geography, A
          WebElement A_Link_V__Geography = driver.findElement(By.xpath("xpath_text_first_1_word|//a[text()[contains(.,'Geography')]]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Geography));
          Assert.assertTrue(A_Link_V__Geography.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__Geography' = Is Displayed");
          A_Link_V__Geography.click();
          System.out.println("Passed: Test Step (7)");
          Thread.sleep(250);

 	//VERIFY PAGE: 'Portal:Contents/Portals - Wikipedia'
          if(!driver.getTitle().equals("Portal:Contents/Portals - Wikipedia")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://en.wikipedia.org/wiki/Portal:Contents/Portals#Geography_and_places");
          }
          System.out.println("Passed: VERIFY PAGE: 'Portal:Contents/Portals - Wikipedia is Displayed");

 	//Test Step (8) - BIG_Text_V__ Geography and places   (see in all page types), BIG
          WebElement BG_Text_V__Geographyandplacesseeinallpagetypes = driver.findElement(By.xpath("xpath_text_first_3_words|//big[text()[contains(.,' Geography and')]]"));
          wait.until(ExpectedConditions.visibilityOf(BG_Text_V__Geographyandplacesseeinallpagetypes));
          Assert.assertTrue(BG_Text_V__Geographyandplacesseeinallpagetypes.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'BG_Text_V__Geographyandplacesseeinallpagetypes' = Is Displayed");
          String stringValue_8 = BG_Text_V__Geographyandplacesseeinallpagetypes.getText().trim();
          Assert.assertEquals("Geography and places   (see in all page types)" , stringValue_8);
          System.out.println("Passed: Text matched: (Geography and places   (see in all page types))");
          System.out.println("Passed: Test Step (8)");
          Thread.sleep(250);

 	//Test Step (9) - H1_Text_V__Portal:Contents/Portals, H1
          WebElement H1_Text_V__PortalContentsPortals = driver.findElement(By.xpath("xpath_attr_id|//h1[@id='firstHeading']"));
          wait.until(ExpectedConditions.visibilityOf(H1_Text_V__PortalContentsPortals));
          Assert.assertTrue(H1_Text_V__PortalContentsPortals.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'H1_Text_V__PortalContentsPortals' = Is Displayed");
          String stringValue_9 = H1_Text_V__PortalContentsPortals.getText().trim();
          Assert.assertEquals("Portal:Contents/Portals" , stringValue_9);
          System.out.println("Passed: Text matched: (Portal:Contents/Portals)");
          System.out.println("Passed: Test Step (9)");
          Thread.sleep(250);


           }
           catch(Exception e){

 		        System.out.println(e.toString());
               e.printStackTrace();

           }

       }
}


