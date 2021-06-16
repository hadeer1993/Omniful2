package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetupOpenCartTest extends TestBases {
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
		driver.navigate().to("https://automatioon.dashboard-omniful-stage.ibtikar.sa/settings/ecommerce-channels/channel-integration/2?channel=opencart&activeTap=Opencart+Integration");
	     Thread.sleep(10000);
}
	@Test(priority=2)
	public void IntegrateOpenCart() throws InterruptedException {
		SetupOpenCartPage opencart=new SetupOpenCartPage(driver);
		opencart.OpenCartMethod("https://almehbaj.net/test","XIq8s4pfjSzbPo8ZMo2HwdzdD4JgJTbn");
}
}


