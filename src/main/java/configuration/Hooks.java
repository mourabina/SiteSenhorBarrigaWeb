
package configuration;

import commons.BaseTest;
import cucumber.api.java.Before;
import web.bean.enums.Web;

public class Hooks extends BaseTest {

	@Before
	public void iniciaSetup() {
		initializeWebApplication(Web.CHROME);
	}

}