package selenium.Omniful;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.Omniful.ClientHomePage;
import selenium.Omniful.ClientLoginPage;
import selenium.Omniful.ShippingPage;
import selenium.Omniful.TestBases;

public class ShippingTest extends TestBases {
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
		
		ClientHomePage chp = new ClientHomePage(driver);
		chp.OpenShipping();
		Thread.sleep(10000);
		
		ShippingPage ship=new ShippingPage(driver);
		ship.Aramex();
		Thread.sleep(10000);

	}
}
