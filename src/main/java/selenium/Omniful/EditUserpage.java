package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUserpage extends PageBases{

	public EditUserpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement nametxt;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement emailtxt;
	
	@FindBy(xpath = "//*[@id=\"phone\"]")
	WebElement phonenum;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[2]/div/button[1]")
	WebElement Savebtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div")
	WebElement cnfmsg;
	
	public void EditUserPage(String name, String email, String phone) {
		nametxt.sendKeys(name);
		emailtxt.sendKeys(email);
		phonenum.sendKeys(phone);
		Savebtn.click();
	}
	public void getmsg() {
		cnfmsg.getText();
	}
}
