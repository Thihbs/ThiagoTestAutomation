package steps;

import java.util.Random;

import org.junit.Assert;

import PagesAutomation.PageCadastro;
import PagesAutomation.PageInicial;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import factory.WebDriverFactory;
import utils.Generator;

public class AutomationSteps {
	PageInicial Pageinicial = new PageInicial();
	PageCadastro PageCadastro = new PageCadastro();

	@Dado("que eu acessei a home page da Automationpractice")
	public void queEuAcesseiAHomePageDaAutomationpractice() {
		Hooks.setUp();
		Generator.CRMCOVER();
	}

	@Quando("eu clicar na opção de menu “SignIn” e preencher o email com (.*)")
	public void euClicarNaOpçãoDeMenuSignInEPreencherOTionooahGmailCom(String email) throws InterruptedException {
		Random rand = new Random();
		int result = rand.nextInt(999999);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		Pageinicial.getBtnSignIn().click();
		PageInicial.getInputEmail().sendKeys(result + email);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		Pageinicial.getBTNCreate().click();
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());

	}

	@Quando("preencher os campos sexo com (.*) ,nome com (.*),Sobrenome (.*),e senha (.*)")
	public void PreencherosCamposParaCadastro(String sexo, String Nome, String sobrenome, String senha) {
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.getSexo(sexo);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendNome().sendKeys(Nome);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendSobrenome().sendKeys(sobrenome);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendpassword().sendKeys(senha);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
	}

	@Quando("o campo dia com (.*) ,o mes com (.*) e o ano com (.*)")
	public void CamposDate(String dia, String mes, String ano) {
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.selectDays(dia);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.selectMes(mes);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.selectAno(ano);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.escolherRandomComboBox();
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
	}

	@Quando("o campo compania com (.*) ,endereco com (.*),cidade (.*)estado (.*)")
	public void CamposCadastro(String compania, String endereco, String cidade, String estado) {
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendCompany().sendKeys(compania);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendAddress().sendKeys(endereco);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendCity().sendKeys(cidade);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.selectState(estado);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
	}

	@Quando("o campo zip com (.*),informacao (.*),telefone (.*),celular (.*),email (.*)")
	public void CamposdoCadastro(String zipcode, String other, String telefone, String celular, String emailAlt) {
		PageCadastro.sendZipCode().sendKeys(zipcode);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendInformacaoAdicional().sendKeys(other);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendPhone().sendKeys(telefone);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendMobilePhone().sendKeys(celular);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendEmailAlternativo().clear();
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.sendEmailAlternativo().sendKeys(emailAlt);
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());

	}

	@Quando("clicar no botão Registrar")
	public void ClicarnoBotaoRegistrar() {
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		PageCadastro.BtnRegistrar().click();
	}

	@Entao("validar que o cadastro sera feito com sucesso e feito o login")
	public void ValidarCadastro() {
		Generator.insertPrint(WebDriverFactory.getCurrentRunningDriver());
		Assert.assertEquals(true,PageCadastro.ValidarCadastro());
		Generator.FinishPDF();
	}

}
