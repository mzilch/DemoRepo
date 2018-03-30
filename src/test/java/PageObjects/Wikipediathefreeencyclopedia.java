package PageObjects;

import SupportClasses.SeleniumHelper;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Wikipediathefreeencyclopedia extends SeleniumHelper{

   //Properties
	public WebDriver driver;
	public String PAGE_Title = "Wikipedia, the free encyclopedia";
	public String PAGE_URL = "https://en.wikipedia.org/wiki/Main_Page";

   //Constructor
	public Wikipediathefreeencyclopedia(WebDriver driver) throws MalformedURLException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

   //Locators --------------------------------------------------------------------------------------------------------------------------------------------------
   //L_1
	@FindBy(how = How.XPATH, using = "//a[@title='Wikipedia']")
	private WebElement Wikipedia;
	//Methods -------------------------------------------------------------------
	public void click_Wikipedia(String clickType){ click(Wikipedia, clickType); }
	public String getText_Wikipedia(){ return Wikipedia.getText();}

   //L_2
	@FindBy(how = How.XPATH, using = "//a[@title='Free content']")
	private WebElement free;
	//Methods -------------------------------------------------------------------
	public void click_free(String clickType){ click(free, clickType); }
	public String getText_free(){ return free.getText();}

   //L_3
	@FindBy(how = How.XPATH, using = "//a[@title='Encyclopedia']")
	private WebElement encyclopedia;
	//Methods -------------------------------------------------------------------
	public void click_encyclopedia(String clickType){ click(encyclopedia, clickType); }
	public String getText_encyclopedia(){ return encyclopedia.getText();}

   //L_4
	@FindBy(how = How.XPATH, using = "//a[@title='Wikipedia:Introduction']")
	private WebElement anyone_can_edit;
	//Methods -------------------------------------------------------------------
	public void click_anyone_can_edit(String clickType){ click(anyone_can_edit, clickType); }
	public String getText_anyone_can_edit(){ return anyone_can_edit.getText();}

   //L_5
	@FindBy(how = How.XPATH, using = "//*[@id='articlecount']/a[1]")
	private WebElement A5589604;
	//Methods -------------------------------------------------------------------
	public void click_A5589604(String clickType){ click(A5589604, clickType); }
	public String getText_A5589604(){ return A5589604.getText();}

   //L_6
	@FindBy(how = How.XPATH, using = "//*[@id='articlecount']/a[2]")
	private WebElement English;
	//Methods -------------------------------------------------------------------
	public void click_English(String clickType){ click(English, clickType); }
	public String getText_English(){ return English.getText();}

   //L_7
	@FindBy(how = How.XPATH, using = "//a[@title='Portal:Arts']")
	private WebElement Arts;
	//Methods -------------------------------------------------------------------
	public void click_Arts(String clickType){ click(Arts, clickType); }
	public String getText_Arts(){ return Arts.getText();}

   //L_8
	@FindBy(how = How.XPATH, using = "//a[@title='Portal:Biography']")
	private WebElement Biography;
	//Methods -------------------------------------------------------------------
	public void click_Biography(String clickType){ click(Biography, clickType); }
	public String getText_Biography(){ return Biography.getText();}

   //L_9
	@FindBy(how = How.XPATH, using = "//a[@title='Portal:Geography']")
	private WebElement Geography;
	//Methods -------------------------------------------------------------------
	public void click_Geography(String clickType){ click(Geography, clickType); }
	public String getText_Geography(){ return Geography.getText();}

   //L_10
	@FindBy(how = How.XPATH, using = "//a[@title='Portal:History']")
	private WebElement History;
	//Methods -------------------------------------------------------------------
	public void click_History(String clickType){ click(History, clickType); }
	public String getText_History(){ return History.getText();}

   //L_11
	@FindBy(how = How.XPATH, using = "//a[@title='Portal:Mathematics']")
	private WebElement Mathematics;
	//Methods -------------------------------------------------------------------
	public void click_Mathematics(String clickType){ click(Mathematics, clickType); }
	public String getText_Mathematics(){ return Mathematics.getText();}

   //L_12
	@FindBy(how = How.XPATH, using = "//a[@title='Portal:Science']")
	private WebElement Science;
	//Methods -------------------------------------------------------------------
	public void click_Science(String clickType){ click(Science, clickType); }
	public String getText_Science(){ return Science.getText();}

   //L_13
	@FindBy(how = How.XPATH, using = "//a[@title='Portal:Society']")
	private WebElement Society;
	//Methods -------------------------------------------------------------------
	public void click_Society(String clickType){ click(Society, clickType); }
	public String getText_Society(){ return Society.getText();}

   //L_14
	@FindBy(how = How.XPATH, using = "//a[@title='Portal:Technology']")
	private WebElement Technology;
	//Methods -------------------------------------------------------------------
	public void click_Technology(String clickType){ click(Technology, clickType); }
	public String getText_Technology(){ return Technology.getText();}

   //L_15
	@FindBy(how = How.XPATH, using = "//a[@title='Portal:Contents/Portals']")
	private WebElement All_portals;
	//Methods -------------------------------------------------------------------
	public void click_All_portals(String clickType){ click(All_portals, clickType); }
	public String getText_All_portals(){ return All_portals.getText();}

   //L_16
	@FindBy(how = How.XPATH, using = "//a[@title='Stephen Hawking']")
	private WebElement Stephen_Hawking;
	//Methods -------------------------------------------------------------------
	public void click_Stephen_Hawking(String clickType){ click(Stephen_Hawking, clickType); }
	public String getText_Stephen_Hawking(){ return Stephen_Hawking.getText();}

   //L_17
	@FindBy(how = How.XPATH, using = "//*[text()='Commons']")
	private WebElement Commons;
	//Methods -------------------------------------------------------------------
	public void click_Commons(String clickType){ click(Commons, clickType); }
	public String getText_Commons(){ return Commons.getText();}

   //L_18
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[1]/td[4]/b[1]/a")
	private WebElement MediaWiki;
	//Methods -------------------------------------------------------------------
	public void click_MediaWiki(String clickType){ click(MediaWiki, clickType); }
	public String getText_MediaWiki(){ return MediaWiki.getText();}

   //L_19
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[1]/td[6]/b[1]/a")
	private WebElement MetaWiki;
	//Methods -------------------------------------------------------------------
	public void click_MetaWiki(String clickType){ click(MetaWiki, clickType); }
	public String getText_MetaWiki(){ return MetaWiki.getText();}

   //L_20
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[2]/td[2]/b[1]/a")
	private WebElement Wikibooks;
	//Methods -------------------------------------------------------------------
	public void click_Wikibooks(String clickType){ click(Wikibooks, clickType); }
	public String getText_Wikibooks(){ return Wikibooks.getText();}

   //L_21
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[2]/td[4]/b[1]/a")
	private WebElement Wikidata;
	//Methods -------------------------------------------------------------------
	public void click_Wikidata(String clickType){ click(Wikidata, clickType); }
	public String getText_Wikidata(){ return Wikidata.getText();}

   //L_22
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[2]/td[6]/b[1]/a")
	private WebElement Wikinews;
	//Methods -------------------------------------------------------------------
	public void click_Wikinews(String clickType){ click(Wikinews, clickType); }
	public String getText_Wikinews(){ return Wikinews.getText();}

   //L_23
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[3]/td[2]/b[1]/a")
	private WebElement Wikiquote;
	//Methods -------------------------------------------------------------------
	public void click_Wikiquote(String clickType){ click(Wikiquote, clickType); }
	public String getText_Wikiquote(){ return Wikiquote.getText();}

   //L_24
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[3]/td[4]/b[1]/a")
	private WebElement Wikisource;
	//Methods -------------------------------------------------------------------
	public void click_Wikisource(String clickType){ click(Wikisource, clickType); }
	public String getText_Wikisource(){ return Wikisource.getText();}

   //L_25
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[3]/td[6]/b[1]/a")
	private WebElement Wikispecies;
	//Methods -------------------------------------------------------------------
	public void click_Wikispecies(String clickType){ click(Wikispecies, clickType); }
	public String getText_Wikispecies(){ return Wikispecies.getText();}

   //L_26
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[4]/td[2]/b[1]/a")
	private WebElement Wikiversity;
	//Methods -------------------------------------------------------------------
	public void click_Wikiversity(String clickType){ click(Wikiversity, clickType); }
	public String getText_Wikiversity(){ return Wikiversity.getText();}

   //L_27
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[4]/td[4]/b[1]/a")
	private WebElement Wikivoyage;
	//Methods -------------------------------------------------------------------
	public void click_Wikivoyage(String clickType){ click(Wikivoyage, clickType); }
	public String getText_Wikivoyage(){ return Wikivoyage.getText();}

   //L_28
	@FindBy(how = How.XPATH, using = "//*[@id='mp-sister']/table[1]/tbody/tr[4]/td[6]/b[1]/a")
	private WebElement Wiktionary;
	//Methods -------------------------------------------------------------------
	public void click_Wiktionary(String clickType){ click(Wiktionary, clickType); }
	public String getText_Wiktionary(){ return Wiktionary.getText();}

   //L_29
	@FindBy(how = How.XPATH, using = "//h2[@id='mp-tfa-h2']")
	private WebElement From_todays_featured_article;
	//Methods -------------------------------------------------------------------
	public String getText_From_todays_featured_article(){ return From_todays_featured_article.getText();}

   //Page Methods --------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyPageTitle(){
		return getPageTitle().contains(PAGE_Title);
	}
	public boolean verifyPageURL(){
		return getPageTitle().contains(PAGE_URL);
	}
	public String getPageTitle(){
		return getThisPageTitle();
	}
	public String getPageUrl(){
		return getThisPageURL();
	}
}