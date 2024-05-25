package generic;

import java.io.File;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant {
	
	public static WebDriver driver;
	
	static {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(EDGE_KEY, EDGE_VALUE);
	}
	
	@BeforeMethod
	public void openappliction() {
		driver =new FirefoxDriver();
		String url=Lib.getProperty(CONFIG_PATH,"URL");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void closeappliction() {
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
