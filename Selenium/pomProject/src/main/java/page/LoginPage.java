package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import util.BrowserFactory;


public class LoginPage extends BasePage{

	WebDriver driver;
	
	//----create bridge from loginTest and loginPage
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	
	//elements- to find element we use @Findby
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON_ELEMENT;
	

	//----Intractable methods
	// call individually the methods/elements
	public void insertUserName (String userName) {
		USERNAME_ELEMENT.sendKeys(userName);		
	}
	public void insertPassword (String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();		
	}

	//combining methods (add some variables in ()
	public void performLogin(String userName, String password) {
		USERNAME_ELEMENT.sendKeys(userName);
		USERNAME_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();

		//BrowserFactory.tearDown();

	}




}
	

