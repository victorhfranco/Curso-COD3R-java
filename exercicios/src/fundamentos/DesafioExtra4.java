package fundamentos;

import java.util.Scanner;

public class DesafioExtra4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor para pot�ncia");
		double ent = entrada.nextDouble();
		
		double ent1 = Math.pow(ent, 2);
		double ent2 = Math.pow(ent, 3);
		
		System.out.println("O valor elevado ao quadrado � " + ent1 + " e elevado ao cubo � " + ent2);
		
		entrada.close();
		
	}
	
}
