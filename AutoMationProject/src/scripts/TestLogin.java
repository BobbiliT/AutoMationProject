package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestLogin extends BaseTest {
	LoginPage l = new LoginPage(driver);
	
	@Test
	public void testFacebookLogin() {
		String us=Lib.getProperty(CONFIG_PATH,"username");
		String ps=Lib.getProperty(CONFIG_PATH,"password");
		l.Setusername(us);
		l.Setpassword(ps);
		l.clickLogin();
		Assert.fail();
		
	}
	
	
}
