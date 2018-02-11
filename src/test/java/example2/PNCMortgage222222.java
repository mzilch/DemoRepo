package example2;

import org. junit .After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
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

public class PNCMortgage222222 {

   public WebDriver driver;
   public Actions builder;
   public WebDriverWait wait;


   @Before
   public void Before() throws Exception{

   DesiredCapabilities capabilities = DesiredCapabilities.firefox();
   capabilities.setCapability("marionette", false);
   capabilities.setCapability("firefox_binary", new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
   driver = new FirefoxDriver(capabilities);

   //driver = new FirefoxDriver();

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
       builder = new Actions(driver);
       wait = new WebDriverWait(driver, 10);

   }

   @Test
   public void PNCMortgage(){

          try{

 	//VERIFY PAGE: 'PNC - Virtual Wallet'
          if(!driver.getTitle().equals("PNC - Virtual Wallet")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://www.pnc.com/en/personal-banking/banking/checking/virtual-wallet.html");
          }
          System.out.println("Passed: VERIFY PAGE: 'PNC - Virtual Wallet is Displayed");

 	//Test Step (1) - A_Link_V__Lending, A
          WebElement A_Link_V__Lending = driver.findElement(By.xpath("xpath_text_inner_all|//a/*[text()='Lending']"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__Lending));
          Assert.assertTrue("Element should exist", A_Link_V__Lending.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__Lending' = Is Displayed");
          builder.moveToElement(A_Link_V__Lending).perform();
          Thread.sleep(1000);
          System.out.println("Passed: Test Step (1)");
          Thread.sleep(500);

 	//Test Step (2) - A_Link_V__Buy a Home, A
          WebElement A_Link_V__BuyaHome = driver.findElement(By.xpath("xpath_attr_href2|//a[contains(@href,'/en/personal-banking/borrowing/home-lending/mortgages.html')]"));
          wait.until(ExpectedConditions.visibilityOf(A_Link_V__BuyaHome));
          Assert.assertTrue("Element should exist", A_Link_V__BuyaHome.isDisplayed());
          System.out.println("Passed: Element should exist: 'A_Link_V__BuyaHome' = Is Displayed");
          A_Link_V__BuyaHome.click();
          System.out.println("Passed: Test Step (2)");
          Thread.sleep(500);

 	//VERIFY PAGE: 'PNC - Mortgages'
          if(!driver.getTitle().equals("PNC - Mortgages")); {
          //If were not on the correct page, then navigate to the correct page
          driver.get("https://www.pnc.com/en/personal-banking/borrowing/home-lending/mortgages.html?lnksrc=topnav");
          }
          System.out.println("Passed: VERIFY PAGE: 'PNC - Mortgages is Displayed");

 	//Test Step (3) - INPUT_input_V__text_purchaseAmount, INPUT
          WebElement NPUT_input_V__text_purchaseAmount = driver.findElement(By.xpath("xpath_attr_id|//input[@id='purchaseAmount']"));
          wait.until(ExpectedConditions.visibilityOf(NPUT_input_V__text_purchaseAmount));
          Assert.assertTrue("Element should exist", NPUT_input_V__text_purchaseAmount.isDisplayed());
          System.out.println("Passed: Element should exist: 'NPUT_input_V__text_purchaseAmount' = Is Displayed");
               NPUT_input_V__text_purchaseAmount.clear();
               NPUT_input_V__text_purchaseAmount.sendKeys("222222");
               NPUT_input_V__text_purchaseAmount.sendKeys(Keys.RETURN);
          System.out.println("Passed: Test Step (3)");
          Thread.sleep(500);

 	//Test Step (4) - INPUT_input_V__text_zipCode, INPUT
          WebElement NPUT_input_V__text_zipCode = driver.findElement(By.xpath("xpath_attr_id|//input[@id='zipCode']"));
          wait.until(ExpectedConditions.visibilityOf(NPUT_input_V__text_zipCode));
          Assert.assertTrue("Element should exist", NPUT_input_V__text_zipCode.isDisplayed());
          System.out.println("Passed: Element should exist: 'NPUT_input_V__text_zipCode' = Is Displayed");
               NPUT_input_V__text_zipCode.clear();
               NPUT_input_V__text_zipCode.sendKeys("19428");
               NPUT_input_V__text_zipCode.sendKeys(Keys.RETURN);
          System.out.println("Passed: Test Step (4)");
          Thread.sleep(500);

 	//Test Step (5) - INPUT_input_V__button_ratesGet, INPUT
          WebElement NPUT_input_V__button_ratesGet = driver.findElement(By.xpath("xpath_attr_value|//input[@value='GET RATES']"));
          wait.until(ExpectedConditions.visibilityOf(NPUT_input_V__button_ratesGet));
          Assert.assertTrue("Element should exist", NPUT_input_V__button_ratesGet.isDisplayed());
          System.out.println("Passed: Element should exist: 'NPUT_input_V__button_ratesGet' = Is Displayed");
          NPUT_input_V__button_ratesGet.click();
          System.out.println("Passed: Test Step (5)");
          Thread.sleep(500);

 	//Test Step (6) - DIV_Text_V__4.250%, DIV
          WebElement DV_Text_V__4250 = driver.findElement(By.xpath("xpath_relative_id|//*[@id='todaysRates']/div[2]/div[2]"));
          wait.until(ExpectedConditions.visibilityOf(DV_Text_V__4250));
          Assert.assertTrue("Element should exist", DV_Text_V__4250.isDisplayed());
          System.out.println("Passed: Element should exist: 'DV_Text_V__4250%' = Is Displayed");
          String stringValue_6 = DV_Text_V__4250.getText().trim();
          Assert.assertEquals("4.375%" , stringValue_6);
          System.out.println("Passed: Text matched: (4.375%)");
          System.out.println("Passed: Test Step (6)");
          Thread.sleep(500);


           }
           catch(Exception e){

 		        e.toString();
               e.printStackTrace();

           }

       }


   @After
       public void After() throws Exception {

           try{
               driver.quit();
           }
           catch (Exception e) {

               e.toString();
               e.printStackTrace();

           }

       }

}
