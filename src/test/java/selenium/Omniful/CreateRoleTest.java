package selenium.Omniful;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateRoleTest extends TestBases {

	@BeforeTest
	public void Openbrowser() throws InterruptedException {
		OpenChrome("https://asmak.dashboard-omniful-stage.ibtikar.sa/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	@Test(priority=1)
	public void LoginCLient() throws InterruptedException {
		ClientLoginPage clp = new ClientLoginPage(driver);
		clp.clientLoginMethod("asmaa0abdelkerim@gmail.com", "123456");
		Thread.sleep(10000);
	}
	@Test(priority = 2)
	public void OpenRoles() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenRolesPage();
		Thread.sleep(10000);
	}
	@Test(priority=3)
	public void OpenAddRole() throws InterruptedException {
		RolePage rp = new RolePage(driver);
		rp.AddRole();
		Thread.sleep(10000);
	}
	@Test(priority = 4)
	public void AddRole() throws InterruptedException {
		CreateRolePage crp = new CreateRolePage(driver);
		crp.EnterRoleName("role1234");
		Thread.sleep(1000);
		
		crp.SelecrRolePermission();
		Thread.sleep(1000);
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		
		crp.CreateRole();
		Thread.sleep(1000);

	}

	@Test(priority = 5)
	public void GetCnfMsg() {
		RolePage rp = new RolePage(driver);
		rp.GetCreateCnfMsg();
	}
}
