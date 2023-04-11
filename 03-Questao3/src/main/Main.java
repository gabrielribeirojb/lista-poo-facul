package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.AnalisadorNomes;
import exceptions.Excecao;

public class Main {

	public static void main(String[] args) throws Excecao {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome e sobrenome");

		try {
			String nomeESobrenome = sc.nextLine();
			AnalisadorNomes.analisaNome(nomeESobrenome);

		} catch (InputMismatchException e) {
			throw new Excecao("Tipo de variavel digitada eh invalido");
		}
	}

}
