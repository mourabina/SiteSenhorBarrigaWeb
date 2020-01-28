
package configuration;


import commons.BaseTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import web.bean.enums.Web;

public class Hooks extends BaseTest {

	@Before
	public void iniciaSetup() {
		initializeWebApplication(Web.CHROME);
	}

	
	@After
	public void closeWebDriver(Scenario scenario) {
		generateEvidence(scenario);
		evidenceList.clear();
		closeWeb();
	}
}