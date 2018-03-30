package PageObjects;

	import SupportClasses.SeleniumHelper;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	public class HomeMasonitePage extends SeleniumHelper{

	   //Properties
		public WebDriver driver;
		public String PAGE_Title = "Isaac Newton - Wikipedia";
		public String PAGE_URL = "https://en.wikipedia.org/wiki/Isaac_Newton";

	   //Constructor
		public HomeMasonitePage(WebDriver driver) throws MalformedURLException{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		   //Locators --------------------------------------------------------------------------------------------------------------------------------------------------
		   //L_1
			@FindBy(how = How.XPATH, using = "//a[@title='Portal:Algebra']")
			private WebElement Algebra;
			//Methods -------------------------------------------------------------------
			public void click_Algebra(String clickType){ click(Algebra, clickType);}
			public String getText_Algebra(){ return Algebra.getText();}

		   //L_2
			@FindBy(how = How.XPATH, using = "//a[@title='Portal:Analysis']")
			private WebElement Analysis;
			//Methods -------------------------------------------------------------------
			public void click_Analysis(){ click(Analysis, "");}
			public String getText_Analysis(){ return Analysis.getText();}

		   //L_3
			@FindBy(how = How.XPATH, using = "//a[@title='Portal:Category theory']")
			private WebElement Category_theory;
			//Methods -------------------------------------------------------------------
			public void click_Category_theory(){ click(Category_theory, "");}
			public String getText_Category_theory(){ return Category_theory.getText();}

		   //L_4
			@FindBy(how = How.XPATH, using = "//*[@id='mw-content-text']/div[1]/div[3]/div[1]/div[22]/dl[1]/dd/a[4]")
			private WebElement Cryptography;
			//Methods -------------------------------------------------------------------
			public void click_Cryptography(){ click(Cryptography, "");}
			public String getText_Cryptography(){ return Cryptography.getText();}

		   //L_5
			@FindBy(how = How.XPATH, using = "//a[@title='Portal:Discrete mathematics']")
			private WebElement Discrete_mathematics;
			//Methods -------------------------------------------------------------------
			public void click_Discrete_mathematics(){ click(Discrete_mathematics, "");}
			public String getText_Discrete_mathematics(){ return Discrete_mathematics.getText();}

		   //L_6
			@FindBy(how = How.XPATH, using = "//a[@title='Portal:Geometry']")
			private WebElement Geometry;
			//Methods -------------------------------------------------------------------
			public void click_Geometry(){ click(Geometry, "");}
			public String getText_Geometry(){ return Geometry.getText();}

		   //L_7
			@FindBy(how = How.XPATH, using = "//a[@title='Portal:Number theory']")
			private WebElement Number_theory;
			//Methods -------------------------------------------------------------------
			public void click_Number_theory(){ click(Number_theory, "");}
			public String getText_Number_theory(){ return Number_theory.getText();}

		   //L_8
			@FindBy(how = How.XPATH, using = "//a[@title='Portal:Topology']")
			private WebElement Topology;
			//Methods -------------------------------------------------------------------
			public void click_Topology(){ click(Topology, "");}
			public String getText_Topology(){ return Topology.getText();}

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