package entities;

public class Calculadora {

	
	public static void calculaSoma(Double a, Double b) {
		double soma = a + b;
		System.out.println("Soma dos numeros: " +  soma);
	}
	
	public static void calculaSubtracao(Double a, Double b) {
		double sub = a + b;
		System.out.println("Subtracao dos numeros: " +  sub);
	}
	
	public static void calculaDiv(Double a, Double b) {
		double div = a / b;
		System.out.println("Divisao dos numeros: " +  div);
	}
	
	public static void calculaMult(Double a, Double b) {
		double mult = a + b;
		System.out.println("Multiplicacao dos numeros: " +  mult);
	}
	
	public static void calculaPotencia(Double a, double b) {
		double pot = Math.pow(a, b);
		System.out.println("Potencia dos numeros: " +  pot);
	}
	
	public static void calculaRaizQuadrada(Double a, double b) {
		System.out.println("Raiz quadrada do primeiro numero: " + Math.sqrt(a));
		System.out.println("Raiz quadrada do segundo numero: " + Math.sqrt(b));
	}
	
	public static void calculaRaizCubica(Double a, double b) {
		System.out.println("Raiz cubica do primeiro numero: " +Math.pow(a, (1.0 / 3.0)));
		System.out.println("Raiz cubica do segundo numero: " + Math.pow(b, (1.0 / 3.0)));
	}
	
	public static void todasAsOperacoes(Double a, Double b) {
		Calculadora.calculaSoma(a, b);
		Calculadora.calculaSubtracao(a, b);
		Calculadora.calculaDiv(a, b);
		Calculadora.calculaMult(a, b);
		Calculadora.calculaRaizQuadrada(a, b);
		Calculadora.calculaRaizCubica(a, b);
	}
}
