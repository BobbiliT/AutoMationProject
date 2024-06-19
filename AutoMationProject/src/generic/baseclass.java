package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass implements IAutoConstant1{

	public static WebDriver driver;
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(EDGE_KEY, EDGE_VALUE);
	}
	@BeforeMethod
	public void openapplication() {
		driver = new ChromeDriver();
		String url=lib1.getproperties(CONFIG_PATH, "URL");
		driver.get(url);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeapplication() {
		driver.close();
	}
	public void takescreenshot(String testmethod) {
		Date d = new Date();
		String date=d.toString().replace(":", " ");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//screenshots//"+date+"//"+testmethod+"screen_shot.png");
		try {
			FileUtils.copyFile(src, trg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
