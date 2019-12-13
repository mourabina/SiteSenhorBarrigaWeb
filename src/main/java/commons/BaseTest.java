package commons;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.AccountCredentialsUsers;
import cucumber.api.Scenario;
import reports.evidence.Evidence;
import reports.evidence.SeleniumEvidence;
import web.bean.interfaces.WebApplication;

public class BaseTest {

	protected static WebDriver webDriver;
	protected static List<SeleniumEvidence> evidenceList = new ArrayList<SeleniumEvidence>();
	protected static WebDriverWait wait;
	protected static WebDriverWait shortWait;
	protected static AccountCredentialsUsers credentialsUsers;
	protected static boolean initialized;

	public static Evidence evidence;

	public void setCtName(String ctName) {
		evidence.setCtName(ctName);
	}

	public void setCiclo(String cycle) {
		evidence.setCiclo(cycle);

	}

	public void setTester(String tester) {
		evidence.setTester(tester);
	}

	public void setCtNumber(String ctNumber) {
		evidence.setCtNumber(ctNumber);
	}

	public void initializeEvidence() {
		BaseTest.evidence = new Evidence(evidenceList);
	}

	/**
	 * Inicializa o {@code WebDriver} e o {@code WebDriverWait}
	 */
	protected void initializeWebApplication(WebApplication webApplication) {
		webDriver = webApplication.getDriver();
		webDriver.manage().window().maximize();
		wait = new WebDriverWait(webDriver, 80);
	}

	/**
	 * Define o usuário da aplicação pelo Gherkin.
	 * 
	 * @param credentialsUsers
	 */
	protected void setUserApplicationUsers(AccountCredentialsUsers credentialsUsers) {

		BaseTest.credentialsUsers = credentialsUsers;
	}

	/**
	 * Método para adicionar na evidência web
	 * 
	 * @param mensagem
	 */
	protected void addEvidenciaWeb(String mensagem) {
		try {
			evidenceList.add(new SeleniumEvidence("RESULTADO OBTIDO: " + mensagem + "", takeScreenshot(webDriver)));
		} catch (Exception e) {
			System.out.println("Erro ao adicionar na evidência: " + e.getMessage());
			e.printStackTrace();
		}

	}

	protected void clearEvidenceList() {
		evidenceList.clear();
	}

	/**
	 * Gera evidência
	 */
	protected void generateEvidence(Scenario scenario) {
		try {
			evidence.generateEvidence(scenario);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Adiciona o erro.
	 * 
	 * @param e
	 */
	protected void setError(Throwable e) {
		evidence.setError(e, webDriver);
	}


	protected static void closeWeb() {
		webDriver.quit();
	}

	/**
	 * tira prints
	 * 
	 * @param driver
	 * @return
	 */
	private String takeScreenshot(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

}
