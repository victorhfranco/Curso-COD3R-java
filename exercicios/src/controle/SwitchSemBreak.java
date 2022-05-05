package controle;

import java.util.Scanner;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual faixa você está no karate? ");
		String faixa = entrada.nextLine();
		
		switch (faixa.toLowerCase()) {
		//sem o break (sai do switch apresenta 
		//todos a baixa caso for a preta
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
//		default:
	//		System.out.println("Não sei nada");
		entrada.close();
		}
		
		int idade = 2;
		
		switch(idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
				
	}

}
