package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnQTYPage extends PageBases {

	public ReturnQTYPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="hub_id")
	WebElement HubDDL;
	
	@FindBy(id="react-select-2-input")
	WebElement HubTxt;
	
	@FindBy(xpath="//*[@id=\"quantity -104\"]/div[1]/input")
	WebElement QuantityTxT;
	
	@FindBy(id="Location-suggestion -104")
	WebElement LocationDDL;
	
	@FindBy(id="react-select-20-input")
	WebElement LocationtxT;
	
	@FindBy(id="Confirm -104")
	WebElement Confirmbtn;
	
	@FindBy(id="Discard -104")
	WebElement Discardbtn;
	
	public void SelectHub() {
		HubDDL.click();
	}
	public void SearchHub(String Hub) {
		HubTxt.sendKeys(Hub);
	}
	
	public void Quantity() {
		QuantityTxT.click();
	}
	public void SelectLocation() {
		LocationDDL.click();
	}
	public void SearchLocation(String loc) {
		LocationtxT.sendKeys(loc);
	}
	public void Confirm() {
		Confirmbtn.click();
	}
	public void Discard() {
		Discardbtn.click();
	}

}
