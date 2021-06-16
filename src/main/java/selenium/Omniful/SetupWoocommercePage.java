package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetupWoocommercePage extends PageBases {

	public SetupWoocommercePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="domainURL")
	WebElement DomainURLTxT;
	
	@FindBy(id="customerKey")
	WebElement CustomerKeyTxT;
	
	@FindBy(id="customerSecret")
	WebElement CustomerSecretTxT;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[1]/form/button[1]")
	WebElement Integratebtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[1]/form/button[2]")
	WebElement Cancelbtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[2]/a")
	WebElement InventoryWooCommerceTab;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div/table/thead/tr/td[1]/div")
	WebElement Checkbox;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/button")
	WebElement CreateConnection;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/div/div")
	WebElement Popup;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/div/div/p/button[1]")
	WebElement Yesbtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[3]/a")
	WebElement WoocommerceConfigrutionTab;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[3]/div[1]/div[1]/div/div/div/div[1]")
	WebElement FirstTogglebtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[3]/div[1]/div[2]/div/div/div/div[1]")
	WebElement SecondTogglebtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[3]/div[1]/div[3]/div/div/div/div[1]")
	WebElement ThirdTogglebtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[3]/div[2]/div/button[1]/span")
	WebElement Savebtn;
	
	public void WooCommerceMethod(String url,String key, String secret) {
		DomainURLTxT.sendKeys(url);
		CustomerKeyTxT.sendKeys(key);
		CustomerSecretTxT.sendKeys(secret);
		Integratebtn.click();
	}
	public void OpenInventoryWoocommerce() {
		InventoryWooCommerceTab.click();
	}
	public void CreateConnection() {
		Checkbox.click();
		CreateConnection.click();
		Popup.click();
		Yesbtn.click();
	}
	public void OpenWoocommercrConfigration() {
		WoocommerceConfigrutionTab.click();
	}
	public void SetupConfigration() {
		FirstTogglebtn.click();
		SecondTogglebtn.click();
		ThirdTogglebtn.click();
		Savebtn.click();
	}
	//public String getMessage()
	//{
	//return Cnfmessg.getText();
	//}

}
