package web.funcionalidade;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import commons.BaseTest;
import web.model.Urls;
import web.pages.LoginPage;

public class LoginFuncionalidade extends BaseTest {
	
	private LoginPage login;

	public LoginFuncionalidade() {
		this.login = new LoginPage(webDriver);

	}

	public void acessarSite() {
		webDriver.get(Urls.SENHOR_BARRIGA_WEB);

	}
	
	public void digitarUsuarioSenha(String usuario, String senha) {
		login.getInputEmail().sendKeys(usuario);
		login.getInputSenha().sendKeys(senha);
		addEvidenciaWeb("Digitado Usuario e Senha");
	}
	
	public void clicarBtEntrar() {
		addEvidenciaWeb("Validando Mensagem de Sucesso de Autenticação");
		this.login.getButtonLogin().click();
	}
	
	public void preencherCampoSenha(String senha) {
		addEvidenciaWeb("Digitando informação campo senha");
		login.getInputSenha().sendKeys(senha);
	}
	
	public void preencherCampoEmail(String email) {
		addEvidenciaWeb("Digitando informação campo Email");
		login.getInputEmail().sendKeys(email);
	}
	
	public String retornaMensagem() {
		addEvidenciaWeb("Exibindo Mensagens");
		return this.login.getMsgLogn().getText();
	}
	
	public boolean validarMensagensExistententes(List<String> msg) {
		List<WebElement> lista = this.login.getListaMensagens();
		List<String> lista1 = new ArrayList<String>();
		for(int i = 0 ; i < lista.size(); i++) {
			lista1.add(lista.get(i).getText());
		}
		addEvidenciaWeb("Validando Mensagens");
		return lista1.equals(msg);
	}
	
	public void clicarItemMenuNovoUsuario() {
		this.login.getItemMenuNovoUsuario().click();
	}

}
