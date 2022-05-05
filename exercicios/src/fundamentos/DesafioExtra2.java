package fundamentos;

import java.util.Scanner;

public class DesafioExtra2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Celsius para ser convertido: ");
		double ent1 = entrada.nextDouble();
		
		double conversao = ent1 * 1.8 + 32;
		
		System.out.println("Valor em Celsius: " + conversao);
		
		entrada.close();
	}
	
}
	
