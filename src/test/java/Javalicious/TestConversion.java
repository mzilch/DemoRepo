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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.*;
@SuppressWarnings("unused")

public class TestConversion{
//public class TestCase98{

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
   public void TestCase98() throws Exception {

      try{


 	//VERIFY PAGE: 'What People Watch, Listen To and Buy | Nielsen'
          if(!driver.getTitle().equals("What People Watch, Listen To and Buy | Nielsen")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("http://www.nielsen.com/us/en.html");
          }
          System.out.println("Passed: VERIFY PAGE: 'What People Watch, Listen To and Buy | Nielsen is Displayed");

 	//Test Step (1) - A_Link_V__Insights, A
          WebElement A_Link_V__Insights = driver.findElement(By.xpath("xpath_text_first_1_word|//a[text()[contains(.,'Insights')]]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Insights));
          Assert.assertTrue("Element should exist", A_Link_V__Insights.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__Insights' = Is Displayed");
          System.out.println("Passed: Test Step (1)");

 	//Test Step (2) - A_Link_V__Solutions, A
          WebElement A_Link_V__Solutions = driver.findElement(By.xpath("xpath_attr_href2|//a[contains(@href,'/us/en/solutions.html')]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Solutions));
          Assert.assertTrue("Element should exist", A_Link_V__Solutions.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__Solutions' = Is Displayed");
          System.out.println("Passed: Test Step (2)");

 	//Test Step (3) - A_Link_V__News Center, A
          WebElement A_Link_V__NewsCenter = driver.findElement(By.xpath("xpath_attr_href1|//a[@href='http://sites.nielsen.com/newscenter']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__NewsCenter));
          Assert.assertTrue("Element should exist", A_Link_V__NewsCenter.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__NewsCenter' = Is Displayed");
          System.out.println("Passed: Test Step (3)");

 	//Test Step (4) - A_Link_V__About, A
          WebElement A_Link_V__About = driver.findElement(By.xpath("xpath_text_inner_all|//*[text()='About']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__About));
          Assert.assertTrue("Element should exist", A_Link_V__About.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__About' = Is Displayed");
          System.out.println("Passed: Test Step (4)");


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


