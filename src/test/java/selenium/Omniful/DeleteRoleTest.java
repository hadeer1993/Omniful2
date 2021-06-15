package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteRoleTest extends TestBases{

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
	@Test(priority = 5)
	public void Deletebtn() throws InterruptedException {
		RolePage rp = new RolePage(driver);
		rp.DeleteRole1();
		Thread.sleep(10000);
	}
	
	@Test(priority = 6)
	public void DeleteRole() throws InterruptedException {
		DeleteRolePage drp = new DeleteRolePage(driver);
				drp.YesDeleteRoleMethod();
				Thread.sleep(10000);
	}
	@Test(priority = 7)
	public void GetCnfMsg() {
		RolePage rp = new RolePage(driver);
		rp.GetDeleteConfirmationMsg();
	}
}
