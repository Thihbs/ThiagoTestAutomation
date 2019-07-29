package repositories;

import org.openqa.selenium.support.FindBy;

public class RepositoriesAutomation {

	
	@FindBy
	public String XPATH_BTN_SIGNIN = "//a[@class='login'][contains(.,'Sign in')]";
	@FindBy
	public String XPATH_INPUT_EMAIL = "//input[contains(@id,'email_create')]";
	
	@FindBy
	public String XPATH_BTN_Create = "//span[contains(.,'Create an account')]";
	@FindBy
	public String Automation = "​http://automationpractice.com​";
}
