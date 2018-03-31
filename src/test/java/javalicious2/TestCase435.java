package javalicious2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;
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

//public class TestConversion{
public class TestCase435{

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
   public void TestCase435() throws Exception {

      try{


 	//VERIFY PAGE: 'Humana for Insurance Brokers and Sales Agents'
          if(!driver.getTitle().equals("Humana for Insurance Brokers and Sales Agents")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://www.humana.com/agent/");
          }
          System.out.println("Passed: VERIFY PAGE: 'Humana for Insurance Brokers and Sales Agents is Displayed");

 	//Test Step (1) - Verify Text - A_Link_V__Individuals & Families, A
          WebElement A_Link_V__IndividualsFamilies = driver.findElement(By.xpath("xpath_attr_name|//a[@name='https://www.humana.com/agent/products-and-services/individual-and-family/']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__IndividualsFamilies));
          Assert.assertTrue(A_Link_V__IndividualsFamilies.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__IndividualsFamilies' = Is Displayed");
          String stringValue_1 = A_Link_V__IndividualsFamilies.getText().trim();
          Assert.assertEquals("Individuals & Families" , stringValue_1);
          System.out.println("Passed: Text matched: ('Individuals & Families')");
          System.out.println("Passed: Test Step (1)");

 	//Test Step (2) - Verify Text - A_Link_V__Individual Medicare, A
          WebElement A_Link_V__IndividualMedicare = driver.findElement(By.xpath("xpath_attr_name|//a[@name='https://www.humana.com/agent/products-and-services/individual-medicare/']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__IndividualMedicare));
          Assert.assertTrue(A_Link_V__IndividualMedicare.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__IndividualMedicare' = Is Displayed");
          String stringValue_2 = A_Link_V__IndividualMedicare.getText().trim();
          Assert.assertEquals("Individual Medicare" , stringValue_2);
          System.out.println("Passed: Text matched: ('Individual Medicare')");
          System.out.println("Passed: Test Step (2)");

 	//Test Step (3) - Verify Text - A_Link_V__Group Insurance, A
          WebElement A_Link_V__GroupInsurance = driver.findElement(By.xpath("xpath_attr_name|//a[@name='https://www.humana.com/agent/products-and-services/group-insurance/']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__GroupInsurance));
          Assert.assertTrue(A_Link_V__GroupInsurance.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__GroupInsurance' = Is Displayed");
          String stringValue_3 = A_Link_V__GroupInsurance.getText().trim();
          Assert.assertEquals("Group Insurance" , stringValue_3);
          System.out.println("Passed: Text matched: ('Group Insurance')");
          System.out.println("Passed: Test Step (3)");

 	//Test Step (4) - Verify Text - A_Link_V__Why Humana?, A
          WebElement A_Link_V__WhyHumana = driver.findElement(By.xpath("xpath_attr_title|//a[@title='Why Humana?']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__WhyHumana));
          Assert.assertTrue(A_Link_V__WhyHumana.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__WhyHumana' = Is Displayed");
          String stringValue_4 = A_Link_V__WhyHumana.getText().trim();
          Assert.assertEquals("Why Humana?" , stringValue_4);
          System.out.println("Passed: Text matched: ('Why Humana?')");
          System.out.println("Passed: Test Step (4)");

 	//Test Step (5) - Verify Text - DIV_Text_V__Unique extras that will appeal to your clients, li, DIV
          WebElement DIV_Text_V__Uniqueextrasthatwillappealtoyourclientsli = driver.findElement(By.xpath("xpath_attr_id|//div[@id='description-4']"));
          wait.until(ExpectedConditions.visibilityOf(DIV_Text_V__Uniqueextrasthatwillappealtoyourclientsli));
          Assert.assertTrue(DIV_Text_V__Uniqueextrasthatwillappealtoyourclientsli.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'DIV_Text_V__Uniqueextrasthatwillappealtoyourclientsli' = Is Displayed");
          String stringValue_5 = DIV_Text_V__Uniqueextrasthatwillappealtoyourclientsli.getText().trim();
          Assert.assertEquals("Unique extras that will appeal to your clients, like Go365" , stringValue_5);
          System.out.println("Passed: Text matched: ('Unique extras that will appeal to your clients, like Go365')");
          System.out.println("Passed: Test Step (5)");

 	//Test Step (6) - Verify Text - DIV_Text_V__We want our agents to succeed. That’s why we offer, DIV
          WebElement DIV_Text_V__WewantouragentstosucceedThatswhyweoffer = driver.findElement(By.xpath("xpath_attr_id|//div[@id='description-3']"));
          wait.until(ExpectedConditions.visibilityOf(DIV_Text_V__WewantouragentstosucceedThatswhyweoffer));
          Assert.assertTrue(DIV_Text_V__WewantouragentstosucceedThatswhyweoffer.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'DIV_Text_V__WewantouragentstosucceedThat’swhyweoffer' = Is Displayed");
          String stringValue_6 = DIV_Text_V__WewantouragentstosucceedThatswhyweoffer.getText().trim();
          Assert.assertEquals("We want our agents to succeed. That’s why we offer powerful tools like Humana Vantage, the Marketing Resource Center plus unmatched support from people as driven as you." , stringValue_6);
          System.out.println("Passed: Text matched: ('We want our agents to succeed. That’s why we offer powerful tools like Humana Vantage, the Marketing Resource Center plus unmatched support from people as driven as you.')");
          System.out.println("Passed: Test Step (6)");

 	//Test Step (7) - Verify Text - DIV_Text_V__Humana’s comprehensive suite of products and speci, DIV
          WebElement DIV_Text_V__Humanascomprehensivesuiteofproductsandspeci = driver.findElement(By.xpath("xpath_attr_id|//div[@id='description-2']"));
          wait.until(ExpectedConditions.visibilityOf(DIV_Text_V__Humanascomprehensivesuiteofproductsandspeci));
          Assert.assertTrue(DIV_Text_V__Humanascomprehensivesuiteofproductsandspeci.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'DIV_Text_V__Humana’scomprehensivesuiteofproductsandspeci' = Is Displayed");
          String stringValue_7 = DIV_Text_V__Humanascomprehensivesuiteofproductsandspeci.getText().trim();
          Assert.assertEquals("Humana’s comprehensive suite of products and specialty programs allows you to wow your clients with customized solutions that will help keep your sales pipeline full." , stringValue_7);
          System.out.println("Passed: Text matched: ('Humana’s comprehensive suite of products and specialty programs allows you to wow your clients with customized solutions that will help keep your sales pipeline full.')");
          System.out.println("Passed: Test Step (7)");

 	//Test Step (8) - Verify Text - DIV_Text_V__Our focus on Medicare is second to none. At Humana, DIV
          WebElement DIV_Text_V__OurfocusonMedicareissecondtononeAtHumana = driver.findElement(By.xpath("xpath_attr_id|//div[@id='description-1']"));
          wait.until(ExpectedConditions.visibilityOf(DIV_Text_V__OurfocusonMedicareissecondtononeAtHumana));
          Assert.assertTrue(DIV_Text_V__OurfocusonMedicareissecondtononeAtHumana.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'DIV_Text_V__OurfocusonMedicareissecondtononeAtHumana' = Is Displayed");
          String stringValue_8 = DIV_Text_V__OurfocusonMedicareissecondtononeAtHumana.getText().trim();
          Assert.assertEquals("Our focus on Medicare is second to none. At Humana we embrace this quickly growing segment of insurance and continually elevate our commitment to create more opportunities for you and your clients." , stringValue_8);
          System.out.println("Passed: Text matched: ('Our focus on Medicare is second to none. At Humana we embrace this quickly growing segment of insurance and continually elevate our commitment to create more opportunities for you and your clients.')");
          System.out.println("Passed: Test Step (8)");

 	//Test Step (9) - Verify Text - A_Link_V__Learn more about Medicare plans, A
          WebElement A_Link_V__LearnmoreaboutMedicareplans = driver.findElement(By.xpath("xpath_attr_name|//a[@name='https://www.humana.com/agent/products-and-services/individual-medicare/3']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__LearnmoreaboutMedicareplans));
          Assert.assertTrue(A_Link_V__LearnmoreaboutMedicareplans.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__LearnmoreaboutMedicareplans' = Is Displayed");
          String stringValue_9 = A_Link_V__LearnmoreaboutMedicareplans.getText().trim();
          Assert.assertEquals("Learn more about Medicare plans" , stringValue_9);
          System.out.println("Passed: Text matched: ('Learn more about Medicare plans')");
          System.out.println("Passed: Test Step (9)");

 	//Test Step (10) - Verify Text - A_Link_V__Learn more about Individual and Family plans, A
          WebElement A_Link_V__LearnmoreaboutIndividualandFamilyplans = driver.findElement(By.xpath("xpath_attr_name|//a[@name='https://www.humana.com/agent/products-and-services/individual-and-family/2']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__LearnmoreaboutIndividualandFamilyplans));
          Assert.assertTrue(A_Link_V__LearnmoreaboutIndividualandFamilyplans.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__LearnmoreaboutIndividualandFamilyplans' = Is Displayed");
          String stringValue_10 = A_Link_V__LearnmoreaboutIndividualandFamilyplans.getText().trim();
          Assert.assertEquals("Learn more about Individual and Family plans" , stringValue_10);
          System.out.println("Passed: Text matched: ('Learn more about Individual and Family plans')");
          System.out.println("Passed: Test Step (10)");

 	//Test Step (11) - Verify Text - A_Link_V__Learn more about Group Insurance Plans, A
          WebElement A_Link_V__LearnmoreaboutGroupInsurancePlans = driver.findElement(By.xpath("xpath_attr_name|//a[@name='https://www.humana.com/agent/products-and-services/group-insurance/2']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__LearnmoreaboutGroupInsurancePlans));
          Assert.assertTrue(A_Link_V__LearnmoreaboutGroupInsurancePlans.isDisplayed(),"Element should exist");
          System.out.println("Passed: Element should exist: 'A_Link_V__LearnmoreaboutGroupInsurancePlans' = Is Displayed");
          String stringValue_11 = A_Link_V__LearnmoreaboutGroupInsurancePlans.getText().trim();
          Assert.assertEquals("Learn more about Group Insurance Plans" , stringValue_11);
          System.out.println("Passed: Text matched: ('Learn more about Group Insurance Plans')");
          System.out.println("Passed: Test Step (11)");


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


