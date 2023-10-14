package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;



public class AddCustomerTest {
	WebDriver driver;

	
	//login data
	String userName = "demo@techfios.com";
	String password = "abc123";
	String dashboard = "Dashboard";
	String addCustomer = "Add Contact";
	
	//TestData
	String fullName = "selenium";
	String company = "Amazon";
	String email = "demo1@techfios.com";

	@Test
	public void userShouldBeAbleToAddCustomer() throws InterruptedException {
		
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//	---------	loginPage.performLogin(userName, password);
//___????		
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage(dashboard);
		dashboardPage.clickOnCustomerMenuBotton();
		dashboardPage.clickOnAddCustomerMenuBotton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddCustomerPage(addCustomer);
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.insertCompany(company);
		addCustomerPage.insertEmail(email);

	}
}
