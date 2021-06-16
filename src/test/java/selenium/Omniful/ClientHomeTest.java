package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientHomeTest extends TestBases {
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

	@Test(priority=2)
	public void OpenRoles() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenRolesPage();
		Thread.sleep(10000);
	}
	
	@Test(priority=3)
	public void OpenTimeZone() throws InterruptedException {
	ClientHomePage chp=new ClientHomePage(driver);
	chp.OpenAdminMenu();
	Thread.sleep(10000);
	
	}	
	
	@Test(priority=4)
	public void OpenEcommerce() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenEcomPage();
		Thread.sleep(10000);
	}
	
	@Test(priority=5)
	public void OpenLanguage() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenLangPage();
		Thread.sleep(10000);
	}
	
	@Test(priority=6)
	public void OpenHubs() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenHubsPage();
		Thread.sleep(10000);
		}
	
	@Test(priority=7)
	public void OpenImportingScreen() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenImporting();
		Thread.sleep(10000);
		}
	
	@Test(priority=8)
	public void OpenShippingScreen() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenShipping();
		Thread.sleep(10000);
	}
	@Test(priority=9)
	public void OpenSoldQTYScreen() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenInventory();
		Thread.sleep(10000);

	}
}
