package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement megSucesso;

	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getMegSucesso() {
		return megSucesso;
	}

}
