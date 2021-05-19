package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HubsPage extends PageBases {

	public HubsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"add-user\"]/a/button")
	WebElement AddNew;
	
	public void ClickAddNew() {
		AddNew.click();
	}
	
	@FindBy(xpath="//*[@id=\"card-12\"]/div")
	WebElement Card;

	@FindBy(xpath = "//*[@id=\"card-12\"]/div/div/div[5]/div/li")
	WebElement GearBtn;
	
	@FindBy(xpath = "//*[@id=\"card-12\"]/div/div/div[5]/div/li/div/a[1]/button")
	WebElement LocationBtn;
	
	public void ClickLocation() throws InterruptedException {
		Card.click();
		GearBtn.click();
		LocationBtn.click();
	}
}
