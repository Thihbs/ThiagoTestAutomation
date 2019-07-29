package PagesAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import factory.WebDriverFactory;
import repositories.RepositoriesAutomation;
import utils.HighLight;
import utils.SeleniumUtils;

public class PageInicial {
	RepositoriesAutomation reposit = new RepositoriesAutomation();
	static HighLight hl = new HighLight();
	public static void setUrl() {
	
	}
	public  WebElement getBtnSignIn() {
		SeleniumUtils.waitWebElementVisible(reposit.XPATH_BTN_SIGNIN);
		hl.highlightElement(WebDriverFactory.getCurrentRunningDriver(), (WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath(reposit.XPATH_BTN_SIGNIN))));
		return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath(reposit.XPATH_BTN_SIGNIN));
	}
	
	public static WebElement getInputEmail () {
		SeleniumUtils.waitWebElementVisible("//input[contains(@id,'email_create')]");
		hl.highlightElement(WebDriverFactory.getCurrentRunningDriver(), (WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'email_create')]"))));
		return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'email_create')]"));
	}

	public static WebElement getBTNCreate () {
		SeleniumUtils.waitWebElementVisible("//span[contains(.,'Create an account')]");
		hl.highlightElement(WebDriverFactory.getCurrentRunningDriver(), (WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//span[contains(.,'Create an account')]"))));
		return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//span[contains(.,'Create an account')]"));
	}
	
	public static boolean ValidarMensagem () {
		WebElement valida = WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//li[contains(.,'An account using this email address has already been registered. Please enter a valid password or request a new one.')]"));
		if(valida.isDisplayed()) {
			return true;
		}else
		return false;
		
	  
	}
	
		}		
	
	
	
	


