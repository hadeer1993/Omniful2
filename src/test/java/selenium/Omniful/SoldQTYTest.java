package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoldQTYTest extends TestBases {
	@BeforeTest
	public void openbrowser() throws InterruptedException {
		OpenChrome("https://hossam.dashboard-omniful-stage.ibtikar.sa/");
		Thread.sleep(10000);
	}
	@Test(priority=1)
	public void OpenSoldScreen() throws InterruptedException {
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("a.s.m.a.a0abdelkerim@gmail.com", "123456");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.navigate().to("https://hossam.dashboard-omniful-stage.ibtikar.sa/inventory/sold-quantity-locations");
	     Thread.sleep(10000);
	}
	     @Test(priority=2)
	     public void Selecthub() throws InterruptedException {
	     SoldQTYPage sldqty= new SoldQTYPage(driver);
	     sldqty.SelectHub();
	     Thread.sleep(1000);
	     sldqty.SearchHub("sidi");
	     ClickEnterAction();
	     Thread.sleep(1000);
	     ClickEscapeAction();
	     Thread.sleep(10000);
	     }
	     @Test(priority=3)
	     public void ConfirmQty() throws InterruptedException {
	     SoldQTYPage sldqty= new SoldQTYPage(driver);
	     sldqty.Quantity();
	     Thread.sleep(1000);
	     sldqty.SelectLocation();
	     Thread.sleep(1000);
	     sldqty.SearchLocation("A1");
	     Thread.sleep(1000);
	     ClickEnterAction();
	     sldqty.Confirm();
	}
}
