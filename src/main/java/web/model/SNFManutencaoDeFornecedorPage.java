package web.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SNFManutencaoDeFornecedorPage {
	
	@FindBy(xpath = "//h2[text()='Manutenção de Fornecedor']")
	private WebElement tutuloPagina;
	
	@FindBy(id ="vendorNbr")
	private WebElement inputCodigoFornecedor;
	
	@FindBy(xpath = "//label[contains(text(),'Tipo Documento')]/ancestor::div[@class='form-group row']//select")
	private WebElement selectTipoDoccumento;
	
	@FindBy(xpath = "//label[contains(text(),'Empresa')]/ancestor::div[@class='form-group row']//select")
	private WebElement selectEmpresa;
	
	@FindBy(xpath = "//label[contains(text(),'Unidade Negócio')]/ancestor::div[@class='form-group row']//select")
	private WebElement selectUnidadeNegocio;
	
	@FindBy(id = "cnpjCpf")
	private WebElement inputCNPJ_CPF;
	
	public SNFManutencaoDeFornecedorPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getTutuloPagina() {
		return tutuloPagina;
	}

	public WebElement getInputCodigoFornecedor() {
		return inputCodigoFornecedor;
	}

	public WebElement getSelectTipoDoccumento() {
		return selectTipoDoccumento;
	}

	public WebElement getSelectEmpresa() {
		return selectEmpresa;
	}

	public WebElement getSelectUnidadeNegocio() {
		return selectUnidadeNegocio;
	}

	public WebElement getInputCNPJ_CPF() {
		return inputCNPJ_CPF;
	}

}
