package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
//element
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement ADD_CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")WebElement EMAIL_ELEMENT;
	
	public void verifyAddCustomerPage(String addcustomer) {
		
	
		Assert.assertEquals(ADD_CUSTOMER_MENU_ELEMENT.getText(), addcustomer, "Add Customer pager not found.");
	}
	
	//create method for the fill out form
	public void insertFullName(String fullName) {
		
		FULL_NAME_ELEMENT.sendKeys(fullName + generateRandomNum(9999));
		}	
	

	public void insertCompany(String company) {
		selectFromDropDown(COMPANY_ELEMENT, company);
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNum(9999) + email);
	}

	
}
