package AutomationSession.LastTask;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{
	@BeforeTest
	public void openBrowser()
	{
		openChrome("https://www.performancetestingpractice.com/register.php");
	}
	
	@Test
	public void testRegister() {
		RegistrationPage registrationObj = new RegistrationPage(driver);
		registrationObj.register("Asmaa", "Ibrahim", "asmaa.ibrahim@ibtikar.net.sa", "asmaa.ibrahim@ibtikar.net.sa", "asmak.ibrahim", "Asma@461989", "06/04/1989", "01229386294", "El-Siouf", "Alex", "-", "12345");
	}
}
