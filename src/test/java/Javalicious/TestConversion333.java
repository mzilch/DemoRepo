package Javalicious;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;
import java.io.File;
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
@SuppressWarnings("unused")

public class TestConversion333 {
//public class TestCase961{

   public WebDriver driver;
   public Actions builder;
   public WebDriverWait wait;


   @BeforeTest
   public void Before() throws Exception{

       driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
       builder = new Actions(driver);
       wait = new WebDriverWait(driver, 10);
   }
   @Test
   public void TestCase961() throws Exception {

          try{

 	//VERIFY PAGE: 'Find Individual & Family Health Insurance Plans | Anthem.com'
          if(!driver.getTitle().equals("Find Individual & Family Health Insurance Plans | Anthem.com")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://www.anthem.com/individual-and-family/");
          }
          System.out.println("Passed: VERIFY PAGE: 'Find Individual & Family Health Insurance Plans | Anthem.com is Displayed");

 	//Test Step (1) - A_Link_V__  Menu, A
          WebElement A_Link_V__Menu = driver.findElement(By.xpath("xpath_attr_class|//a[@class='ant-menu-toggle']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Menu));
          Assert.assertTrue(A_Link_V__Menu.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__Menu' = Is Displayed");
          JavascriptExecutor jse2 = (JavascriptExecutor)driver;
          jse2.executeScript("arguments[0].click();", A_Link_V__Menu);
          System.out.println("Passed: Test Step (1)");
          Thread.sleep(250);

 	//Test Step (2) - A_Link_V__What to Know, A
          WebElement A_Link_V__WhattoKnow = driver.findElement(By.xpath("xpath_attr_href2|//a[contains(@href,'/what-to-know/')]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__WhattoKnow));
          Assert.assertTrue(A_Link_V__WhattoKnow.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__WhattoKnow' = Is Displayed");
          String stringValue_2 = A_Link_V__WhattoKnow.getText().trim();
          Assert.assertEquals("What to Know" , stringValue_2);
          System.out.println("Passed: Text matched: (What to Know)");
          System.out.println("Passed: Test Step (2)");
          Thread.sleep(250);

 	//Test Step (3) - A_Link_V__Getting Better Care, A
          WebElement A_Link_V__GettingBetterCare = driver.findElement(By.xpath("xpath_attr_href2|//a[contains(@href,'/getting-better-care/')]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__GettingBetterCare));
          Assert.assertTrue(A_Link_V__GettingBetterCare.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__GettingBetterCare' = Is Displayed");
          String stringValue_3 = A_Link_V__GettingBetterCare.getText().trim();
          Assert.assertEquals("Getting Better Care" , stringValue_3);
          System.out.println("Passed: Text matched: (Getting Better Care)");
          System.out.println("Passed: Test Step (3)");
          Thread.sleep(250);

 	//Test Step (4) - A_Link_V__Preventive Health, A
          WebElement A_Link_V__PreventiveHealth = driver.findElement(By.xpath("xpath_attr_id|//a[@id='null-topmenu-1439337496407']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__PreventiveHealth));
          Assert.assertTrue(A_Link_V__PreventiveHealth.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__PreventiveHealth' = Is Displayed");
          String stringValue_4 = A_Link_V__PreventiveHealth.getText().trim();
          Assert.assertEquals("Preventive Health" , stringValue_4);
          System.out.println("Passed: Text matched: (Preventive Health)");
          System.out.println("Passed: Test Step (4)");
          Thread.sleep(250);

 	//Test Step (5) - A_Link_V__Find a Doctor, A
          WebElement A_Link_V__FindaDoctor = driver.findElement(By.xpath("xpath_relative_id|//*[@id='mbr-page-wrapper']/div[1]/div/div[2]/div[1]/div/div/div/ul/li[2]/ul[1]/li[4]/a"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__FindaDoctor));
          Assert.assertTrue(A_Link_V__FindaDoctor.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__FindaDoctor' = Is Displayed");
          String stringValue_5 = A_Link_V__FindaDoctor.getText().trim();
          Assert.assertEquals("Find a Doctor" , stringValue_5);
          System.out.println("Passed: Text matched: (Find a Doctor)");
          System.out.println("Passed: Test Step (5)");
          Thread.sleep(250);

 	//Test Step (6) - A_Link_V__Search Medications, A
          WebElement A_Link_V__SearchMedications = driver.findElement(By.xpath("xpath_attr_href1|//a[@href='https://www11.anthem.com/pharmacyinformation']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__SearchMedications));
          Assert.assertTrue(A_Link_V__SearchMedications.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__SearchMedications' = Is Displayed");
          String stringValue_6 = A_Link_V__SearchMedications.getText().trim();
          Assert.assertEquals("Search Medications" , stringValue_6);
          System.out.println("Passed: Text matched: (Search Medications)");
          System.out.println("Passed: Test Step (6)");
          Thread.sleep(250);


           }
           catch(Exception e){

 		        System.out.println(e.toString());
               e.printStackTrace();

           }

       }


   @AfterTest
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


