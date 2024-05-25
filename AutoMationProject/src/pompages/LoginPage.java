package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(id="email")
	private WebElement unTB;
	@FindBy(id="pass")
	private WebElement pwTB;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginBtn;
	
	//inwitialistion
	public LoginPage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	//Utilisation
	public void Setusername(String un) {
		unTB.sendKeys(un);
	}
	public void Setpassword(String pw) {
		pwTB.sendKeys(pw);
	}
	public void clickLogin() {
		loginBtn.click();
	}
}
