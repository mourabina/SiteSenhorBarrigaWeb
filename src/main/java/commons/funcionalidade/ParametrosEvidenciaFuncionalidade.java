package commons.funcionalidade;

import java.util.Map;

import commons.BaseTest;
import cucumber.api.DataTable;
import web.funcionalidade.LoginFuncionalidade;

public class ParametrosEvidenciaFuncionalidade extends BaseTest {

	private LoginFuncionalidade login;

	public ParametrosEvidenciaFuncionalidade() {
		this.login = new LoginFuncionalidade();
	}

	public void executandoTeste(DataTable params) {

		login.initializeEvidence();

		for (Map<String, String> map : params.asMaps(String.class, String.class)) {
			login.setCtNumber(map.get("Numero do CT"));
			login.setCtName("CT -" + map.get("Numero do CT") + " " + map.get("Nome do CT"));
			login.setTester(map.get("Nome do executor"));
			login.setCiclo(map.get("Sprint"));
		}

	}

}
