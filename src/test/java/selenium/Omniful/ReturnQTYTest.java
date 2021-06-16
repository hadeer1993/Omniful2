package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReturnQTYTest extends TestBases {
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
		
		driver.navigate().to("https://hossam.dashboard-omniful-stage.ibtikar.sa/inventory/refund-quantity-locations");
	     Thread.sleep(10000);
	}
	     @Test(priority=2)
	     public void Selecthub() throws InterruptedException {
	     ReturnQTYPage reqty= new ReturnQTYPage(driver);
	     reqty.SelectHub();
	     Thread.sleep(5000);
	     reqty.SearchHub("pos2");
	     ClickEnterAction();
	     Thread.sleep(1000);
	     ClickEscapeAction();
	     Thread.sleep(10000);
	     }
	     @Test(priority=3)
	     public void ConfirmQty() throws InterruptedException {
	     ReturnQTYPage reqty= new ReturnQTYPage(driver);
	     reqty.Quantity();
	     Thread.sleep(1000);
	     reqty.SelectLocation();
	     Thread.sleep(1000);
	     reqty.SearchLocation("location 1");
	     Thread.sleep(1000);
	     ClickEnterAction();
	     reqty.Confirm();
	}

}
