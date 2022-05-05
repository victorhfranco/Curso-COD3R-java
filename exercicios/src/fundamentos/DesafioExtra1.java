package fundamentos;

import java.util.Scanner;

public class DesafioExtra1 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Fahrenheit para ser convertido: ");
		double ent1 = entrada.nextDouble();
	
		// (°F - 32) x 5/9 = °C
		
		final double ajuste = 32;
		final double fator = 5.0/9.0;
						
		double celsius = (ent1 - ajuste) * fator;
						
		
		System.out.println("O resultado da temperatura é " + celsius + "°C");
		
		entrada.close();
	}
	
}
