package SupportClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {
	//Properties
	protected WebDriver driver;
	//Verify Page 
	public abstract boolean verifyPageTitle();
	public abstract boolean verifyPageURL();
	public abstract String getPageTitle();	
	public abstract String getPageURL();
	//WebElement	
	public abstract boolean isDisplayed(WebElement InEllymont);
	public abstract boolean isEnabled(WebElement InEllymont);
	public abstract boolean isSelected(WebElement InEllymont);
	//Actions
	public abstract void click(WebElement InEllymont, String ClickType);
	public abstract String getText(WebElement InEllymont);
}
