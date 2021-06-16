package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetupOpenCartPage extends PageBases {

	public SetupOpenCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="domainURL")
	WebElement DomainURLTxT;
	
	@FindBy(id="secretKey")
	WebElement SecretKeyTxT;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[1]/form/button[1]")
	WebElement Integratebtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[1]/form/button[2]")
	WebElement Cancelbtn;
	
	public void OpenCartMethod(String url,String key) {
		DomainURLTxT.sendKeys(url);
		SecretKeyTxT.sendKeys(key);
		Integratebtn.click();
	}
	//public String getMessage()
	//{
	//return Cnfmessg.getText();
	//}

}


