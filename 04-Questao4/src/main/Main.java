package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.ParOuImparRadiciacao;
import exceptions.Excecao;

public class Main {

	public static void main(String[] args) throws Excecao {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um numero inteiro: ");

		try {
			Integer numero = sc.nextInt();

			ParOuImparRadiciacao.verificaParOuImparImprimeRadiciacao(numero);
			
		} catch (InputMismatchException e) {
			throw new Excecao("Tipo de variavel digitada eh invalido");
		}
	}

}
