package selenium.Omniful;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBases {
	    public String base_url="https://osama.dashboard-omniful-stage.ibtikar.sa/";
	    public String username="asmaa0abd.elkerim@gmail.com";
	    public String password="123456";
		protected WebDriver driver;
		public void OpenChrome(String url){
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriverr.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.navigate().to(url);
		}
		
		public void ClickEnterAction() {
			Actions action=new Actions(driver);
			action.sendKeys(Keys.ENTER);
			action.perform();
			
			
		}
		public void ClickEscapeAction() {
			Actions action=new Actions(driver);
			action.sendKeys(Keys.ESCAPE);
			action.perform();
			
			
		}
	}


