package PagesAutomation;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import factory.WebDriverFactory;
import utils.HighLight;

public class PageCadastro {
	static HighLight hl = new HighLight();
	
	public static  void getSexo(String sexo) {
		switch (sexo) {
		case "Mr.":
			WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'id_gender1')]")).click();
			break;
		case "Mrs.":
			WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'id_gender2')]")).click();
			break;
		}
		
	}
	
	public  WebElement sendNome() {
		hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='customer_firstname']")));
		return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='customer_firstname']"));
	}
	
	public  WebElement sendSobrenome() {
		hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='customer_lastname']")));
		return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='customer_lastname']"));
	}
	
	
	public  WebElement sendpassword() {
		hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'passwd')]")));
		return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'passwd')]"));
	}
	
	
	public void selectDays(String dia) {
		hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//select[@id='days']")));
		Select dropdown = new Select(WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//select[@id='days']")));
		dropdown.selectByValue(dia);
	}
	
	public void selectMes(String mes) {
		hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//select[@id='months']")));
		Select dropdown = new Select(WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//select[@id='months']")));
		dropdown.selectByValue(mes);
	}
	
	public void selectAno(String ano) {
		hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//select[@id='years']")));
		Select dropdown = new Select(WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//select[@id='years']")));
		dropdown.selectByValue(ano);
	}
	
	
	public static void escolherRandomComboBox() {
		Random rand = new Random();
		int result = rand.nextInt(3);
		System.out.println(">>>>>> " + result);
		
		switch (result) {
		case 0:
			WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='newsletter']")).click();
			break;

		case 1:
			WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'optin')]")).click();
			break;
		case 2:
			WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='newsletter']")).click();
			WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'optin')]")).click();
			break;


		}
		
	}
		public WebElement sendCompany() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'company')]")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[contains(@id,'company')]"));
		}
		public WebElement sendAddress() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='address1']")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='address1']"));
		}
		
		public WebElement sendCity() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='city']")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='city']"));
		}
		
		public void selectState(String state) {
			Select dropdown = new Select(WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//select[@id='id_state']")));
			dropdown.selectByVisibleText(state);
		}
		
		public WebElement sendZipCode() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='postcode']")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='postcode']"));
		}
		public WebElement sendInformacaoAdicional() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//textarea[@id='other']")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//textarea[@id='other']"));
		}
		
		public WebElement sendPhone() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='phone']")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='phone']"));
		}
		public WebElement sendMobilePhone() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='phone_mobile']")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='phone_mobile']"));
		}
		
		public WebElement sendEmailAlternativo() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='alias']")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//input[@id='alias']"));
		}
		
		public WebElement BtnRegistrar() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//span[contains(.,'Register')]")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//span[contains(.,'Register')]"));
		}
		
		public static WebElement getHeader() {
			hl.highlightElement( WebDriverFactory.getCurrentRunningDriver(), WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//*[@id='header']//span")));
			return WebDriverFactory.getCurrentRunningDriver().findElement(By.xpath("//*[@id='header']//span"));
		}
		
		public static boolean ValidarCadastro() {
		if(getHeader().isDisplayed()) {
		    System.out.println("Cadastro realizado com sucesso");
			return true;
			
		}else
			System.out.println("Erro não foi feito o cadastro");
		return false;
		}
}
