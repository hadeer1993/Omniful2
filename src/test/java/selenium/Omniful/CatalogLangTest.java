package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CatalogLangTest extends TestBases{
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
	public void OpenLanguage() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenLangPage();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	@Test(priority=2)
	public void OpencatalogLanguage() throws InterruptedException {
		CatalogLangPage clang=new CatalogLangPage(driver);
		clang.Selectlanguagee();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}



}
