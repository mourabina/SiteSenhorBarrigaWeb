package web.steps;

import org.junit.Assert;

import com.github.javafaker.Faker;

import commons.funcionalidade.GeradorNumeroRandomico;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import web.funcionalidade.CadastraUsuarioFuncionaldiade;
import web.funcionalidade.LoginFuncionalidade;

public class CadastrarUsuarioStep {

	private CadastraUsuarioFuncionaldiade cadasUsu;
	private LoginFuncionalidade login;

	public CadastrarUsuarioStep() {
		this.cadasUsu = new CadastraUsuarioFuncionaldiade();
		this.login = new LoginFuncionalidade();

	}

	@Dado("^clico no item do menu Novo Usuario\"$")
	public void clicarItemMenuNovoUsuario() {
		this.login.clicarItemMenuNovoUsuario();
	}

	@Dado("^preencho os campos \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\" com os valores validos$")
	public void preencherCamposNovoUsuario(String campo1, String campo2, String campo3) {
		Faker faker = new Faker();
		this.cadasUsu.preencherCampoCriarUsuario(campo1, faker.funnyName().name());
		this.cadasUsu.preencherCampoCriarUsuario(campo2, faker.internet().emailAddress());
		this.cadasUsu.preencherCampoCriarUsuario(campo3, GeradorNumeroRandomico.geraNumeroQtde(5));

	}

	@Quando("^clico no botao Cadastrar$")
	public void clicarBotaoCadsstrar() {
		this.cadasUsu.clicarBotaoCadastrar();

	}

	@Entao("^deve ser apresentado a mensagem \"([^\"]*)\" na tela de Novo Usuario$")
	public void valdiarMensagemExibidaTelaNovoUsuario(String msg) {
		Assert.assertEquals(msg, this.cadasUsu.retornaMensagem());
	}

	@E("^preencho somente os campos \"([^\"]*)\" e \"([^\"]*)\" com os valores \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preencherSomenteCampos(String campo1, String campo2, String valor1, String valor2){
		this.cadasUsu.preencherCampoCriarUsuario(campo1, valor1);
		this.cadasUsu.preencherCampoCriarUsuario(campo2, valor2);
		
	}

	@Entao("^deve ser apresentado a mensagem \"([^\"]*)\" na tela$")
	public void ValdiarObrigatoriedadeCampos(String msg){
		Assert.assertEquals(msg, this.cadasUsu.retornaMensagemTelaNovoUsuario());
		
	}


}
