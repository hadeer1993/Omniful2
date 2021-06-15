package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserTest extends TestBases{
 
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
		
		ClientHomePage Chp = new ClientHomePage(driver);
		Chp.OpenUsersPage();
		Thread.sleep(50000);
	}

	@Test(priority = 2)
	public void AddUser() {
		UserPage Up = new UserPage(driver);
		Up.AddUser();
	}
	
	public void EditUser(){
		UserPage Up = new UserPage(driver);
		Up.EditUser();
	}
	public void DeleteUser() {
		UserPage Up = new UserPage(driver);
		Up.DeleteUser();
	}
}
