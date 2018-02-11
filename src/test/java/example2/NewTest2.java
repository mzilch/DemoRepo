package example2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
@SuppressWarnings("unused")
public class NewTest2 {		
	    //static WebDriver driver;	
	    private boolean result;
	    private WebDriver driver;
		@Test				
		public void test() throws Exception {	
			
			
			driver.get("https://www.edgewordstraining.co.uk/2017/05/19/how-to-set-up-a-selenium-grid-for-webdriver-remote-execution/");
			//driver.get("https://www.google.com/");
			String title = driver.getTitle();				 
			//Assert.assertTrue(title.contains("Google")); 
			boolean results = ValidateAll_ByElements(title);			
			System.out.println("Page Title '" + title + "' did Match = " + results);
			System.out.println(driver.getWindowHandle());
			//System.out.println("Total Elements to be 'Validated': " + TotalEllymonts);
		}
		
		public boolean ValidateAll_ByElements(String pageTitle) {
			
			result = false;
			
			try{	
 	
				Assert.assertTrue(pageTitle.contains("How to set up a Selenium Grid"));
				//System.out.println(driver.getWindowHandle());
				return true;
			}
			catch (Exception ex)
			{
				return result;				
			}
		}
		@BeforeTest
		public void beforeTest() throws Exception {	
			
			//LOCAL - FIREFOX
/*		   DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		   capabilities.setCapability("marionette", false);
		   capabilities.setCapability("firefox_binary", new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		   driver = new FirefoxDriver(capabilities);*/
			driver = new FirefoxDriver();
		   //DOCKER - CHROME
/*			DesiredCapabilities caps = DesiredCapabilities.chrome();
            caps.setCapability(CapabilityType.VERSION, "");
            caps.setCapability(CapabilityType.PLATFORM, "LINUX");
            driver = new RemoteWebDriver(new URL("http://192.168.99.100:4446/wd/hub"),  caps);*/
            
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	

/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="TestSuite" thread-count="3" parallel="classes" >
  <test name="Testing Parallel">
    <classes>
      <class name="example2.XPathAssissant_JunitTest"/>
      <class name="example2.NewTest2"/>
      <class name="Javalicious.TestConversion"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->*/

/*<dependencies>			
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.12</version>
  <scope>test</scope>
</dependency>
	
      <dependency>
          <groupId>net.sourceforge.htmlunit</groupId>
          <artifactId>htmlunit</artifactId>
          <version>2.24</version>
		</dependency>			

		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-firefox-driver -->
		<dependency>
		    <groupId>org.seleniumhq.selenium</groupId>
		    <artifactId>selenium-firefox-driver</artifactId>
		    <version>2.53.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-ie-driver -->
		<dependency>
		    <groupId>org.seleniumhq.selenium</groupId>
		    <artifactId>selenium-ie-driver</artifactId>
		    <version>2.53.1</version>
		</dependency>		
		<dependency>
		    <groupId>org.seleniumhq.selenium</groupId>
		    <artifactId>selenium-java</artifactId>
		    <version>2.53.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-support -->
		<dependency>
		    <groupId>org.seleniumhq.selenium</groupId>
		    <artifactId>selenium-support</artifactId>
		    <version>2.53.1</version>
		</dependency>
		
      <dependency>				
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.10</version>
			<scope>test</scope>					  			
     </dependency>				
</dependencies>*/
