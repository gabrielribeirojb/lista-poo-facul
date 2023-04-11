package entities;

public class AnalisadorNomes {

	public static void analisaNome(String nomeESobrenome) {
		String[] nomeCompletoArray = nomeESobrenome.split(" ");
		String nome = nomeCompletoArray[0];
		String sobrenome = nomeCompletoArray[1];
		
		if(sobrenome.equals("Wayne")) {
			System.out.println("Acesso liberado, Sr. Wayne");
		}
		
		if(sobrenome.equals("Kent")) {
			System.out.println("Saí daí, mané!");
		}
		
		if(nome.equals("Diana")) {
			System.out.println("Bem-vinda, Princesa de Themyscara");
		}
		
		if(!sobrenome.equals("Wayne") && !sobrenome.equals("Kent") && !nome.equals("Diana")) {
			System.out.println("Cai fora!");
		}
		
	}
}
