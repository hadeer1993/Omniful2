package Tasks.Task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

public class OpenBrowser {
	public String baseUrl = "https://www.google.com/";
	public WebDriver driver ;
	public void runBrowser(String browser) {
		if(browser == "chrome") {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");  
			driver = new ChromeDriver();  
			driver.get(baseUrl);
		} else {
			System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.27.0-win64//geckodriver.exe");  
			driver = new FirefoxDriver();  
			driver.get(baseUrl);
		}
	}
}
