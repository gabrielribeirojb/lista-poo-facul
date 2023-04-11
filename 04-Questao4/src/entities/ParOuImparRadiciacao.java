package entities;

public class ParOuImparRadiciacao {
	
	public static void verificaParOuImparImprimeRadiciacao(Integer numero) {
		if(numero % 2 == 0) {
			System.out.println("Raiz quadrada do numero: " + Math.sqrt(numero));
		} else if(numero % 2 != 0) {
			System.out.println("Raiz cubica do numero: " + Math.pow(numero, (1.0/3.0)));
		}
	}
	
}
