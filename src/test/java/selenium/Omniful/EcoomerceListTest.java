package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcoomerceListTest extends TestBases {
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
    public void OpenSideMenu() throws InterruptedException{
		HomePage hp=new HomePage(driver);
		hp.OpenClientPage();
		Thread.sleep(10000);
}
    @Test(priority=3)
	public void OpenEco() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenEcomPage();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		EcoomerceListPage ecolist=new EcoomerceListPage(driver);
		ecolist.SetupMagento();
    }   
}