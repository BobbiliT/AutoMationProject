package scripts;

import org.openqa.selenium.devtools.v122.media.model.PlayerErrorSourceLocation;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.baseclass;
import generic.lib1;
import pompages.Loginpage1;

public class testlogin1 extends baseclass{

	Loginpage1 l = new Loginpage1(driver);
	@Test
	public void loginfacebook() {
		String us=lib1.getproperties(CONFIG_PATH, "username");
		String ps=lib1.getproperties(CONFIG_PATH, "password");
		l.setusername(us);
		l.setpassword(ps);
		l.clicklogin();
		Assert.fail();
	}
}
