package commons.funcionalidade;

import java.util.Random;

import commons.BaseTest;

public class GeradorNumeroRandomico extends BaseTest {

	public static String retornaNumeroAleatorio() {

		Random rand = new Random();
		int num = rand.nextInt((999999 - 100000) + 1) + 100000;

		return Integer.toString(num);
	}

	public static String retornaSerieAleatorio() {

		Random rand = new Random();
		int serie = rand.nextInt(1);
		return Integer.toString(serie);
	}
	
	public static String geraNumeroQtde(int qtde) {
		Random rand = new Random();
		String nbr = "";
		do {
			int i = rand.nextInt(9);
			nbr = nbr.concat(Integer.toString(i));
		}while(String.valueOf(nbr).length() != qtde);
		return nbr;
	}
}
