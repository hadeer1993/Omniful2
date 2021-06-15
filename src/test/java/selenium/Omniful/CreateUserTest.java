package selenium.Omniful;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.ExcelDataReader;

@Test
public class CreateUserTest extends TestBases{
	@DataProvider(name ="dataSheet2")
	public Object[][] callExcelData() throws IOException
	{
		ExcelDataReader dataObj = new ExcelDataReader();
		return dataObj.ReadDataFromExcel(2, 3);
	}
	
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
	public void OpenUserPage() throws InterruptedException {
		ClientHomePage chp = new ClientHomePage(driver);
		chp.OpenUsersPage();
		Thread.sleep(10000);
	}
	@Test(priority=3)
	public void OpenAddUserPage() throws InterruptedException {
		UserPage Up = new UserPage(driver);
		Up.AddUser();
		Thread.sleep(20000);
	}
	@Test(priority=4,  dataProvider="dataSheet2")
	public void NewUser(String name, String email, String pn) throws InterruptedException {
	    CreateUserPage Cup = new CreateUserPage(driver);
	    Cup.CreateNewUser(name,email,pn);
	    Thread.sleep(5000);
	    
	    Cup.SelectRoleDDL();
	    ClickEnterAction();
	    Thread.sleep(10000);

	    Cup.SelectHubDDL();
	    ClickEnterAction();
	    Thread.sleep(10000);
	  
	    Cup.CreateUser();
	    Thread.sleep(10000);

	    //assertEquals(true,Cup.getMessage(), Validationmsg);
	   // driver.navigate().to("https://osama.dashboard-omniful-stage.ibtikar.sa/users/create-user");
	    Thread.sleep(1000);
	}
}
