package web.steps;

import java.util.ArrayList;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import web.funcionalidade.HomeFuncionalidade;
import web.funcionalidade.LoginFuncionalidade;

public class LoginStep {

	private LoginFuncionalidade loginSNF;
	private HomeFuncionalidade home;

	public LoginStep() {
		this.loginSNF = new LoginFuncionalidade();
		this.home = new HomeFuncionalidade();

	}

	@Dado("^que estou no site do Senhor Barriga$")
	public void acessarSiteSenhorBarriga() {
		this.loginSNF.acessarSite();
	}

	@E("^digito o usuario \"([^\"]*)\" e Senha \"([^\"]*)\"$")
	public void digitarUsuarioSenha(String usuario, String senha) {
		this.loginSNF.digitarUsuarioSenha(usuario, senha);
	}

	@E("^clico no botao Entrar$")
	public void clicarBotaoEntrar() {
		this.loginSNF.clicarBtEntrar();

	}

	@Entao("^deve ser apresentado a mensagem \"([^\"]*)\"$")
	public void valdiarMensagemSucesso(String msg) {

		Assert.assertEquals(this.home.msgSucesso(), msg);

	}

	@E("^preencho somente o campo senha com o valor \"([^\"]*)\"$")
	public void preencherSomenteCampo(String valor) {
		this.loginSNF.preencherCampoSenha(valor);

	}

	@Entao("^deve ser apresentado a mensagem \"([^\"]*)\" na tela de login$")
	public void validarMensagemExibidaTelaLogin(String msg) {
		Assert.assertEquals(msg, this.loginSNF.retornaMensagem());

	}

	@E("^preencho somente o campo Email com o valor \"([^\"]*)\"$")
	public void preencherCampoEmail(String email) {
		this.loginSNF.preencherCampoEmail(email);

	}

	@Entao("^deve ser apresentado as mensagens \"([^\"]*)\" e \"([^\"]*)\"$")
	public void validarLoginSemPreencherCampos(String msg1, String msg2) {
		java.util.List<String> lista = new ArrayList<String>();
		lista.add(msg1);
		lista.add(msg2);
		Assert.assertTrue("Lista est� diferente", this.loginSNF.validarMensagensExistententes(lista));

	}

}
