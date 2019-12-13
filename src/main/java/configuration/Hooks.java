
package configuration;

import commons.BaseTest;
import commons.CredentialsUsers;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import web.bean.enums.Web;

public class Hooks extends BaseTest {

	@Before(value = "@webSNF")
	public void beforeScenarioWebSNF() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME);
		setUserApplicationUsers(CredentialsUsers.USER_WEB_SNF_QA);
	}

	@Before(value = "@webSAD")
	public void beforeScenarioWebWindows() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME);
		setUserApplicationUsers(CredentialsUsers.USER_WEB_SAD_QA);
	}
	
	@After(value = "@webSNF")
	public void closeDriverSNF(Scenario scenario) {
		generateEvidence(scenario);
		evidenceList.clear();
		closeWeb();
	}

	@After(value = "@webSAD")
	public void closeDriverSAD(Scenario scenario) {
		generateEvidence(scenario);
		evidenceList.clear();
		closeWeb();
	}

}