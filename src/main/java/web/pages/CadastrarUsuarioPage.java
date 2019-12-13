package web.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastrarUsuarioPage {

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement msg;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private List<WebElement> listaMsg;

	@FindBy(id = "nome")
	private WebElement nomeUsuario;

	@FindBy(id = "email")
	private WebElement emailUsuario;

	@FindBy(id = "senha")
	private WebElement senhaUsuario;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement btnCadastrar;

	public CadastrarUsuarioPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMsg() {
		return msg;
	}

	public List<WebElement> getListaMsg() {
		return listaMsg;
	}

	public WebElement getNomeUsuario() {
		return nomeUsuario;
	}

	public WebElement getEmailUsuario() {
		return emailUsuario;
	}

	public WebElement getSenhaUsuario() {
		return senhaUsuario;
	}

	public WebElement getBtnCadastrar() {
		return btnCadastrar;
	}

}
