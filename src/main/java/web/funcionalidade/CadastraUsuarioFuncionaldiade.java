package web.funcionalidade;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commons.BaseTest;
import web.pages.CadastrarUsuarioPage;
import web.pages.LoginPage;

public class CadastraUsuarioFuncionaldiade extends BaseTest {

	private CadastrarUsuarioPage cadastrarUsuario;
	private LoginPage login;

	public CadastraUsuarioFuncionaldiade() {
		this.cadastrarUsuario = new CadastrarUsuarioPage(webDriver);
		this.login = new LoginPage(webDriver);

	}

	public void preencherCampoCriarUsuario(String campo, String valor) {
		WebElement elem = webDriver.findElement(By.xpath("//label[@for='" + campo + "']//parent::div/input"));
		elem.sendKeys(valor);
		addEvidenciaWeb("preenchendo o campo " + campo);
	}

	public void clicarBotaoCadastrar() {
		addEvidenciaWeb("Clicando no botão Cadastrar");
		this.cadastrarUsuario.getBtnCadastrar().click();
	}

	public String retornaMensagem() {
		addEvidenciaWeb("Validando Mensagem Exibida");
		return this.login.getMsgSucesso().getText();
	}
	
	public String retornaMensagemTelaNovoUsuario() {
		addEvidenciaWeb("Validando Mensagem Exibida");
		return this.cadastrarUsuario.getMsg().getText();
	}

	public boolean validarMensagensExistententes(List<String> msg) {
		List<WebElement> lista = this.cadastrarUsuario.getListaMsg();
		List<String> lista1 = new ArrayList<String>();

		for (int i = 0; i < lista.size(); i++) {
			lista1.add(lista.get(i).getText());
		}
		
		addEvidenciaWeb("Validando Mensagem Exibida");
		return lista1.equals(msg);
	}

}
