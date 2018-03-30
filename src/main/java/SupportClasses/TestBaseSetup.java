package SupportClasses;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBaseSetup {

	public static WebDriver driver;	
	private static WebDriverWait wait;
	private static Actions builder;	
	public static String browserName;
	
	private static String ChromedriverPath = "C:\\Users\\Administrator\\Documents\\Visual Studio 2012\\Projects\\GUI_Inventory\\MagicBox_1\\packages\\Selenium.WebDriver.ChromeDriver.2.34.0\\driver\\win32\\";

	public static WebDriver getDriver() throws MalformedURLException {
		return driver;
	}
	public static Actions getBuilder() throws MalformedURLException {
		return  builder;
	}
	public static WebDriverWait getWait() throws MalformedURLException {
		return  wait;
	}
	
	@Parameters({ "browserType" })
	@BeforeClass	
	public void initializeTestBaseSetup( @Optional("firefox") String browserName) {
		try {
			setDriver(browserName);
			builder = new Actions(driver);
	        wait = new WebDriverWait(driver, 10);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

	public WebDriver setDriver(String browserType) throws MalformedURLException {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver();
			break;
		case "DockerChrome":
			driver = initDockerChromeDriver();
			break;
		case "firefox":
			driver = initFirefoxDriver();
			break;
		case "internetexplorer":
			driver = initIEDriver();
			break;
			
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver();
		}
		return driver;
	}

	private static WebDriver initChromeDriver() {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", ChromedriverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver() {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//driver.navigate().to(appURL);
		return driver;
	}
	
	private static WebDriver initDockerChromeDriver() throws MalformedURLException {
		System.out.println("Launching DockerChrome browser..");
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability(CapabilityType.VERSION, "");
	    caps.setCapability(CapabilityType.PLATFORM, "LINUX");
	    driver = new RemoteWebDriver(new URL("http://192.168.99.100:4446/wd/hub"),  caps);

		//driver.navigate().to(appURL);
		return driver;
	}
	private static WebDriver initIEDriver() throws MalformedURLException {
	    System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\Desktop\\XPath Assistant Projects\\IEDriverServer\\IEDriverServer.exe");
	    DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
	    dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	    dc.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
	
	    driver = new InternetExplorerDriver(dc);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	    
	    return driver;
	}
	
	
	@AfterClass
	public void tearDown() {
        try{
            driver.quit();
        }
        catch (Exception e) {

            e.toString();
            e.printStackTrace();

        }
	}
}

