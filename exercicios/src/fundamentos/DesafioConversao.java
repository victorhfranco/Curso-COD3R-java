package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu primeiro salário: ");
		String sala1 = entrada.nextLine().replace(",", ".");
				
		System.out.println("Digite seu segundo salário: ");
		String sala2 = entrada.nextLine().replace(",", ".");
	
		System.out.println("Digite seu terceiro salário: ");
		String sala3 = entrada.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(sala1);
		double numero2 = Double.parseDouble(sala2);
		double numero3 = Double.parseDouble(sala3);
		
		double soma = numero1 + numero2 + numero3;
		
		System.out.println("A soma do salário é: " + soma);
		System.out.println("A média do salário é: " + soma / 3);
		
		entrada.close();
		
	}
	
}
