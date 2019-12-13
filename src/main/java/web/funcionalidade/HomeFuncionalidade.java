package web.funcionalidade;

import commons.BaseTest;
import web.pages.HomePage;

public class HomeFuncionalidade extends BaseTest {
	
	private HomePage home;
	
	public HomeFuncionalidade() {
		this.home = new HomePage(webDriver);
	}
	
	public String msgSucesso() {
		return this.home.getMegSucesso().getText();
	}

}
