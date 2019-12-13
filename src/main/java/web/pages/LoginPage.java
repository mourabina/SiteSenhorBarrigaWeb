package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "senha")
	private WebElement inputSenha;

	@FindBy(id = "email")
	private WebElement inputEmail;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement buttonLogin;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement msgLogn;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement msgSucesso;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private java.util.List<WebElement> listaMensagens;

	@FindBy(xpath = "//a[text()='Novo usuário?']")
	private WebElement itemMenuNovoUsuario;

	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMsgSucesso() {
		return msgSucesso;
	}

	public WebElement getItemMenuNovoUsuario() {
		return itemMenuNovoUsuario;
	}

	public java.util.List<WebElement> getListaMensagens() {
		return listaMensagens;
	}

	public WebElement getMsgLogn() {
		return msgLogn;
	}

	public WebElement getInputSenha() {
		return inputSenha;
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

}
