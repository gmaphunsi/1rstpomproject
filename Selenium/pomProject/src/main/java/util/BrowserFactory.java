package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class BrowserFactory {

	
	static WebDriver driver;
	
	public static  WebDriver init() {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://techfios.com/billing/?ng=login/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	
//	@AfterTest
//	public static void tearDown() {
//		
//	driver .close();
//	driver.quit();
//	}
	
	
	
	
	}
