package selenium.Omniful;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
public class ImportLocationQuantityTest extends TestBases {
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
	     driver.navigate().to(base_url+"inventory/importing");
	     Thread.sleep(10000);
	}
	     @Test(priority=2)
	    public void ImportMethod() throws InterruptedException {
	   ImportLocationQuantityPage imp=new ImportLocationQuantityPage(driver);
	     imp.SelectFromHubList();
	      Thread.sleep(5000);
	     
		imp.SendValue("54");
		Thread.sleep(1000);
		ClickEnterAction();
	    Thread.sleep(5000);
	    
	     imp.ClickUploadBtn();
	     Thread.sleep(5000);
	    
	     imp.UploadFile("C:\\Users\\klkll\\Downloads\\Audit Example Import File (1) (1).xlsx");
	     Thread.sleep(1000);
	    
}
}