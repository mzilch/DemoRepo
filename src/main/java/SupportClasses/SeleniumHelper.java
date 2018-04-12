package SupportClasses;

import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import SupportClasses.TestBaseSetup;

public class SeleniumHelper {	
	
	public WebDriver driver = null;
	public Actions builder = null;
	public WebDriverWait wait = null;
	public Properties MBRConfig = new Properties();
	
	//TimeOuts
	public static final int WaitTime5 = 5;
	public static final int WaitTime10 = 10;
	public static final int WaitTime20 = 20;
	public static final int WaitTime30 = 30;
	public static final int WaitTime60 = 50;
;
	
	public SeleniumHelper() throws MalformedURLException{
		this.driver = TestBaseSetup.getDriver();
		this.builder = TestBaseSetup.getBuilder();
		this.wait = TestBaseSetup.getWait();
	}
	
	//Page Methods -------------------------------------------------------------------------
	
	public String getThisPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getThisPageURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void waitForPageLoadJScript(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int i = 0; i < WaitTime30; i++ ){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				if(js.executeScript("return document.readystate").toString().equals("complete")){
					break;
				}
			}			
		}
	}
	
	//Actions Methods -------------------------------------------------------------------------
	// Click
	public void click(WebElement InEllymont, String ClickType) {
		wait.until(ExpectedConditions.visibilityOf(InEllymont));
		try{
			switch(ClickType){	
			case "javaScriptExecutor":
				//Element is present but having permanent Overlay.
	            //Use JavascriptExecutor to send the click directly on the element.
				
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	            jse2.executeScript("arguments[0].click();", InEllymont);
				break;
			case "Actions":
				//Element not getting clicked due to JavaScript or AJAX calls present
	            //Try to use Actions Class
				Actions actions = new Actions(driver);
	            actions.moveToElement(InEllymont).click().build().perform();
				break;
			case "":
				InEllymont.click();
				break;
			default:			
				InEllymont.click();
			}
		} catch(NoSuchElementException nse){
			System.out.println("Element not found" + InEllymont + "| Error - " + nse.getMessage());
		} catch(StaleElementReferenceException sere){
			click(InEllymont, "");
		}
	}	
	// MouseOver
	public void MouseOver(WebElement InEllymont){		
		builder.moveToElement(InEllymont).perform();
	}	

}
