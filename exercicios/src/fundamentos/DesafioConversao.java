package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu primeiro sal�rio: ");
		String sala1 = entrada.nextLine().replace(",", ".");
				
		System.out.println("Digite seu segundo sal�rio: ");
		String sala2 = entrada.nextLine().replace(",", ".");
	
		System.out.println("Digite seu terceiro sal�rio: ");
		String sala3 = entrada.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(sala1);
		double numero2 = Double.parseDouble(sala2);
		double numero3 = Double.parseDouble(sala3);
		
		double soma = numero1 + numero2 + numero3;
		
		System.out.println("A soma do sal�rio �: " + soma);
		System.out.println("A m�dia do sal�rio �: " + soma / 3);
		
		entrada.close();
		
	}
	
}
