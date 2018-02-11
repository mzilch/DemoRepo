package Javalicious;

/*import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;*/
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;
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
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SuppressWarnings("unused")
public class TestingBasicSelenium {

    static WebDriver driver;
    final private String URL1 = "http://www.google.com";
    final private String URL2 = "http://www.amazon.com";

    @BeforeClass
    public static void setupTest(){
        driver = new FirefoxDriver();
    }

    //.get Example
    @Test
    public void T01_getURLExample() {
        //Go to www.google.com
        driver.get(URL1);

        //Check title is correct
        assertThat(driver.getTitle(), is("Google"));
        System.out.println("Passed: T01_getURLExample");
    }

    //.Navigate().to example
    @Test
    public void T02_navigateToExample(){
        //Go to www.amazon.com
        driver.navigate().to(URL2);

        //Check title is correct
        assertThat(driver.getTitle(), is("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
        System.out.println("Passed: T02_navigateToExample");
    }

    @Test
    //Back - Forward - Refresh Example
    public void T03_backForwardRefreshExample(){
        //Go to www.google.com
        driver.navigate().to(URL1);
        //Check title is correct
        assertThat(driver.getTitle(), is("Google"));

        //Go to www.amazon.com
        driver.navigate().to(URL2);
        //Check title is correct
        assertThat(driver.getTitle(), is("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));

        //***Navigate Back***
        driver.navigate().back();
        //Check title is correct
        assertThat(driver.getTitle(), is("Google"));

        //***Navigate Forward***
        driver.navigate().forward();
        //Check title is correct
        assertThat(driver.getTitle(), is("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));

        //***Refresh The Page***
        driver.navigate().refresh();
        assertThat(driver.getTitle(), is("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
        System.out.println("Passed: T03_backForwardRefreshExample");
    }

    @AfterClass
    public static void quitDriver(){
    	System.out.println(driver.getWindowHandle());
        driver.quit();
    }

}