package commons.steps;

import commons.funcionalidade.ParametrosEvidenciaFuncionalidade;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;

public class ParametrosEvidenciaSteps {

	private ParametrosEvidenciaFuncionalidade realizandoTesteFuncionalidade;
	
	public ParametrosEvidenciaSteps() {
		this.realizandoTesteFuncionalidade = new ParametrosEvidenciaFuncionalidade();
	}

	@Dado("^estou executando o teste$")
	public void estouExecutandoOTeste(DataTable params) throws Throwable {
		
		System.out.println("Definindo os parametros da evidencia . . .");
		
		
		this.realizandoTesteFuncionalidade.executandoTeste(params);
		
		System.out.println("Parâmetros de evidência ok");
		
	}

}
