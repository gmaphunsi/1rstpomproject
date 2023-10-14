package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	//login data
	String userName = "demo@techfios.com";
	String password = "abc123";
	String dashboard = "Dashboard";
	
	
	
	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		
		// --- How to call in PAGE/UTIL
		//create an Object
		//by the name of the Class?
		//---create a bridge for the webdriver between B.Factory and LoginTest
		driver = BrowserFactory.init();
		
		//call the WebDriver from page package
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		//---now call the methods
		
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();
	
	DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardPage.verifyDashboardPage(dashboard);
	}
	
	
	
}
