package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Calculadora;
import exceptions.Excecao;

public class Main {

	public static void main(String[] args) throws Excecao {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a operacao que deseja fazer: ");
		System.out.println("1: Adicao \n" + "2: Subtracao \n" + "3: Divisao \n" + "4: Multiplicacao \n"
				+ "5: Raiz quadrada e raiz cubica\n" + "6: Todas as operacoes");

		try {
			Integer operacao = sc.nextInt();

			if (operacao < 0 || operacao > 6) {
				System.out.println("Entrada invalida");
			} else {
				System.out.println("Digite dois numeros: ");

				double a = sc.nextDouble();
				double b = sc.nextDouble();

				switch (operacao) {
				case 1:
					Calculadora.calculaSoma(a, b);
					break;
				case 2:
					Calculadora.calculaSubtracao(a, b);
					break;
				case 3:
					Calculadora.calculaDiv(a, b);
					break;
				case 4:
					Calculadora.calculaMult(a, b);
					break;
				case 5:
					Calculadora.calculaRaizQuadrada(a, b);
					Calculadora.calculaRaizCubica(a, b);
					break;
				case 6:
					Calculadora.todasAsOperacoes(a, b);
					break;
				default:
					System.out.println("Entrada invalida da operacao");
					break;
				}

			}
		}

		catch (InputMismatchException e) {
			throw new Excecao("Tipo errado");
		}

	}

}
