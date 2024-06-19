package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {

	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbt;
	
	public Loginpage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un) {
		username.sendKeys(un);
	}
	public void setpassword(String pn) {
		password.sendKeys(pn);
	}
	public void clicklogin() {
		loginbt.click();
	}
}
