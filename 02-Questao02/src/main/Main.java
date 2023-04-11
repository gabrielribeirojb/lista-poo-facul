package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.ConversorTemperatura;
import exceptions.Excecao;

public class Main {

	public static void main(String[] args) throws Excecao {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite a escala de temperatura: \n" + "1: Celsius \n" + "2: Fahrenheit \n" + "3: Kelvin");

		try {
			Integer escala = sc.nextInt();

			if (escala < 1 || escala > 3) {
				System.out.println("Entrada invalida");

			} else {
				System.out.println("Digite o valor da temperatura desejada: ");
				Double temp = sc.nextDouble();
				
				switch (escala) {
				case 1:
					ConversorTemperatura.celsiusParaOutrosValores(temp);
					break;
				case 2:
					ConversorTemperatura.fahrenheitParaOutrosValores(temp);
					break;
				case 3:
					ConversorTemperatura.kelvinParaOutrosValores(temp);
					break;
				default:
					System.out.println("Entrada inválida");
				}
			}

		} catch (InputMismatchException e) {
			throw new Excecao("Tipo de variavel digitada eh invalido");
		}

	}
}
