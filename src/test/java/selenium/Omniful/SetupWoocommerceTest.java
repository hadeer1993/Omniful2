package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetupWoocommerceTest extends TestBases {
	@BeforeTest
	public void openbrowser() throws InterruptedException {
		OpenChrome("https://automatioon.dashboard-omniful-stage.ibtikar.sa/");
		Thread.sleep(10000);
	}
	@Test(priority=1)
	public void OpenShippingMethod() throws InterruptedException {
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("ha.d.e.era.0.01@gmail.com", "123456");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.navigate().to("https://automatioon.dashboard-omniful-stage.ibtikar.sa/settings/ecommerce-channels/channel-integration/1?channel=woocommerce&activeTap=Woocommerce+Integration");
	     Thread.sleep(10000);
}
	@Test(priority=2)
	public void IntegrateWooCommerce() throws InterruptedException {
	    SetupWoocommercePage woo=new SetupWoocommercePage(driver);
		woo.WooCommerceMethod("https://alflashapp.com","ck_08c7717e22b6d45f0c1d93294ed72e0f87659d66", "111");
		Thread.sleep(50000);
	}
	@Test(priority=3)
	public void Opennventorywoo() throws InterruptedException {
		SetupWoocommercePage woo=new SetupWoocommercePage(driver);
		woo.OpenInventoryWoocommerce();
		Thread.sleep(10000);
	}
	@Test(priority=4)
	public void SetupInventorywoo() throws InterruptedException {
		SetupWoocommercePage woo=new SetupWoocommercePage(driver);
	    woo.CreateConnection();
	    Thread.sleep(10000);
	}
	@Test(priority=5)
	public void OpenWooConfigration() throws InterruptedException {
		SetupWoocommercePage woo=new SetupWoocommercePage(driver);
		woo.OpenWoocommercrConfigration();
	    Thread.sleep(10000);
	}
	
	@Test(priority=5)
	public void SetupWooConfigration() throws InterruptedException {
		SetupWoocommercePage woo=new SetupWoocommercePage(driver);
		woo.SetupConfigration();
	    Thread.sleep(10000);
}
}
