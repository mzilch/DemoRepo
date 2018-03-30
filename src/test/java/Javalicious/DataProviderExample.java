package Javalicious;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
  @Test(dataProvider = "Authentication1")
  public void testOmatic1(Integer n, String s) {
	  
	  System.out.println(s);
  }
  @Test(dataProvider = "Authentication2")
  public void testOmatic2(Integer n, String s) {
	  
	  System.out.println(s);
  }
  @Test(dataProvider = "Authentication3")
  public void testOmatic3(Integer n, String s) {
	  
	  System.out.println(s);
	  
	  System.out.println("Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
  }

  @DataProvider(name = "Authentication1")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
  
  @DataProvider(name = "Authentication2")
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { 4, "d" },
      new Object[] { 5, "e" },
      new Object[] { 6, "f" },
    };
  }
  
  @DataProvider(name = "Authentication3")
  public Object[][] dp2() {
    return new Object[][] {
      new Object[] { 7, "g" },
      new Object[] { 8, "h" },
      new Object[] { 9, "i" },
    };
  }
}



/* 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.DataProvider;
 
import org.testng.annotations.Test;
 
public class DataProviderTest {
 
	private static WebDriver driver;
 
  @DataProvider(name = "Authentication")
 
  public static Object[][] credentials() {
 
        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
 
  }
 
  // Here we are calling the Data Provider object with its Name
 
  @Test(dataProvider = "Authentication")
 
  public void test(String sUsername, String sPassword) {
 
	  driver = new FirefoxDriver();
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("http://www.store.demoqa.com");
 
      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
      driver.findElement(By.id("log")).sendKeys(sUsername);
 
      driver.findElement(By.id("pwd")).sendKeys(sPassword);
 
      driver.findElement(By.id("login")).click();
 
      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
 
      driver.quit();
 
  }
 
}*/
