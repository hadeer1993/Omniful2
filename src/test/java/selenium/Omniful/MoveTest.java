package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoveTest extends TestBases{

	@BeforeTest
	public void openbrowser() {
		OpenChrome(base_url);
	}
	@Test(priority=1)
	public void OpenShippingMethod() throws InterruptedException {
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod (username, password);
		driver.manage().window().maximize();
		Thread.sleep(10000);
    }
	
	@Test(priority = 2)
	public void OpenMovePage() throws InterruptedException {
		ClientHomePage chp = new ClientHomePage(driver);
		chp.OpenMovePage();
		Thread.sleep(10000);
	
	}
	
	@Test(priority = 3)
	public void MoveItem() throws InterruptedException {
		MovePage mp = new MovePage(driver);
		mp.SelectHub();
		Thread.sleep(1000);
		mp.SearchHub("demo");
		Thread.sleep(1000);
		ClickEnterAction();
		
		mp.SelectSKU();
		Thread.sleep(1000);
		mp.SearchSKU("24-mb01");
		Thread.sleep(5000);
		ClickEnterAction();
		
		mp.InsertQty("5");
		mp.SelectSourceLocation();
		mp.SearchSource("P-1");
		Thread.sleep(1000);
		ClickEnterAction();
		
		mp.SelectDestinationLocation();
		mp.SearchDestination("B-1");
		Thread.sleep(1000);
		ClickEnterAction();
		mp.InsertReason("Test");
		mp.ClickSaveBtn();
		//mp.getMessage();
	}
}
